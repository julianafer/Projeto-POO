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

public class ValetinhoConsulta {

	private JFrame frame;
	private JTextField placa;
	private Estacionamento estacionamento;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoConsulta window = new ValetinhoConsulta();
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
	public ValetinhoConsulta(Estacionamento estacionamento) {
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

		JLabel titulo = new JLabel("Consulta de placa");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		titulo.setBounds(90, 32, 252, 31);
		frame.getContentPane().add(titulo);

		JLabel lblplaca = new JLabel("Placa para consultar:");
		lblplaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblplaca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblplaca.setBounds(137, 87, 139, 19);
		frame.getContentPane().add(lblplaca);

		placa = new JTextField();
		placa.setColumns(10);
		placa.setBounds(158, 117, 101, 20);
		frame.getContentPane().add(placa);
		
		JLabel resultado = new JLabel();

		JButton btnconsultar = new JButton("Consultar");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String p = placa.getText();
				
				resultado.setHorizontalAlignment(SwingConstants.CENTER);
				resultado.setBounds(91, 209, 233, 19);
				frame.getContentPane().add(resultado);
				
				resultado.setText("Placa " + p + " está na vaga " + estacionamento.consultarPlaca(p));
				resultado.setForeground(Color.black);
				
			}
		});
		btnconsultar.setBackground(SystemColor.scrollbar);
		btnconsultar.setBounds(120, 164, 89, 23);
		frame.getContentPane().add(btnconsultar);

		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnvoltar.setBackground(SystemColor.scrollbar);
		btnvoltar.setBounds(219, 164, 89, 23);
		frame.getContentPane().add(btnvoltar);
		frame.setTitle("Consulta de Placa");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}