package Zoologico;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class BusquedaView extends JFrame {
	
JPanel contentPane = new JPanel();
private JTextField txtAnimalABuscar;
private JTextField txtEspecie;
private JTextField txtHabitat;
private JTextField txtCantidad;

DB db = DB.getInstances();

	public BusquedaView() {
		contentPane = new JPanel();
		contentPane.setSize(400,375);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busqueda y Modificaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 13, 184, 17);
		contentPane.add(lblNewLabel);
		
		txtAnimalABuscar = new JTextField();
		txtAnimalABuscar.setText("Especie a buscar");
		txtAnimalABuscar.setBounds(27, 51, 134, 22);
		contentPane.add(txtAnimalABuscar);
		txtAnimalABuscar.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtAnimalABuscar.setText("");
			}
		});
		
		txtEspecie = new JTextField();
		txtEspecie.setText("especie");
		txtEspecie.setBounds(27, 99, 120, 22);
		contentPane.add(txtEspecie);
		txtEspecie.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtEspecie.setText("");
			}
		});
		
		txtHabitat = new JTextField();
		txtHabitat.setText("habitat");
		txtHabitat.setBounds(159, 99, 120, 22);
		contentPane.add(txtHabitat);
		txtHabitat.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtHabitat.setText("");
			}
		});
		
		txtCantidad = new JTextField();
		txtCantidad.setText("cantidad");
		txtCantidad.setBounds(291, 99, 62, 22);
		contentPane.add(txtCantidad);
		txtCantidad.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtCantidad.setText("");
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Esperando Entrada...");
		lblNewLabel_1.setBounds(256, 54, 120, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton eliminarbtn = new JButton("Eliminar");
		eliminarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String strDelete = txtEspecie.getText();
				db.dbPrepareStatementDelete("delete from animales where especie = ?",txtEspecie.getText());
				txtAnimalABuscar.setText("Especie a buscar");
				txtEspecie.setText("especie");
				txtHabitat.setText("habitat");
				txtCantidad.setText("cantidad");
				lblNewLabel_1.setText("Esperando Entrada...");
			}
		});
		eliminarbtn.setEnabled(false);
		eliminarbtn.setBounds(28, 213, 99, 25);
		contentPane.add(eliminarbtn);
		
		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondView v4 = new SecondView();
				UI2.frame.setContentPane(v4.getJPanel2());
				UI2.frame.revalidate();
			}
		});
		btnNewButton_3.setBounds(136, 262, 106, 25);
		contentPane.add(btnNewButton_3);
		
		JButton reiniciarbtn = new JButton("Reiniciar");
		reiniciarbtn.setEnabled(false);
		reiniciarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAnimalABuscar.setText("");
				txtEspecie.setText("especie");
				txtHabitat.setText("habitat");
				txtCantidad.setText("cantidad");
				lblNewLabel_1.setText("Esperando Entrada...");
			}
		});
		reiniciarbtn.setBounds(256, 262, 99, 25);
		contentPane.add(reiniciarbtn);
		
		JLabel lblNewLabel_2 = new JLabel("Opciones a elegir para el animal buscado");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(82, 142, 236, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton modificarbtn = new JButton("Modificar (borre e ingrese nuevos valores primero)");
		modificarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] obj = {txtEspecie.getText(), txtHabitat.getText(), Integer.parseInt(txtCantidad.getText())};
				db.dbPrepareStatement("update animales set especie=?, habitat=?, cantidad=? where especie ='"+txtAnimalABuscar.getText()+"'", obj);
				txtAnimalABuscar.setText("Especie a buscar");
				txtEspecie.setText("especie");
				txtHabitat.setText("habitat");
				txtCantidad.setText("cantidad");
				lblNewLabel_1.setText("Esperando Entrada...");
							}
		});
		modificarbtn.setEnabled(false);
		modificarbtn.setBounds(28, 175, 325, 25);
		contentPane.add(modificarbtn);
		
		JButton buscarbtn = new JButton("Buscar");
		buscarbtn.setHorizontalAlignment(SwingConstants.LEFT);
		buscarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciarbtn.setEnabled(true);
				modificarbtn.setEnabled(true);
				eliminarbtn.setEnabled(true);
				db.dbStatementBusqueda("SELECT *FROM animales WHERE especie = '"+ txtAnimalABuscar.getText().toLowerCase() +"';");
				txtEspecie.setText(db.resultEspecie);
				txtHabitat.setText(db.resultHabitat);
				txtCantidad.setText(String.valueOf(db.resultCantidad));
				lblNewLabel_1.setText(db.resultError);
			}
		});
		buscarbtn.setBounds(157, 51, 76, 23);
		contentPane.add(buscarbtn);
	}
	
	public JPanel getJPanelBus(){
		return this.contentPane;
	}
}
