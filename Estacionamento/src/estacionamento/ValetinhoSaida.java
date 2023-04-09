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
import java.awt.Dimension;

public class ValetinhoSaida {

	private JFrame frame;
	private JTextField vaga;
	private Estacionamento estacionamento;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoSaida window = new ValetinhoSaida();
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
	public ValetinhoSaida(Estacionamento estacionamento) {
		initialize();
		frame.setVisible(true);
		this.estacionamento = estacionamento;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Saída");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setSize(new Dimension(450, 300));

		JLabel titulo = new JLabel("Saída de carro");
		titulo.setForeground(Color.red);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		titulo.setBounds(89, 32, 252, 31);
		frame.getContentPane().add(titulo);

		JLabel lblvaga = new JLabel("Vaga do carro:");
		lblvaga.setHorizontalAlignment(SwingConstants.CENTER);
		lblvaga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblvaga.setBounds(136, 87, 139, 19);
		frame.getContentPane().add(lblvaga);

		vaga = new JTextField();
		vaga.setColumns(10);
		vaga.setBounds(157, 117, 101, 20);
		frame.getContentPane().add(vaga);
		
		JLabel resultadoCerto = new JLabel();
		JLabel resultadoErrado = new JLabel();

		JButton btnsair = new JButton("Sair");
		btnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Integer v = Integer.parseInt(vaga.getText());
				
				resultadoCerto.setHorizontalAlignment(SwingConstants.CENTER);
				resultadoCerto.setBounds(91, 209, 233, 19);
				frame.getContentPane().add(resultadoCerto);
				
				resultadoErrado.setForeground(Color.RED);
				resultadoErrado.setHorizontalAlignment(SwingConstants.CENTER);
				resultadoErrado.setBounds(91, 220, 233, 19);
				frame.getContentPane().add(resultadoErrado);
				
				try {
					estacionamento.sair(v);
					resultadoCerto.setText("Vaga " + v + " livre");
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
		btnsair.setBackground(SystemColor.scrollbar);
		btnsair.setBounds(119, 164, 89, 23);
		frame.getContentPane().add(btnsair);

		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnvoltar.setBackground(SystemColor.scrollbar);
		btnvoltar.setBounds(218, 164, 89, 23);
		frame.getContentPane().add(btnvoltar);

	}

}