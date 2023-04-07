package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class Livres {

	private JFrame frmListagemDeVagas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Livres window = new Livres();
					window.frmListagemDeVagas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Livres() {
		initialize();
		frmListagemDeVagas.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListagemDeVagas = new JFrame();
		frmListagemDeVagas.getContentPane().setBackground(Color.WHITE);
		frmListagemDeVagas.setTitle("Listagem de vagas livres");
		frmListagemDeVagas.setBounds(100, 100, 450, 300);
		frmListagemDeVagas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
