package EPMS;

import java.awt.EventQueue;




import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import MysqlJavaLoginpage.Menupage;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MenuAdmin_Class {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin_Class window = new MenuAdmin_Class();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuAdmin_Class() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel menu_panel = new JPanel();
		menu_panel.setBounds(10, 95, 415, 485);
		frame.getContentPane().add(menu_panel);
		menu_panel.setLayout(null);
		
		JButton b1 = new JButton("Add Employee");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				AddEmployee_Class obj=new AddEmployee_Class();
				obj.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		b1.setBounds(45, 65, 150, 90);
		menu_panel.add(b1);
		
		JButton b2 = new JButton("Search");
		b2.setBounds(225, 65, 150, 90);
		menu_panel.add(b2);
		
		JButton b3 = new JButton("Remove Employee");
		b3.setBounds(45, 205, 150, 90);
		menu_panel.add(b3);
		
		JButton b4 = new JButton("Update Salary");
		b4.setBounds(225, 205, 150, 90);
		menu_panel.add(b4);
		
		JButton btnNewButton = new JButton("Deduction");
		btnNewButton.setBounds(45, 345, 150, 90);
		menu_panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Payment");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payslip_Class obj=new Payslip_Class();
				obj.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(225, 345, 150, 90);
		menu_panel.add(btnNewButton_1);
		
		JLabel menu_label = new JLabel("ADMIN MENU");
		menu_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		menu_label.setBounds(130, 10, 155, 75);
		frame.getContentPane().add(menu_label);
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
