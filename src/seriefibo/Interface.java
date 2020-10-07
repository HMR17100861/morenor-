package seriefibo;


//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textNumeroA;
	private JTextField textNumeroB;
	private JTextField txtIteraciones;
	private JLabel lblIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Interface frame = new Interface();
		frame.setVisible(true);

//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}
int valor1=0,valor2=0,suma=0;
String cadena="";

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalcular = new JButton("Calcular Serie");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int valor1=Integer.parseInt(textNumeroA.getText());
				int valor2=Integer.parseInt(textNumeroB.getText());
				int x=1;
			int	iteraciones= Integer.parseInt(txtIteraciones.getText());

	         cadena=String.valueOf(valor1)+"\n"+String.valueOf(valor2);
	         int valor3;
	        do {
	           valor3 =valor1+valor2;
	           cadena=cadena+"\n"+String.valueOf(valor3);
	          
	            valor2=valor3;
	            valor1=valor2;
	            x++;
	        } while (x<= iteraciones);
	        JOptionPane.showMessageDialog(null, cadena);
			}
		});
		btnCalcular.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				  

			}
		});
		btnCalcular.setBounds(98, 233, 201, 17);
		contentPane.add(btnCalcular);
		
		textNumeroA = new JTextField();
		textNumeroA.setBounds(119, 26, 86, 20);
		contentPane.add(textNumeroA);
		textNumeroA.setColumns(10);
		
		textNumeroB = new JTextField();
		textNumeroB.setColumns(10);
		textNumeroB.setBounds(119, 65, 86, 20);
		contentPane.add(textNumeroB);
		
		JLabel lblNumeroA = new JLabel("Primer numero");
		lblNumeroA.setBounds(23, 28, 86, 17);
		contentPane.add(lblNumeroA);
		
		JLabel lblNumeroB = new JLabel("Segundo numero");
		lblNumeroB.setBounds(22, 68, 87, 17);
		contentPane.add(lblNumeroB);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setColumns(10);
		txtIteraciones.setBounds(130, 109, 86, 20);
		contentPane.add(txtIteraciones);
		
		lblIteraciones = new JLabel("Numero de iteraciones");
		lblIteraciones.setBounds(10, 110, 123, 18);
		contentPane.add(lblIteraciones);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnSalir.setBounds(211, 169, 201, 17);
		contentPane.add(btnSalir);
		
		
	}
}
