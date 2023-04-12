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
	private Estacionamento estacionamento;

	/**
	 * Launch the application.
	 *
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

	**
	 * Create the application.
	 */
	public ValetinhoTransferencia(Estacionamento estacionamento) {
		initialize();
		frame.setVisible(true);
		this.estacionamento = estacionamento;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		JLabel titulo = new JLabel("Transferência de placa");
		titulo.setForeground(new Color(255, 204, 0));
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
		
		JLabel resultadoCerto = new JLabel();
		JLabel resultadoErrado = new JLabel();

		JButton btntransferir = new JButton("Transferir");
		btntransferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Integer o = Integer.parseInt(origem.getText());
				Integer d = Integer.parseInt(destino.getText());
				
				resultadoCerto.setHorizontalAlignment(SwingConstants.CENTER);
				resultadoCerto.setBounds(91, 209, 233, 19);
				frame.getContentPane().add(resultadoCerto);
				
				resultadoErrado.setForeground(Color.RED);
				resultadoErrado.setHorizontalAlignment(SwingConstants.CENTER);
				resultadoErrado.setBounds(91, 220, 233, 19);
				frame.getContentPane().add(resultadoErrado);
				try {
					estacionamento.transferir(o, d);
					resultadoCerto.setText("Vaga " + o + " transferida para vaga " + d);
					resultadoCerto.setForeground(new Color(154, 205, 50));
					resultadoErrado.setForeground(Color.white);
				}
				catch (Exception e) {
					resultadoErrado.setText(e.getMessage());
					resultadoErrado.setForeground(Color.red);
					resultadoCerto.setForeground(Color.white);
				}
			}
		});
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
		frame.setTitle("Valetinho");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}