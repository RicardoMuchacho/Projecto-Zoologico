package Zoologico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class UI extends JFrame{ 
	
	private JPanel panel;
	
	
public UI(ArrayList<Animal> animales) {
	setSize(500,500); //ancho y alto 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Zoologico");
	setLocationRelativeTo(null); //aparece en el centro 
	setResizable(false); //para que no se puede cambiar de tamano

	panel = new JPanel();
    setContentPane(panel);
	panel.setBackground(Color.yellow);
	panel.setLayout(null);//Desactiva el layout que viene automatico, para ajustar las posciones y tamanos
	
	JLabel etiqueta = new JLabel();
	etiqueta.setText("Zoologico");
	etiqueta.setBounds(150,20,200,50);
	etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //allignment
	etiqueta.setFont(new Font("arial", Font.BOLD, 25));
	this.panel.add(etiqueta);
	
	ImageIcon imagen = new ImageIcon("cartoon-safari.png"); 
	JLabel foto = new JLabel();
	foto.setBounds(50, 100, 400, 300);
	foto.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH))); //para cambiar tamano de imagen
	this.panel.add(foto);
	
	JButton boton1 = new JButton();
	boton1.setBounds(175, 200, 150, 50);
	boton1.setText("Comenzar");
	boton1.setFont(new Font("arial", 0, 16));
	
	boton1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	SecondView view2 = new SecondView(animales);
        	panel.removeAll();
        	setContentPane(view2.getJPanel());
        	revalidate();
        	
        	
        }
    });

	panel.add(boton1);
	
	setVisible(true);
}
}
