package ventanalogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUsuario;
	public static JPasswordField pssContraseña;
	private JButton btnInicio;
	private JButton btnSalir;

	
	public Ventana1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hector Moreno\\Pictures\\52cc3796-1ef2-4d17-8c69-573ea360682b.jpg"));
		setBackground(new Color(0, 0, 0));
		setTitle("Inicie sesion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(66, 14, 46, 14);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(149, 11, 88, 26);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setBounds(50, 59, 62, 14);
		contentPane.add(lblContraseña);
		
		pssContraseña = new JPasswordField();
		pssContraseña.setBounds(149, 57, 88, 26);
		contentPane.add(pssContraseña);
		final DatosUsuario user= new DatosUsuario();
		btnInicio = new JButton("Iniciar sesion");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(user.probarcontra()==true) 
				{
JOptionPane.showMessageDialog(null,"Inicio de sesion completado");
				}
				else {
					JOptionPane.showMessageDialog(null, "Error usario/contraseña erronea");
				}
				
			}
		});
		btnInicio.setBounds(25, 182, 120, 34);
		contentPane.add(btnInicio);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(218, 182, 113, 34);
		contentPane.add(btnSalir);
	}
}
