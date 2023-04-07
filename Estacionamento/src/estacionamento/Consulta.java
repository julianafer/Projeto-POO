package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class Consulta {

	private JFrame frmConsultaDePlaca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta window = new Consulta();
					window.frmConsultaDePlaca.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Consulta() {
		initialize();
		frmConsultaDePlaca.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsultaDePlaca = new JFrame();
		frmConsultaDePlaca.getContentPane().setBackground(Color.WHITE);
		frmConsultaDePlaca.setTitle("Consulta de Placa");
		frmConsultaDePlaca.setBounds(100, 100, 450, 300);
		frmConsultaDePlaca.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
