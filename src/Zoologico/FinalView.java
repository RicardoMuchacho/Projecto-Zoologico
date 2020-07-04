package Zoologico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class FinalView extends JFrame{

	private JPanel panel;
	
	FinalView(ArrayList<Animal> animales){
	
   
	
	setTitle("APP Zoo");
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	panel = new JPanel();
	panel.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(panel);
	panel.setLayout(null);
	
	JLabel chao = new JLabel("Hasta Luego");
	chao.setBounds(200, 200, 100, 100);
	
	JButton button3 = new JButton("Cerrar");
	button3.setBounds(320, 250, 120, 40);
    button3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	System.exit(0);
    }});
    
	panel.add(chao);
	panel.add(button3);
	}
	

}
