package estacionamento;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Valetinho {

	private JFrame frmValetinho;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valetinho window = new Valetinho();
					window.frmValetinho.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Valetinho() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmValetinho = new JFrame();
		frmValetinho.getContentPane().setBackground(Color.WHITE);
		frmValetinho.setTitle("Valetinho");
		frmValetinho.setBounds(100, 100, 460, 252);
		frmValetinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmValetinho.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 51, 148, 37);
		frmValetinho.getContentPane().add(lblNewLabel);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBackground(UIManager.getColor("Button.background"));
		passwordField.setBounds(47, 93, 88, 20);
		frmValetinho.getContentPane().add(passwordField);

		ImageIcon icon = new ImageIcon(Valetinho.class.getResource("/imagens/carro.png"));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(196, 35, 225, 140);
		frmValetinho.getContentPane().add(lblNewLabel_1);
		
		icon.setImage(icon.getImage().getScaledInstance(
				lblNewLabel_1.getWidth(), 
				lblNewLabel_1.getHeight(), 
				Image.SCALE_DEFAULT));
		
		lblNewLabel_1.setIcon(icon);
		
		JLabel lblNewLabel_2 = new JLabel("senha incorreta");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(47, 158, 101, 14);
		frmValetinho.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = new String(passwordField.getPassword());
				if (texto.equals("ifpb")) {
					Valetinho2 tela = new Valetinho2();
					frmValetinho.dispose();
				} else {
					lblNewLabel_2.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setBounds(47, 124, 74, 23);
		frmValetinho.getContentPane().add(btnNewButton);
		
	}
}
