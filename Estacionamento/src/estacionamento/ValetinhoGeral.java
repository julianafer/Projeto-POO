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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
		titulo.setBounds(61, 28, 298, 31);
		frame.getContentPane().add(titulo);

		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnvoltar.setBackground(SystemColor.scrollbar);
		btnvoltar.setBounds(230, 216, 89, 23);
		frame.getContentPane().add(btnvoltar);
		
		JTextArea textAreaImpar = new JTextArea();
		textAreaImpar.setBounds(92, 92, 122, 83);
		frame.getContentPane().add(textAreaImpar);
		
		JTextArea textAreaPar = new JTextArea();
		textAreaPar.setBounds(234, 92, 135, 83);
		frame.getContentPane().add(textAreaPar);
		
		JButton btListar = new JButton("Listar");
		btListar.setBackground(SystemColor.scrollbar);
		btListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				String[] listaGeral = estacionamento.listarGeral();
				for(String word : listaGeral) {
					i++;
					if (i % 2 == 0) {
						textAreaPar.append("Vaga " + i + ": "+ word + "\n");
					} else {
						textAreaImpar.append("Vaga " + i + ": "+ word + "\n");
					}
				}
			}
		});
		btListar.setBounds(107, 216, 89, 23);
		frame.getContentPane().add(btListar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(49, 70, 331, 127);
		frame.getContentPane().add(panel);
		
		frame.setTitle("Valetinho");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}