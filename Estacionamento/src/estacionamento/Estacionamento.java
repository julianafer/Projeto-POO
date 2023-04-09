package estacionamento;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Estacionamento {

    private String[] placas;

    public Estacionamento(int n) throws Exception {
        if (n <= 0) {
            throw new Exception("Quantidade inválida");
        }
        placas = new String[n];
        for (int i = 0; i < n; i++) {
            placas[i] = "Livre";
        }
    }

    public void entrar(String placa, int vaga) throws Exception {
        if (vaga < 1 || vaga > placas.length) {
            throw new Exception("Vaga inexistente");
        }
        if (!placas[vaga - 1].equals("Livre")) {
            throw new Exception("Vaga já está ocupada");
        }
        placas[vaga - 1] = placa;
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        try {
            FileWriter writer = new FileWriter(new File("historico.csv"), true);
            writer.write(data.format(f) + ";" + vaga + ";" + placa + ";entrada\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo historico.csv");
        }
    }

    public void sair(int vaga) throws Exception {
        if (vaga < 1 || vaga > placas.length) {
            throw new Exception("Vaga inexistente");
        }
        if (placas[vaga - 1].equals("Livre")) {
            throw new Exception("Vaga já está desocupada");
        }
        String placa = placas[vaga - 1];
        placas[vaga - 1] = "Livre";
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        try {
            FileWriter writer = new FileWriter(new File("historico.csv"), true);
            writer.write(data.format(f) + ";" + vaga + ";" + placa + ";saida\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo historico.csv");
        }
    }

    public int consultarPlaca(String placa) {
        for (int i = 0; i < placas.length; i++) {
            if (placas[i].equals(placa)) {
                return i + 1;
            }
        }
        return -1;
    }

    public void transferir(int vaga1, int vaga2) throws Exception {
        if (vaga1 < 1 || vaga1 > placas.length) 
            throw new Exception("Primeira vaga inválida");
        if (vaga2 < 1 || vaga2 > placas.length) 
            throw new Exception("Segunda vaga inválida");
        //if (vaga1 == vaga2)
        //	throw new Exception("Nao se pode transferir na mesma vaga");
        String auxiliar = placas[vaga1 - 1];
        placas[vaga1 - 1] = placas[vaga2 - 1];
        placas[vaga2 - 1] = auxiliar;
    }

    public String[] listarGeral() {
        return placas;
    }

    public ArrayList<Integer> listarLivres() {
        ArrayList<Integer> livres = new ArrayList<>();
        for (int i = 0; i < placas.length; i++) {
            if (placas[i].equals("Livre")) {
                livres.add(i + 1);
            }
        }
        return livres;
    }

    public void gravarDados() {
        try {
            FileWriter writer = new FileWriter("placas.csv");
            for (int i = 0; i < placas.length; i++) {
                if (!placas[i].equals("Livre")) {
                	int vaga = i + 1;
                    writer.write(vaga + ";" + placas[i] + "\n");
                }
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo placas.csv");
        }
    }

    public void lerDados() {
    	Scanner arquivo = null;
    	try {
    		arquivo = new Scanner(new File("placas.csv"));
    	}
    	catch (Exception e) {
    		System.out.println("Arquivo não encontrado");
    		System.exit(0);
    	}
    	while (arquivo.hasNextLine()) {
    		String linha = arquivo.nextLine();
    		String[] partes = linha.split(";");
    		int vaga = Integer.parseInt(partes[0]);
    		String placa = partes[1];
    		System.out.println("Vaga " + vaga + " - " + placa);
    	}
    	arquivo.close();
    }
}
