package Zoologico;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ThirdView extends JFrame {
	
	private JPanel panel3;
    int i;

	public ThirdView(ArrayList<Animal> animales){
			
		panel3 = new JPanel();
		panel3.setLayout(null);
			
		JLabel titulo = new JLabel("Ingrese Animales");
		titulo.setBounds(180,10,200,50);
		titulo.setFont(new Font("arial",1,16));
			
		TextField textField = new TextField();
		textField.setBounds(20, 50, 200, 100);
		    
		JButton button2 = new JButton();
	    button2.setText("Regresar");
	    button2.setBounds(200, 400, 150, 40);
		button2.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	//SecondView view2 = new SecondView(animales);
		        	//setContentPane(view2.getJPanel());
		        	//panel.removeAll();
		        	//revalidate();
		        }});
		    
		    JButton button3 = new JButton();
			button3.setText("Cerrar");
			button3.setBounds(300, 400, 120, 40);
		    button3.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	System.exit(0);
		    }});
		    
		    panel3.add(textField);
			panel3.add(button2);
			panel3.add(button3);
			panel3.add(titulo);
		}
		
		public JPanel getJPanel3() {
			return panel3;
		}
	}


