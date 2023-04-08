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

public class ValetinhoMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValetinhoMenu window = new ValetinhoMenu();
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
	public ValetinhoMenu() {
		initialize();
		frame.setVisible(true);
		try {
			Estacionamento estacionamento = new Estacionamento(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Valetinho");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("Estacinamento Car-Tchau");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		titulo.setBounds(38, 36, 367, 74);
		frame.getContentPane().add(titulo);
		
		JLabel subtitulo = new JLabel("10 vagas - Escolha sua opção");
		subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		subtitulo.setBounds(101, 93, 228, 31);
		frame.getContentPane().add(subtitulo);
		
		JButton btnentrada = new JButton("Entrada");
		btnentrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValetinhoEntrada telaent = new ValetinhoEntrada();
			}
		});
		btnentrada.setBackground(new Color(152, 251, 152));
		btnentrada.setForeground(Color.BLACK);
		btnentrada.setBounds(126, 147, 183, 23);
		frame.getContentPane().add(btnentrada);
		
		JButton btnsaida = new JButton("Saída");
		btnsaida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValetinhoSaida telasai = new ValetinhoSaida();
			}
		});
		btnsaida.setBackground(new Color(250, 128, 114));
		btnsaida.setBounds(126, 181, 183, 23);
		frame.getContentPane().add(btnsaida);
		
		JButton btnconsulta = new JButton("Consulta de Placa");
		btnconsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValetinhoConsulta telacon = new ValetinhoConsulta();
			}
		});
		btnconsulta.setBackground(SystemColor.scrollbar);
		btnconsulta.setBounds(126, 215, 183, 23);
		frame.getContentPane().add(btnconsulta);
		
		JButton btntransf = new JButton("Tranferência de Placa");
		btntransf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValetinhoTransferencia telatra = new ValetinhoTransferencia();
			}
		});
		btntransf.setBackground(SystemColor.scrollbar);
		btntransf.setBounds(126, 249, 183, 23);
		frame.getContentPane().add(btntransf);
		
		JButton btngeral = new JButton("Listagem Geral");
		btngeral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValetinhoGeral telager = new ValetinhoGeral();
			}
		});
		btngeral.setBackground(SystemColor.scrollbar);
		btngeral.setBounds(126, 283, 183, 23);
		frame.getContentPane().add(btngeral);
		
		JButton btnlivres = new JButton("Listagem de vagas livres");
		btnlivres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValetinhoLivres telaliv = new ValetinhoLivres();
			}
		});
		btnlivres.setBackground(SystemColor.scrollbar);
		btnlivres.setBounds(126, 317, 183, 23);
		frame.getContentPane().add(btnlivres);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		menuBar.setBounds(0, 0, 434, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu opcoes = new JMenu("Opções");
		menuBar.add(opcoes);
		
		JMenuItem menuentrada = new JMenuItem("Entrada");
		menuentrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnentrada.doClick();
			}
		});
		opcoes.add(menuentrada);
		
		JMenuItem menusaida = new JMenuItem("Saída");
		menusaida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnsaida.doClick();
			}
		});
		opcoes.add(menusaida);
		
		JMenuItem menuconsulta = new JMenuItem("Consulta de Placa");
		menuconsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnconsulta.doClick();
			}
		});
		opcoes.add(menuconsulta);
		
		JMenuItem menutransf = new JMenuItem("Transferência de Placa");
		menutransf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btntransf.doClick();
			}
		});
		opcoes.add(menutransf);
		
		JMenuItem menugeral = new JMenuItem("Listagem Geral");
		menugeral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btngeral.doClick();
			}
		});
		opcoes.add(menugeral);
		
		JMenuItem menulivres = new JMenuItem("Listagem de vagas livres");
		menulivres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnlivres.doClick();
			}
		});
		opcoes.add(menulivres);
		
		JMenu sair = new JMenu("Sair");
		sair.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		menuBar.add(sair);
		
		JButton btnsair = new JButton("Sair");
		btnsair.setBackground(SystemColor.scrollbar);
		btnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnsair.setBounds(126, 351, 183, 23);
		frame.getContentPane().add(btnsair);
		frame.setBounds(100, 100, 450, 466);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	
}
