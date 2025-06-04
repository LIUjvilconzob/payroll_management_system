package EPMS;
import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import java.sql.*;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class LoginAdmin_Class {


	private JFrame f1;
	private JTextField tf1;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin_Class window = new LoginAdmin_Class();
					window.f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginAdmin_Class() {
		initialize();
	}

	private void initialize() {
		f1 = new JFrame();
		f1.getContentPane().setBackground(new Color(35, 92, 81));
		f1.setBounds(100, 100, 600, 420);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.getContentPane().setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setBounds(280, 0, 304, 390);
		f1.getContentPane().add(p1);
		p1.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(43, 165, 200, 30);
		p1.add(tf1);
		tf1.setColumns(10);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(43, 253, 200, 36);
		p1.add(passwordField);
		
		

		
		JButton b1 = new JButton("LOGIN");
		b1.setBackground(new Color(35, 92, 81));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				
				String user=tf1.getText();
				String pa=passwordField.getText();
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms","root","");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from tabs");
					while(rs.next()) {
				
						String username=rs.getString(2);
						String password=rs.getString(3);
						
						
						if(user.equals(username)&& pa.equals(password)) {
							JOptionPane.showMessageDialog(null, "Logged in!");
						MenuAdmin_Class obj=new MenuAdmin_Class();
						obj.setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null, "Username or password is incorrect");
							
						}
						
							
							
						}con.close();
						
					}
				
				catch(Exception e1) {
					System.out.println(e1);
				
				}
				
	
				
				f1.setVisible(false);
				
			}
		});
		b1.setBounds(43, 300, 87, 36);
		p1.add(b1);
		
		JLabel lb1 = new JLabel("Username");
		lb1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lb1.setBounds(43, 134, 95, 30);
		p1.add(lb1);
		
		JLabel lb2 = new JLabel("Password");
		lb2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lb2.setBounds(43, 218, 100, 30);
		p1.add(lb2);
		
		JLabel title_lb = new JLabel("LOGIN");
		title_lb.setForeground(new Color(35, 92, 81));
		title_lb.setBackground(new Color(35, 92, 81));
		title_lb.setFont(new Font("Segoe UI", Font.BOLD, 26));
		title_lb.setBounds(100, 34, 95, 50);
		p1.add(title_lb);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(35, 92, 81));
		panel.setBounds(0, 0, 281, 381);
		f1.getContentPane().add(panel);
	
		

	}
}
