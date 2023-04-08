package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValetinhoEntrada {

	private JFrame frame;
	private JTextField placa;
	private JTextField vaga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoEntrada window = new ValetinhoEntrada();
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
	public ValetinhoEntrada() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Entrada");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("Entrada de carro");
		titulo.setForeground(new Color(34, 139, 34));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		titulo.setBounds(91, 32, 252, 31);
		frame.getContentPane().add(titulo);
		
		JLabel lblplaca = new JLabel("Placa do carro:");
		lblplaca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblplaca.setBounds(107, 86, 139, 19);
		frame.getContentPane().add(lblplaca);
		
		JLabel lblvaga = new JLabel("Vaga desejada:");
		lblvaga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblvaga.setBounds(107, 116, 139, 19);
		frame.getContentPane().add(lblvaga);
		
		placa = new JTextField();
		placa.setBounds(228, 87, 101, 20);
		frame.getContentPane().add(placa);
		placa.setColumns(10);
		
		vaga = new JTextField();
		vaga.setColumns(10);
		vaga.setBounds(228, 117, 101, 20);
		frame.getContentPane().add(vaga);
		
		JButton btnentrar = new JButton("Entrar");
		btnentrar.setBackground(SystemColor.scrollbar);
		btnentrar.setBounds(121, 164, 89, 23);
		frame.getContentPane().add(btnentrar);
		
		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnvoltar.setBackground(SystemColor.scrollbar);
		btnvoltar.setBounds(220, 164, 89, 23);
		frame.getContentPane().add(btnvoltar);
		
		JLabel resultado = new JLabel("o resultado vai estar aqui");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(91, 198, 233, 52);
		frame.getContentPane().add(resultado);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
