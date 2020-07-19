package Cliente;

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


public class UI1 {

	private JPanel panel;
	public static JFrame frame;

	

	public UI1() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		frame.setContentPane(panel);
		
		JLabel lblNewLabel = new JLabel("Zoologico");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(126, 18, 141, 24);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Comenzar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI2 v2 = new UI2();
			    frame.setContentPane(v2.getJPanel());
				frame.revalidate();
			}
		});
		btnNewButton.setBounds(148, 169, 97, 25);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("/cartoon-safari.png")).getImage();	
	    lblNewLabel_1.setIcon(new ImageIcon(images)); 
		lblNewLabel_1.setBounds(44, 55, 288, 254);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Version Cliente");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(126, 336, 141, 16);
		panel.add(lblNewLabel_2);
	
		frame.setVisible(true);
	}
}
