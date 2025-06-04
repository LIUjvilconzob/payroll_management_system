package EPMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.sql.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Search_Class {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblEmail;
	private JLabel lblContact;
	private JLabel lblDateHired;
	private JLabel lblCity;
	private JLabel lblEmail_1;
	private JLabel lblDateHired_1;
	private JTextField textField_15;
	private JTextField textField_16;
	private JButton btnNewButton;
	private JButton btnDelete;
	private JButton btnNewButton_2;
	private JTextField textField_17;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Class window = new Search_Class();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Search_Class() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 11, 765, 515);
		frame.getContentPane().add(p1);
		
		JLabel lblSearchID = new JLabel("Search ID:");
		lblSearchID.setBounds(20, 10, 130, 30);
		p1.add(lblSearchID);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(20, 70, 130, 30);
		p1.add(lblEmployeeId);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(20, 110, 130, 30);
		p1.add(lblFirstName);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setBounds(20, 150, 130, 30);
		p1.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(20, 190, 130, 30);
		p1.add(lblLastName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(20, 230, 130, 30);
		p1.add(lblAge);
		
		JLabel lblBirthDate = new JLabel("Birthdate:");
		lblBirthDate.setBounds(20, 270, 130, 30);
		p1.add(lblBirthDate);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setBounds(20, 310, 130, 30);
		p1.add(lblSex);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(20, 350, 130, 30);
		p1.add(lblGender);
		
		JLabel lblJobTitle = new JLabel("Job Title:");
		lblJobTitle.setBounds(20, 390, 130, 30);
		p1.add(lblJobTitle);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(20, 430, 130, 30);
		p1.add(lblBranch);
		
	
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 110, 270, 30);
		p1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 150, 270, 30);
		p1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 190, 270, 30);
		p1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(100, 230, 270, 30);
		p1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(100, 270, 270, 30);
		p1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(474, 70, 270, 30);
		p1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(100, 430, 270, 30);
		p1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(100, 390, 270, 30);
		p1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(100, 350, 270, 30);
		p1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(474, 110, 270, 30);
		p1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(100, 310, 270, 30);
		p1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(474, 150, 270, 30);
		p1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(474, 190, 270, 30);
		p1.add(textField_14);
		
		lblEmail = new JLabel("Street Address:");
		lblEmail.setBounds(391, 70, 130, 30);
		p1.add(lblEmail);
		
		lblContact = new JLabel("Country:");
		lblContact.setBounds(391, 110, 130, 30);
		p1.add(lblContact);
		
		lblDateHired = new JLabel("State / Province:");
		lblDateHired.setBounds(391, 150, 130, 30);
		p1.add(lblDateHired);
		
		lblCity = new JLabel("City:");
		lblCity.setBounds(391, 190, 130, 30);
		p1.add(lblCity);
		
		lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setBounds(391, 230, 130, 30);
		p1.add(lblEmail_1);
		
		lblDateHired_1 = new JLabel("Date Hired:");
		lblDateHired_1.setBounds(20, 470, 130, 30);
		p1.add(lblDateHired_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(100, 470, 270, 30);
		p1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(474, 230, 270, 30);
		p1.add(textField_16);
		
		btnNewButton = new JButton("ADD RECORD");
		btnNewButton.setBounds(550, 306, 130, 39);
		p1.add(btnNewButton);
		
		btnDelete = new JButton("DELETE");
		btnDelete.setBounds(550, 373, 130, 39);
		p1.add(btnDelete);
		
		btnNewButton_2 = new JButton("ADD RECORD");
		btnNewButton_2.setBounds(550, 434, 130, 39);
		p1.add(btnNewButton_2);
		
		
		
		
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				
				
				try{

		            
		            Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms","root","");
					Statement pst=con.createStatement();
					ResultSet rs=pst.executeQuery("select * from addemployee");
		            rs.close();
		            pst.close();
		                String add1 =rs.getString("id");
		                textField_17.setText(add1);

		                String add2 =rs.getString("first_name");
		               textField_2.setText(add2);

		                String add3 =rs.getString("middle_name");
		               textField_3.setText(add3);

		                String add4 =rs.getString("last_name");
		               textField_4.setText(add4);

		                String add5 =rs.getString("age");
		                textField_5.setText(add5);

		              

		        }catch(Exception ex){
		     
		         }
				
				
				
		         
				
				
			}
		});
		textField.setColumns(10);
		textField.setBounds(100, 10, 655, 30);
		p1.add(textField);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(100, 70, 270, 30);
		p1.add(textField_17);
		
		
		
		
		
		
		
		
		
	}
}