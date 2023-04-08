package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Valetinho {

	private JFrame frame;
	private Estacionamento estacionamento;
	private JTextField placaEnt;
	private JTextField vagaEnt;
	private JTextField vagaSai;
	private JTextField placaCon;
	private JTextField origemTra;
	private JTextField destinoTra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valetinho window = new Valetinho();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Valetinho() {
		initialize();
		frame.setVisible(true);
		try {
			estacionamento = new Estacionamento(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Valetinho");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("Estacinamento Car-Tchau");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		titulo.setBounds(126, 25, 367, 53);
		frame.getContentPane().add(titulo);
		
		JLabel subtitulo = new JLabel("10 vagas - Escolha sua opção");
		subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		subtitulo.setBounds(189, 71, 228, 31);
		frame.getContentPane().add(subtitulo);
		
		JButton btnsair = new JButton("Sair");
		btnsair.setBackground(new Color(233, 150, 122));
		btnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnsair.setBounds(254, 538, 100, 23);
		frame.getContentPane().add(btnsair);
		
		JLabel lblNewLabel = new JLabel("Entrada de carro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(237, 130, 124, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Placa:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(126, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		placaEnt = new JTextField();
		placaEnt.setBounds(170, 155, 86, 20);
		frame.getContentPane().add(placaEnt);
		placaEnt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Vaga:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(266, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		vagaEnt = new JTextField();
		vagaEnt.setColumns(10);
		vagaEnt.setBounds(304, 156, 86, 20);
		frame.getContentPane().add(vagaEnt);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String placa = placaEnt.getText();
				Integer vaga = Integer.parseInt(vagaEnt.getText());
				try {
					estacionamento.entrar(placa, vaga);
					JLabel resultado = new JLabel("Carro " + placa + " entrou na vaga " + vaga);
					resultado.setHorizontalAlignment(SwingConstants.CENTER);
					resultado.setBounds(42, 572, 521, 76);
					resultado.setForeground(Color.GREEN);
					frame.getContentPane().add(resultado);
				} catch (Exception e1) {
					JLabel resultado = new JLabel(e1.getMessage());
					resultado.setHorizontalAlignment(SwingConstants.CENTER);
					resultado.setBounds(42, 572, 521, 76);
					resultado.setForeground(Color.RED);
					frame.getContentPane().add(resultado);
				}
			}
		});
		btnEntrar.setBackground(SystemColor.scrollbar);
		btnEntrar.setBounds(400, 154, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JLabel lblSadaDeCarro = new JLabel("Saída de carro");
		lblSadaDeCarro.setHorizontalAlignment(SwingConstants.CENTER);
		lblSadaDeCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSadaDeCarro.setBounds(237, 192, 124, 14);
		frame.getContentPane().add(lblSadaDeCarro);
		
		JLabel lblNewLabel_2_1 = new JLabel("Vaga:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(126, 221, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		vagaSai = new JTextField();
		vagaSai.setColumns(10);
		vagaSai.setBounds(170, 219, 220, 20);
		frame.getContentPane().add(vagaSai);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(SystemColor.scrollbar);
		btnSair.setBounds(400, 218, 89, 23);
		frame.getContentPane().add(btnSair);
		
		JLabel lblConsultaDePlaca = new JLabel("Consulta de placa");
		lblConsultaDePlaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaDePlaca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConsultaDePlaca.setBounds(237, 255, 124, 21);
		frame.getContentPane().add(lblConsultaDePlaca);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Placa:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(126, 287, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		placaCon = new JTextField();
		placaCon.setColumns(10);
		placaCon.setBounds(170, 285, 220, 20);
		frame.getContentPane().add(placaCon);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(SystemColor.scrollbar);
		btnConsultar.setBounds(400, 284, 89, 23);
		frame.getContentPane().add(btnConsultar);
		
		JLabel lblTransfernciaDePlaca = new JLabel("Transferência de placa");
		lblTransfernciaDePlaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransfernciaDePlaca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTransfernciaDePlaca.setBounds(211, 317, 171, 23);
		frame.getContentPane().add(lblTransfernciaDePlaca);
		
		JLabel lblNewLabel_1_1 = new JLabel("Origem:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(126, 350, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		origemTra = new JTextField();
		origemTra.setColumns(10);
		origemTra.setBounds(178, 348, 78, 20);
		frame.getContentPane().add(origemTra);
		
		JLabel lblNewLabel_2_2 = new JLabel("Destino:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(266, 350, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		destinoTra = new JTextField();
		destinoTra.setColumns(10);
		destinoTra.setBounds(319, 348, 71, 20);
		frame.getContentPane().add(destinoTra);
		
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.setBackground(SystemColor.scrollbar);
		btnTransferir.setBounds(400, 347, 89, 23);
		frame.getContentPane().add(btnTransferir);
		
		JLabel lblListagemGeralDe = new JLabel("Listagem geral de vagas");
		lblListagemGeralDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblListagemGeralDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblListagemGeralDe.setBounds(189, 388, 211, 21);
		frame.getContentPane().add(lblListagemGeralDe);
		
		JButton btnListarGeral = new JButton("Listar");
		btnListarGeral.setBackground(SystemColor.scrollbar);
		btnListarGeral.setBounds(126, 420, 363, 23);
		frame.getContentPane().add(btnListarGeral);
		
		JLabel lblListagemDeVagas = new JLabel("Listagem de vagas livres");
		lblListagemDeVagas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListagemDeVagas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblListagemDeVagas.setBounds(189, 460, 211, 21);
		frame.getContentPane().add(lblListagemDeVagas);
		
		JButton btnListarLivres = new JButton("Listar");
		btnListarLivres.setBackground(SystemColor.scrollbar);
		btnListarLivres.setBounds(126, 492, 363, 23);
		frame.getContentPane().add(btnListarLivres);

		frame.setBounds(100, 100, 617, 711);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}
