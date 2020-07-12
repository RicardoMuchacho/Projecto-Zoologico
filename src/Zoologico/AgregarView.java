package Zoologico;

import Database.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class AgregarView extends JFrame {

	DB db = DB.getInstances();
	
	private JPanel contentPane;
	private JTextField txtEspecie;
	private JTextField txtHabitat;
	private JTextField txtCantidad;
	
	public AgregarView() {
		
		contentPane = new JPanel();
		contentPane.setSize(400,375);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setBounds(210, 283, 97, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Regresar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondView v4 = new SecondView ();
				UI2.frame.setContentPane(v4.getJPanel2());
				UI2.frame.revalidate();
			}
		});
		btnNewButton_2.setBounds(151, 280, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese 1 Animal a la ves");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(26, 13, 233, 22);
		contentPane.add(lblNewLabel_1);
		
		txtEspecie = new JTextField();
		txtEspecie.setText("Especie");
		txtEspecie.setBounds(26, 64, 116, 22);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);
		txtEspecie.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtEspecie.setText("");
			}
		});
		
		txtHabitat = new JTextField();
		txtHabitat.setText("Habitat");
		txtHabitat.setToolTipText("");
		txtHabitat.setBounds(26, 109, 116, 22);
		contentPane.add(txtHabitat);
		txtHabitat.setColumns(10);
		txtHabitat.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtHabitat.setText("");
			}
		});
		
		txtCantidad = new JTextField();
		txtCantidad.setText("Cantidad");
		txtCantidad.setBounds(26, 156, 116, 22);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		txtCantidad.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtCantidad.setText("");
			}
		});
		
		JButton btnNewButton_3 = new JButton("Agregar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Animal Animal1 = new Animal(txtEspecie.getText(), txtHabitat.getText(), Integer.parseInt(txtCantidad.getText()));
				//animales.add(Animal1);
				Object[] obj = {txtEspecie.getText(), txtHabitat.getText(), Integer.parseInt(txtCantidad.getText())};
				db.dbPrepareStatement("insert into animales(especie, habitat, cantidad) values( ?, ?, ? )", obj);
				btnNewButton_3.setEnabled(false);
				}
		});
		btnNewButton_3.setBounds(26, 200, 116, 25);
		contentPane.add(btnNewButton_3);
		
		JButton reiniciarbtn = new JButton("Reiniciar");
		reiniciarbtn.setEnabled(false);
		reiniciarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEspecie.setText("especie");
				txtHabitat.setText("habitat");
				txtCantidad.setText("cantidad");
				btnNewButton_3.setEnabled(true);
			}
		});
		reiniciarbtn.setBounds(309, 262, 81, 25);
		add(reiniciarbtn);
		

	}
	
	public JPanel getJPanel3() {
		return this.contentPane;
	}
}
