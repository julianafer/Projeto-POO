package estacionamento;

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

public class ValetinhoEntrada {

	private JFrame frame;
	private Estacionamento estacionamento;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoEntrada window = new ValetinhoEntrada(getEstacionamento());
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
	public ValetinhoEntrada(Estacionamento estacionamento) {
		initialize();
		frame.setVisible(true);
		this.estacionamento = estacionamento;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Valetinho");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		JLabel titulo = new JLabel("Entrada de carro");
		titulo.setForeground(new Color(154, 205, 50));
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

		JTextField placa = new JTextField();
		placa.setBounds(228, 87, 101, 20);
		frame.getContentPane().add(placa);
		placa.setColumns(10);

		JTextField vaga = new JTextField();
		vaga.setColumns(10);
		vaga.setBounds(228, 117, 101, 20);
		frame.getContentPane().add(vaga);
		
		JLabel resultadoCerto = new JLabel();
		JLabel resultadoErrado = new JLabel();
		
		JButton btnentrar = new JButton("Entrar");
		btnentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String p = placa.getText();
				Integer v = Integer.parseInt(vaga.getText());
				
				resultadoCerto.setHorizontalAlignment(SwingConstants.CENTER);
				resultadoCerto.setBounds(91, 209, 233, 19);
				frame.getContentPane().add(resultadoCerto);
				
				resultadoErrado.setForeground(Color.RED);
				resultadoErrado.setHorizontalAlignment(SwingConstants.CENTER);
				resultadoErrado.setBounds(91, 220, 233, 19);
				frame.getContentPane().add(resultadoErrado);
				try {
					estacionamento.entrar(p, v);
					resultadoCerto.setText("Carro " + p + " estacionado na vaga " + v);
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

		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}