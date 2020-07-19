package Cliente;

import Database.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.net.Socket;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class UI2 extends JFrame {
	
JPanel contentPane = new JPanel();
private JTextField txtAnimalABuscar;
private JButton buscarbtn;

DB db = DB.getInstances();


	public UI2() {
		contentPane = new JPanel();
		contentPane.setSize(400,375);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscador de Animales");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 13, 184, 17);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 85, 343, 160);
		contentPane.add(textArea);
		
		txtAnimalABuscar = new JTextField();
		txtAnimalABuscar.setText("Especie a buscar");
		txtAnimalABuscar.setBounds(27, 51, 134, 22);
		contentPane.add(txtAnimalABuscar);
		txtAnimalABuscar.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtAnimalABuscar.setText("");
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Esperando Entrada...");
		lblNewLabel_1.setBounds(256, 54, 120, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton reiniciarbtn = new JButton("Buscar otro");
		reiniciarbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		reiniciarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAnimalABuscar.setText("");
				textArea.setText("");
				buscarbtn.setEnabled(true);
				lblNewLabel_1.setText("Esperando Entrada...");
			}
		});
		reiniciarbtn.setBounds(126, 274, 134, 25);
		contentPane.add(reiniciarbtn);
		
		JButton cerrarbtn = new JButton("Cerrar");
		cerrarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
							}
		});
		cerrarbtn.setBounds(140, 323, 105, 25);
		contentPane.add(cerrarbtn);

		buscarbtn = new JButton("Buscar");
		buscarbtn.setHorizontalAlignment(SwingConstants.LEFT);
		buscarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteConexion a = new ClienteConexion(txtAnimalABuscar.getText().toLowerCase());
				
				textArea.setText(a.resultLine);
				lblNewLabel_1.setText(a.resultLine2);
				buscarbtn.setEnabled(false);
			}
		});
		buscarbtn.setBounds(157, 51, 76, 23);
		contentPane.add(buscarbtn);	
	}
	
	public JPanel getJPanel(){
		return this.contentPane;
	}
}
