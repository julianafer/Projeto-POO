package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class Entrada {

	private JFrame frmEntrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrada window = new Entrada();
					window.frmEntrada.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Entrada() {
		initialize();
		frmEntrada.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEntrada = new JFrame();
		frmEntrada.setTitle("Entrada");
		frmEntrada.getContentPane().setBackground(Color.WHITE);
		frmEntrada.setBounds(100, 100, 450, 300);
		frmEntrada.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
