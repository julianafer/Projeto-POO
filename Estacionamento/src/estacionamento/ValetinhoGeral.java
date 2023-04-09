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

public class ValetinhoGeral {

	private JFrame frame;
	private Estacionamento estacionamento;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoGeral window = new ValetinhoGeral();
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
	public ValetinhoGeral(Estacionamento estacionamento) {
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

		JLabel titulo = new JLabel("Listagem geral de vagas");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		titulo.setBounds(61, 32, 298, 31);
		frame.getContentPane().add(titulo);

		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnvoltar.setBackground(SystemColor.scrollbar);
		btnvoltar.setBounds(167, 216, 89, 23);
		frame.getContentPane().add(btnvoltar);

		JLabel lista = new JLabel("a lista fica aqui");
		lista.setHorizontalAlignment(SwingConstants.CENTER);
		lista.setBounds(71, 74, 288, 129);
		frame.getContentPane().add(lista);
		
		frame.setTitle("Listagem Geral");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}