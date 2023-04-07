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
        lerDados();
    }

    public void entrar(String placa, int vaga) throws Exception {
        if (vaga < 1 || vaga > placas.length) {
            throw new Exception("Vaga inexistente");
        }
        if (!placas[vaga].equals("Livre")) {
            throw new Exception("Vaga já está ocupada");
        }
        placas[vaga - 1] = placa;
        LocalDateTime data = LocalDateTime.now();
        try {
            FileWriter writer = new FileWriter("historico.csv", true);
            writer.write(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + ";" + vaga + ";" + placa
                    + ";entrada\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo historico.csv");
            e.printStackTrace();
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
        try {
            FileWriter writer = new FileWriter("historico.csv", true);
            writer.write(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + ";" + vaga + ";" + placa
                    + ";saida\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo historico.csv");
            e.printStackTrace();
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
        if (vaga1 < 1 || vaga1 > placas.length) {
            throw new Exception("Primeira vaga inválida");
        }
        if (vaga2 < 1 || vaga2 > placas.length) {
            throw new Exception("Segunda vaga inválida");
        }
        String auxiliar = placas[vaga1 - 1];
        placas[vaga1 - 1] = placas[vaga2 - 1];
        placas[vaga2 - 1] = auxiliar;
        gravarDados();
    }

    public String[] listarGeral() {
        String[] lista = new String[placas.length];
        for (int i = 0; i < placas.length; i++) {
            lista[i] = (!placas[i].equals("Livre")) ? placas[i] : "Livre";
        }
        return lista;
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
                if (placas[i] != null) {
                    writer.write((i + 1) + ";" + placas[i] + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo placas.csv");
            e.printStackTrace();
        }
    }

    public void lerDados() {
        try {
            File file = new File("placas.csv");
            if (!file.exists()) {
                System.out.println("Arquivo placas.csv não encontrado.");
                return;
            }

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length != 2) {
                    System.out.println("Formato inválido de linha: " + line);
                    continue;
                }
                int vaga = Integer.parseInt(parts[0]) - 1;
                String placa = parts[1];
                placas[vaga] = placa;
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo placas.csv");
            e.printStackTrace();
        }
    }

}
