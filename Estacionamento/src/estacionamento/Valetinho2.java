package estacionamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Valetinho2 {

	private JFrame frmValetinho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valetinho2 window = new Valetinho2();
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
	public Valetinho2() {
		initialize();
		frmValetinho.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmValetinho = new JFrame();
		frmValetinho.setTitle("Valetinho");
		frmValetinho.getContentPane().setBackground(Color.WHITE);
		frmValetinho.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estacinamento Car-Tchau");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(38, 36, 367, 74);
		frmValetinho.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Entrada");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entrada tela = new Entrada();
			}
		});
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(126, 147, 183, 23);
		frmValetinho.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Saída");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Saida tela = new Saida();
			}
		});
		btnNewButton_1.setBackground(new Color(250, 128, 114));
		btnNewButton_1.setBounds(126, 181, 183, 23);
		frmValetinho.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Consulta de Placa");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta tela = new Consulta();
			}
		});
		btnNewButton_1_1.setBackground(SystemColor.scrollbar);
		btnNewButton_1_1.setBounds(126, 215, 183, 23);
		frmValetinho.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Tranferência de Placa");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transferencia tela = new Transferencia();
			}
		});
		btnNewButton_1_1_1.setBackground(SystemColor.scrollbar);
		btnNewButton_1_1_1.setBounds(126, 249, 183, 23);
		frmValetinho.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Listagem Geral");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Geral tela = new Geral();
			}
		});
		btnNewButton_1_1_1_1.setBackground(SystemColor.scrollbar);
		btnNewButton_1_1_1_1.setBounds(126, 283, 183, 23);
		frmValetinho.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Listagem de vagas livres");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livres tela = new Livres();
			}
		});
		btnNewButton_1_1_1_1_1.setBackground(SystemColor.scrollbar);
		btnNewButton_1_1_1_1_1.setBounds(126, 317, 183, 23);
		frmValetinho.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		frmValetinho.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opções");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Entrada");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Entrada tela = new Entrada();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Saída");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Saida tela = new Saida();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consulta de Placa");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Consulta tela = new Consulta();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("Transferência de Placa");
		mntmNewMenuItem_2_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Transferencia tela = new Transferencia();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2_1);
		
		JMenuItem mntmNewMenuItem_2_1_1 = new JMenuItem("Listagem Geral");
		mntmNewMenuItem_2_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Geral tela = new Geral();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2_1_1);
		
		JMenuItem mntmNewMenuItem_2_1_1_1 = new JMenuItem("Listagem de vagas livres");
		mntmNewMenuItem_2_1_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Livres tela = new Livres();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2_1_1_1);
		
		JMenu mnNewMenu_1 = new JMenu("Sair");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmValetinho.dispose();
			}
		});
		menuBar.add(mnNewMenu_1);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha sua opção");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(126, 86, 183, 31);
		frmValetinho.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("Sair");
		btnNewButton_1_1_1_1_1_1.setBackground(SystemColor.scrollbar);
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmValetinho.dispose();
			}
		});
		btnNewButton_1_1_1_1_1_1.setBounds(126, 351, 183, 23);
		frmValetinho.getContentPane().add(btnNewButton_1_1_1_1_1_1);
		frmValetinho.setBounds(100, 100, 450, 466);
		frmValetinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
