package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValetinhoTransferencia {

	private JFrame frame;
	private JTextField origem;
	private JTextField destino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoTransferencia window = new ValetinhoTransferencia();
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
	public ValetinhoTransferencia() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("Transferência de placa");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		titulo.setBounds(93, 32, 252, 31);
		frame.getContentPane().add(titulo);
		
		JLabel lblorigem = new JLabel("Vaga origem:");
		lblorigem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblorigem.setBounds(112, 85, 108, 19);
		frame.getContentPane().add(lblorigem);
		
		origem = new JTextField();
		origem.setColumns(10);
		origem.setBounds(213, 85, 101, 20);
		frame.getContentPane().add(origem);
		
		JLabel lbldestino = new JLabel("Vaga destino:");
		lbldestino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbldestino.setBounds(112, 115, 108, 19);
		frame.getContentPane().add(lbldestino);
		
		destino = new JTextField();
		destino.setColumns(10);
		destino.setBounds(213, 115, 101, 20);
		frame.getContentPane().add(destino);
		
		JButton btntransferir = new JButton("Transferir");
		btntransferir.setBackground(SystemColor.scrollbar);
		btntransferir.setBounds(123, 164, 89, 23);
		frame.getContentPane().add(btntransferir);
		
		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnvoltar.setBackground(SystemColor.scrollbar);
		btnvoltar.setBounds(222, 164, 89, 23);
		frame.getContentPane().add(btnvoltar);
		
		JLabel resultado = new JLabel("o resultado vai estar aqui");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(93, 198, 233, 52);
		frame.getContentPane().add(resultado);
		frame.setTitle("Transferência de Placa");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
