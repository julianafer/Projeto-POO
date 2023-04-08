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

public class ValetinhoSaida {

	private JFrame frame;
	private JTextField vaga;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public ValetinhoSaida() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Saída");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("Saída de carro");
		titulo.setForeground(new Color(165, 42, 42));
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
		
		JButton btnsair = new JButton("Sair");
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
		
		JLabel resultado = new JLabel("o resultado vai estar aqui");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(89, 198, 233, 52);
		frame.getContentPane().add(resultado);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
