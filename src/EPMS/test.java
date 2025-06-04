package EPMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.text.JTextComponent;

import java.sql.*;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class test {

	private JFrame frame;
	private JTextField firstNameTF;
	private JTextField ageTF;
	private JTextField searchTF;
	private JTextField idTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search ID");
		lblNewLabel.setBounds(169, 46, 75, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(37, 191, 75, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(37, 216, 75, 14);
		frame.getContentPane().add(lblAge);
		
		firstNameTF = new JTextField();
		firstNameTF.setBounds(97, 188, 108, 20);
		frame.getContentPane().add(firstNameTF);
		firstNameTF.setColumns(10);
		
		ageTF = new JTextField();
		ageTF.setColumns(10);
		ageTF.setBounds(97, 213, 108, 20);
		frame.getContentPane().add(ageTF);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				
   					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms","root","");
                  

   					
				

                    PreparedStatement pst=con.prepareStatement("select id,first_name,age from test where id=?");
					int id = Integer.parseInt(idTF.getText());
						pst.setInt(1,id);
						ResultSet rsl = pst.executeQuery();
					
					ResultSet rs1 = null;
					if(rs1.next ()==false)
						{
						JOptionPane.showMessageDialog(btnNewButton, this, "Sorry Record Not Found", id);
						
						firstNameTF.setText("");
						ageTF.setText("");
						idTF.requestFocus();
						}
					else
						{
					
						firstNameTF.setText(rs1.getString("first_name"));
						ageTF.setText(rs1.getString("age"));
				
				
						}
				
				}catch (SQLException ex) {
			}}
		});
		btnNewButton.setBounds(263, 78, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		searchTF = new JTextField();
		searchTF.setBounds(157, 79, 75, 20);
		frame.getContentPane().add(searchTF);
		searchTF.setColumns(10);
		
		idTF = new JTextField();
		idTF.setBounds(97, 160, 108, 20);
		frame.getContentPane().add(idTF);
		idTF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(41, 163, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
