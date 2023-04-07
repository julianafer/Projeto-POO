package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class Transferencia {

	private JFrame frmTransfernciaDePlaca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transferencia window = new Transferencia();
					window.frmTransfernciaDePlaca.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Transferencia() {
		initialize();
		frmTransfernciaDePlaca.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTransfernciaDePlaca = new JFrame();
		frmTransfernciaDePlaca.getContentPane().setBackground(Color.WHITE);
		frmTransfernciaDePlaca.setTitle("Transferência de Placa");
		frmTransfernciaDePlaca.setBounds(100, 100, 450, 300);
		frmTransfernciaDePlaca.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
