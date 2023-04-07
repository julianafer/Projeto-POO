package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class Saida {

	private JFrame frmSada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saida window = new Saida();
					window.frmSada.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Saida() {
		initialize();
		frmSada.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSada = new JFrame();
		frmSada.setTitle("Saída");
		frmSada.getContentPane().setBackground(Color.WHITE);
		frmSada.setBounds(100, 100, 450, 300);
		frmSada.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
