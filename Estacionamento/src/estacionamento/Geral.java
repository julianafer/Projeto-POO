package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class Geral {

	private JFrame frmListagemGeral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geral window = new Geral();
					window.frmListagemGeral.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Geral() {
		initialize();
		frmListagemGeral.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListagemGeral = new JFrame();
		frmListagemGeral.getContentPane().setBackground(Color.WHITE);
		frmListagemGeral.setTitle("Listagem Geral");
		frmListagemGeral.setBounds(100, 100, 450, 300);
		frmListagemGeral.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
