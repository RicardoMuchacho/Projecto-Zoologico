package Zoologico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Second_View extends JFrame {

	private JPanel contentPane;
    private int i;

	public Second_View(ArrayList<Animal> animales) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Animales en Zoo");
		lblNewLabel.setBounds(149, 13, 111, 16);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(33, 38, 364, 155);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnNewButton_1 = new JButton("Mostrar Animales");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String animalesZoo = new String();
	        	for(i=0; i<animales.size();i++) {
	        	animalesZoo += "\n\n#"+(1+i)+ " "+animales.get(i).toString();
	        }
	        textArea_1.setText(animalesZoo);
			}
		});
		btnNewButton_1.setBounds(33, 206, 133, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Agregar Animales");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UltimoView v3 = new UltimoView(animales);
				dispose();
			}
		});
		btnNewButton_2.setBounds(162, 206, 141, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cerrar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(300, 206, 97, 25);
		contentPane.add(btnNewButton_3);
		
		
	    setVisible(true);
	 
		
	}
	}
