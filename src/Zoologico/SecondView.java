package Zoologico;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;



public class SecondView extends JFrame {
	

    private JPanel panel;
	int i;

	public SecondView(ArrayList<Animal> animales){
		setSize(500,500); //ancho y alto 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Zoologico");
		setLocationRelativeTo(null); //aparece en el centro 
		setResizable(false); //para que no se puede cambiar de tamano

		panel = new JPanel();
	    setContentPane(panel);
		panel.setBackground(Color.yellow);
		panel.setLayout(null);//Desactiva el layout que viene automatico, para ajustar las posciones y tamanos
		
		JLabel titulo = new JLabel("Animales en el Zoo");
		titulo.setBounds(180,10,200,50);
		titulo.setFont(new Font("arial",1,16));
	
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 50, 400, 450);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50,50, 400, 330);
		scrollPane.setViewportView(textArea);
		
		JButton button1 = new JButton();
		button1.setText("Mostrar Animales");
		button1.setBounds(50, 400, 150, 40);
	    button1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	String animalesZoo = new String();
	        	for(i=0; i<animales.size();i++) {
	        	animalesZoo += "\n\n#"+(1+i)+ " "+animales.get(i).toString();
	        }
	        textArea.setText(animalesZoo);
	        }});
	    
	    JButton button2 = new JButton();
		button2.setText("Agregar Animales");
		button2.setBounds(180, 400, 150, 40);
	    button2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	FinalView finale = new FinalView(animales);
	        	dispose();
	        }});
	    
	    
	    JButton button3 = new JButton();
		button3.setText("Cerrar");
		button3.setBounds(320, 400, 120, 40);
	    button3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	System.exit(0);
	    }});
	    
	  
	    textArea.setLineWrap(true);
	    
	    this.panel.add(scrollPane);
		this.panel.add(button1);
		this.panel.add(button2);
		this.panel.add(button3);
		this.panel.add(titulo);
		
	}
	
	public JPanel getJPanel() {
		return this.panel;
	}
}
