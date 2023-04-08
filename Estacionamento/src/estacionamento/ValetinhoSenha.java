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
import java.awt.SystemColor;

public class ValetinhoSenha {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoSenha window = new ValetinhoSenha();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ValetinhoSenha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("Valetinho");
		frame.setBounds(100, 100, 460, 252);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon imagem = new ImageIcon(Valetinho.class.getResource("/imagens/carro.png"));
		
		JLabel lblimg = new JLabel("a imagem fica aqui");
		lblimg.setBounds(196, 35, 225, 140);
		frame.getContentPane().add(lblimg);
		
		imagem.setImage(imagem.getImage().getScaledInstance(
				lblimg.getWidth(), 
				lblimg.getHeight(), 
				Image.SCALE_DEFAULT));
		
		lblimg.setIcon(imagem);
		
		JLabel titulo = new JLabel("Senha");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titulo.setBounds(0, 51, 148, 37);
		frame.getContentPane().add(titulo);
		
		JPasswordField senha = new JPasswordField();
		senha.setBackground(Color.WHITE);
		senha.setBounds(47, 93, 88, 20);
		frame.getContentPane().add(senha);

		JLabel erro = new JLabel("senha incorreta");
		erro.setForeground(Color.WHITE);
		erro.setBounds(47, 158, 101, 14);
		frame.getContentPane().add(erro);
		
		JButton btnNewButton = new JButton("entrar");
		btnNewButton.setBackground(SystemColor.scrollbar);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = new String(senha.getPassword());
				if (texto.equals("ifpb")) {
					Valetinho menu = new Valetinho();
					frame.dispose();
				} else {
					erro.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setBounds(47, 124, 74, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
	
}
