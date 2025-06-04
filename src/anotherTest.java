import java.awt.EventQueue;
import java.awt.EventQueue;

import java.util.Locale;

import java.awt.EventQueue;


import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.text.JTextComponent;

import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;

import EPMS.AddEmployee_Class;
import EPMS.MenuAdmin_Class;

import java.sql.*;

import java.awt.event.ActionListener;
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

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.System.Logger;


public class anotherTest extends JFrame {
	JFrame frame;
	private JTextField firstNameTF;
	private JTextField middleNameTF;
	private JTextField lastNameTF;
	private JRadioButton rdbtnNewRadioButton_1;
	private JComboBox comboBox_6;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_17;
	private JTextField rateTF;
	private JLabel lblNewLabel_18;
	private JTextField branchTF;
	private JLabel lblNewLabel_6;
	private JButton btnDelete;
	private JButton btnUpdate_1;
	private JButton btnClear;
	DefaultTableModel model;
	private JButton btnAdd;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField idTF;
	private JLabel lblNewLabel_14;
	protected JTable jTable_Display_User;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JTextField totalTF;
	private JTextField currenttotalTF;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_4;
	private JTextField damageTF;
	private JTextField currentdamageTF;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anotherTest window = new anotherTest();
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
	public anotherTest() {
		initialize();
		


	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE DEDUCTION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(25, 11, 204, 30);
		frame.getContentPane().add(lblNewLabel);
		
		
		idTF = new JTextField();
		idTF.setColumns(10);
        idTF.setEditable(false);
		idTF.setBounds(117, 86, 112, 20);
		frame.getContentPane().add(idTF);
		
		lblNewLabel_14 = new JLabel("ID");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(25, 79, 31, 30);
		frame.getContentPane().add(lblNewLabel_14);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 110, 91, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Middle Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(25, 144, 91, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(25, 175, 83, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		firstNameTF = new JTextField();
        firstNameTF.setEditable(false);
		firstNameTF.setBounds(117, 117, 112, 20);
		frame.getContentPane().add(firstNameTF);
		firstNameTF.setColumns(10);
		
		middleNameTF = new JTextField();
		middleNameTF.setColumns(10);
        middleNameTF.setEditable(false);
		middleNameTF.setBounds(117, 151, 112, 20);
		frame.getContentPane().add(middleNameTF);
		
		lastNameTF = new JTextField();
		lastNameTF.setColumns(10);
        lastNameTF.setEditable(false);
		lastNameTF.setBounds(117, 182, 112, 20);
		frame.getContentPane().add(lastNameTF);
		
		
		
		
		
		
		
		comboBox_6 = new JComboBox();
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
                String selectedOption = (String) comboBox_6.getSelectedItem();
                
                switch (selectedOption) {
                case "Cashier","Server","Cook","Dishwasher":
                    rateTF.setText("₱443");
                    break;
              
                default:
                	rateTF.setText(""); // Clear the text field if none of the options match
                    break;
				
			}}
		});
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Cashier", "Server", "Cook", "Dishwasher"}));
        comboBox_6.setEditable(false);
		comboBox_6.setBounds(117, 220, 100, 22);
		frame.getContentPane().add(comboBox_6);
		
		lblNewLabel_17 = new JLabel("Rate/hour");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_17.setBounds(25, 246, 91, 30);
		frame.getContentPane().add(lblNewLabel_17);
		
		rateTF = new JTextField();
		rateTF.setColumns(10);
		rateTF.setBounds(117, 253, 112, 20);
		rateTF.setEditable(false);
		frame.getContentPane().add(rateTF);
		
		
		lblNewLabel_18 = new JLabel("Branch");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_18.setBounds(27, 277, 89, 30);
		frame.getContentPane().add(lblNewLabel_18);
		
		branchTF = new JTextField();
		branchTF.setColumns(10);
        branchTF.setEditable(false);
		branchTF.setBounds(117, 284, 112, 20);
		frame.getContentPane().add(branchTF);
		
		
		
