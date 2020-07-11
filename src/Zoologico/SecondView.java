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

public class SecondView extends JFrame {

	private JPanel contentPane;
    DB db = DB.getInstances();

	public SecondView() {
		
		contentPane = new JPanel();
		contentPane.setSize(400,375);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Animales en Zoo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(137, 13, 126, 16);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 52, 352, 249);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		scrollPane_1.setViewportView(textArea_1);
		db.dbStatement("SELECT *FROM animales");
        textArea_1.setText(db.resultString);
		
		JButton btnNewButton_1 = new JButton("Buscar/Modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusquedaView vBus = new BusquedaView();
				UI2.frame.setContentPane(vBus.getJPanelBus());
				UI2.frame.revalidate();
			}
		});
		btnNewButton_1.setBounds(24, 326, 158, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Agregar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarView v3 = new AgregarView();
				UI2.frame.setContentPane(v3.getJPanel3());
				UI2.frame.revalidate();
			}
		});
		btnNewButton_2.setBounds(180, 326, 109, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cerrar");
		btnNewButton_3.setBounds(285, 326, 91, 25);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton_3);
		
	}
	
	public JPanel getJPanel2() {
		return this.contentPane;
	}
	
	}
