package Zoologico;

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

public class UltimoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtEspecie;
	private JTextField txtHabitat;
	private JTextField txtCantidad;
	/**
	 * Create the panel.
	 */
	public UltimoView(ArrayList<Animal> animales) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
				Second_View v4 = new Second_View (animales);
				dispose();
			}
		});
		btnNewButton_2.setBounds(81, 283, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese 1 Animal a la ves");
		lblNewLabel_1.setBounds(26, 13, 228, 16);
		contentPane.add(lblNewLabel_1);
		
		txtEspecie = new JTextField();
		txtEspecie.setText("Especie");
		txtEspecie.setBounds(26, 46, 116, 22);
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
		txtHabitat.setBounds(26, 91, 116, 22);
		contentPane.add(txtHabitat);
		txtHabitat.setColumns(10);
		txtHabitat.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				txtHabitat.setText("");
			}
		});
		
		txtCantidad = new JTextField();
		txtCantidad.setText("Cantidad");
		txtCantidad.setBounds(26, 138, 116, 22);
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
				Animal Animal1 = new Animal(txtEspecie.getText(), txtHabitat.getText(), Integer.parseInt(txtCantidad.getText()));
				animales.add(Animal1);
					Second_View v4 = new Second_View (animales);
					dispose();
				}
		});
		btnNewButton_3.setBounds(26, 182, 116, 25);
		contentPane.add(btnNewButton_3);
		setVisible(true);

	}
}