		btnNewButton_1 = new JButton("Back to Menu");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuAdmin_Class obj=new MenuAdmin_Class();
				obj.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(464, 647, 110, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		scrollPane.setBounds(454, 38, 663, 521);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
				
				String tb1id = tb1Model.getValueAt(table.getSelectedRow(), 0). toString();
				String tb1first_name = tb1Model.getValueAt(table.getSelectedRow(), 1). toString();
				String tb1middle_name = tb1Model.getValueAt(table.getSelectedRow(), 2). toString();
				String tb1last_name =tb1Model.getValueAt(table.getSelectedRow(), 3). toString();
				String tb1job_title=tb1Model.getValueAt(table.getSelectedRow(), 4). toString();
				String tb1rate=tb1Model.getValueAt(table.getSelectedRow(), 5). toString();
				String tb1branch=tb1Model.getValueAt(table.getSelectedRow(), 6). toString();
				String tb1machinery_damage=tb1Model.getValueAt(table.getSelectedRow(), 7). toString();
			
			
				String tb1total=tb1Model.getValueAt(table.getSelectedRow(), 8). toString();

				
				
				idTF.setText(tb1id);
				firstNameTF.setText(tb1first_name);
				middleNameTF.setText(tb1middle_name);
				lastNameTF.setText(tb1last_name);
				comboBox_6.setSelectedItem(tb1job_title);
				rateTF.setText(tb1rate);
				branchTF.setText(tb1branch);
				damageTF.setText(tb1machinery_damage);
			
				totalTF.setText(tb1total);
				
				
				
							}
			
			
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID","FirstName", "MiddleName", "LastName","Job Title","R/hr","Branch","Machinery Damage","Total"
			}
		));
		
		JLabel lblNewLabel_2 = new JLabel("DEDUCTION RECORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(126, 333, 173, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnNewButton = new JButton("SHOW TABLE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//double money_lost = Double.parseDouble(lostTF.getText());
	            //String lostcurrency = String.format("₱%.2f", money_lost);
	            //lostTF.setText(lostcurrency);
	            
			
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from addemployee");
					while(rs.next()) {
				
						String id = String.valueOf(rs.getInt("id"));
						String first_name = rs.getString("first_name");
						String middle_name = rs.getString("middle_name");
						String last_name = rs.getString("last_name");
						String jobTitle_combo = rs.getString("job_title");
						String rate = rs.getString("rate");
						String branch = rs.getString("branch");
						String machinery_damage = rs.getString("machinery_damage");
						
					

						
					String tbData[] = {id,first_name,middle_name,last_name,jobTitle_combo,rate,branch,machinery_damage};
					DefaultTableModel tb1Model = (DefaultTableModel)table.getModel();
					
					
					
					tb1Model.addRow(tbData);
					
					
					
			}
					
					con.close();
					
				}catch(Exception e1) {
					System.out.println(e1.getMessage());
				}}
		});
		btnNewButton.setBounds(464, 570, 122, 37);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		btnNewButton_2 = new JButton("COMPUTE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		       

				 try {
					 //TOTAL HISTORY DATA
			            String first_name = firstNameTF.getText();
			            String middle_name = middleNameTF.getText();
			            String last_name = lastNameTF.getText();
			            String rate = rateTF.getText();
			            String branch = branchTF.getText();
			            String id = idTF.getText();
			            String job_title = comboBox_6.getSelectedItem().toString();
			         
			            
			            //moneyLOST
			          
			            double machinery_damage = Double.parseDouble(damageTF.getText());
			            String damagecurrency = String.format("₱%.2f", machinery_damage);
			            damageTF.setText(damagecurrency);
			            
			            double currentmachinery_damage = Double.parseDouble(currentdamageTF.getText());
			            String currentmachinery_damagecurrency = String.format("₱%.2f", currentmachinery_damage);
			            currentdamageTF.setText(currentmachinery_damagecurrency);
			            
			            
			          
			            
			            /////////////////////////////////////////////////////SUM UP
			            double totaldamage = currentmachinery_damage +machinery_damage;
			            String totdamage = String.format("₱%.2f", totaldamage);
			            damageTF.setText(totdamage);
			            
			         
			            
			            
			            /////////////////////////////////////
			            
			            double currenttotaldeduct = currentmachinery_damage;
			            String ata = String.format("₱%.2f", currenttotaldeduct);
			            currenttotalTF.setText(ata);
			            
			            
			            double totaldeduct = machinery_damage;
			            String at = String.format("₱%.2f", totaldeduct);
			            totalTF.setText(at);
			            
			            
			        
			            
			            
			            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
			            String sql = "UPDATE addemployee SET first_name=?, middle_name=?, last_name=?, job_title=?, rate=?, branch=?, machinery_damage=?, currentmachinery_damage=?,totaldeduct=? WHERE id=?";
			            PreparedStatement pst = con.prepareStatement(sql);

			            // Set the values for the placeholders in the PreparedStatement
			            pst.setString(1, first_name);
			            pst.setString(2, middle_name);
			            pst.setString(3, last_name);
			            pst.setString(4, job_title);
			            pst.setString(5, rate);
			            pst.setString(6, branch);
			            
			            pst.setDouble(7, totaldamage);
			            pst.setDouble(8, currentmachinery_damage);


			            pst.setString(9, id);

			            int rowsUpdated = pst.executeUpdate();

			            if (rowsUpdated > 0) {
			                JOptionPane.showMessageDialog(null, "Record Updated");
			            } else {
			                JOptionPane.showMessageDialog(null, "No records were updated");
			            }

			            pst.close();
			            con.close();
			        } catch (Exception e1) {
			            JOptionPane.showMessageDialog(null, e1);
			        }
    			}
    		});
   

		btnNewButton_2.setBounds(305, 640, 112, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		totalTF = new JTextField();
		totalTF.setEditable(false);
		totalTF.setBounds(143, 588, 86, 20);
		frame.getContentPane().add(totalTF);
		totalTF.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Job Title");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(25, 216, 83, 30);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("_________________________________________________");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(26, 358, 418, 30);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("_________________________________________________");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(26, 549, 418, 10);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Total:");
		lblNewLabel_2_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_2_1.setBounds(30, 576, 103, 20);
		frame.getContentPane().add(lblNewLabel_2_3_2_1);
		
		currenttotalTF = new JTextField();
		currenttotalTF.setColumns(10);
		currenttotalTF.setBounds(313, 588, 86, 20);
		frame.getContentPane().add(currenttotalTF);
		
		lblNewLabel_2_3 = new JLabel("TOTAL HISTORY");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(138, 386, 118, 20);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		lblNewLabel_2_4 = new JLabel("Input Current");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4.setBounds(305, 386, 118, 20);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		damageTF = new JTextField();
		damageTF.setEditable(false);
		damageTF.setColumns(10);
		damageTF.setBounds(152, 451, 86, 20);
		frame.getContentPane().add(damageTF);
		
		currentdamageTF = new JTextField();
		currentdamageTF.setColumns(10);
		currentdamageTF.setBounds(325, 451, 86, 20);
		frame.getContentPane().add(currentdamageTF);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Damage");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(23, 444, 165, 30);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		

		
		Object pass = null;
		
	

	    }
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		

	}
}
