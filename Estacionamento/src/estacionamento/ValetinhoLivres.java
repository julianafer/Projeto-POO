package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValetinhoLivres {

	private JFrame frame;
	private Estacionamento estacionamento;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoLivres window = new ValetinhoLivres();
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
	public ValetinhoLivres(Estacionamento estacionamento) {
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

		JLabel titulo = new JLabel("Listagem de vagas livres");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		titulo.setBounds(67, 28, 298, 31);
		frame.getContentPane().add(titulo);

		JLabel resultado = new JLabel("a lista fica aqui");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(67, 70, 288, 129);
		frame.getContentPane().add(resultado);

		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnvoltar.setBackground(SystemColor.scrollbar);
		btnvoltar.setBounds(173, 212, 89, 23);
		frame.getContentPane().add(btnvoltar);
		frame.setTitle("Listagem de vagas livres");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}