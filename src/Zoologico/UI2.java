package Zoologico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UI2 extends JFrame {

	private JPanel contentPane;

	public UI2(ArrayList<Animal> animales) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Zoologico");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(125, 13, 141, 24);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Comenzar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second_View v2 = new Second_View(animales);
				dispose();
;			}
		});
		btnNewButton.setBounds(147, 176, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("/cartoon-safari.png")).getImage();	
	    lblNewLabel_1.setIcon(new ImageIcon(images)); 
		lblNewLabel_1.setBounds(51, 61, 288, 254);
		contentPane.add(lblNewLabel_1);
		
	
		
		
		setVisible(true);
	}

}
