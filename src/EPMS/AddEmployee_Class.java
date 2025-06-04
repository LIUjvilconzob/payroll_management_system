package EPMS;
import java.awt.EventQueue;



import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.text.JTextComponent;

import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;

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






public class AddEmployee_Class extends JFrame {
	protected static final int YourPrimaryKeyColumnIndex = 0;
	JFrame frame;
	private JTextField firstNameTF;
	private JTextField middleNameTF;
	private JTextField lastNameTF;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField ageTF;
	private JTextField contactTF;
	private JTextField emailTF;
	private JTextField streetTF;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_7;
	private JTextField cityTF;
	private JLabel lblNewLabel_8;
	private JTextField stateTF;
	private JLabel lblNewLabel_9;
	private JTextField zipTF;
	private JLabel lblNewLabel_10;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_11;
	private JComboBox comboBox_4;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_12;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JTextField dateHiredTF;
	private JLabel lblNewLabel_17;
	private JTextField rateTF;
	private JLabel lblNewLabel_18;
	private JTextField branchTF;
	private JLabel lblNewLabel_6;
	private JButton btnDelete;
	private JButton btnUpdate_1;
	private JButton btnClear;
	DefaultTableModel model;
	private JLabel lblNewLabel_13;
	private JButton btnAdd;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField idTF;
	private JLabel lblNewLabel_14;
	protected JTable jTable_Display_User;
	private JButton btnNewButton_1;
	Connection con;
	PreparedStatement pst;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee_Class window = new AddEmployee_Class();
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
	public AddEmployee_Class() {
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
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 11, 204, 30);
		frame.getContentPane().add(lblNewLabel);
		
		
		idTF = new JTextField();
		idTF.setColumns(10);
		idTF.setBounds(305, 59, 112, 20);
		frame.getContentPane().add(idTF);
		
		lblNewLabel_14 = new JLabel("ID");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(276, 52, 31, 30);
		frame.getContentPane().add(lblNewLabel_14);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 52, 91, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Middle Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(25, 80, 91, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(25, 108, 83, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		firstNameTF = new JTextField();
		firstNameTF.setBounds(119, 59, 112, 20);
		frame.getContentPane().add(firstNameTF);
		firstNameTF.setColumns(10);
		
		middleNameTF = new JTextField();
		middleNameTF.setColumns(10);
		middleNameTF.setBounds(119, 87, 112, 20);
		frame.getContentPane().add(middleNameTF);
		
		lastNameTF = new JTextField();
		lastNameTF.setColumns(10);
		lastNameTF.setBounds(119, 115, 112, 20);
		frame.getContentPane().add(lastNameTF);
		
		
		
		//beginning of birthdate
		
		
		
		lblNewLabel_1_3 = new JLabel("Birth Date");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(25, 198, 91, 30);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		
		
		
		lblNewLabel_11 = new JLabel("Civil Status");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(25, 166, 83, 30);
		frame.getContentPane().add(lblNewLabel_11);
		
		
		String[] civilStatus = {
				"Single", "Married", "Divorced", "Widowed"};
		
		comboBox_4 = new JComboBox(civilStatus);
		comboBox_4.setBounds(119, 172, 75, 22);
		frame.getContentPane().add(comboBox_4);
		
		lblNewLabel_12 = new JLabel("Sex");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(25, 138, 62, 30);
		frame.getContentPane().add(lblNewLabel_12);
		
		String[] gender = { 
				"Man", "Woman", "Gay", "Lesbian"
		};
		
		comboBox_5 = new JComboBox(gender);
		comboBox_5.setBounds(119, 144, 75, 22);
		frame.getContentPane().add(comboBox_5);
		
	
		
	
		
		
		
		
		
		
		
		
		//arrayList for months
		
		 String[] monthNames = {
	                "January", "February", "March", 
	                "April", "May", "June", "July", "August",
	                "September", "October", "November", "December"};
	        
		comboBox = new JComboBox<>(monthNames);
		
		comboBox.setBounds(119, 204, 75, 22);
		frame.getContentPane().add(comboBox);
		
		

		//arrayList for days
		
		 List<Integer> days = new ArrayList<>();
	        for (int day = 1; day <= 31; day++) {
	            days.add(day);
	        }

		comboBox_1 = new JComboBox<>(days.toArray(new Integer[0]));
		comboBox_1.setBounds(204, 204, 50, 22);
		
		frame.getContentPane().add(comboBox_1);
		
		
		
		
		//arrayList for birthYear
		
		
		 List<Integer> years = new ArrayList<>();
	        for (int year = 1900; year <= 2050; year++) {
	            years.add(year);
	        }
		
		
		comboBox_2 = new JComboBox<>(years.toArray(new Integer[0]));
        comboBox_2.setSelectedItem("2023");

		comboBox_2.setBounds(264, 204, 75, 22);
		frame.getContentPane().add(comboBox_2);
		
		lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(35, 228, 42, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Contact Number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(25, 490, 120, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(25, 449, 50, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		ageTF = new JTextField();
		ageTF.setColumns(10);
		ageTF.setBounds(119, 237, 57, 20);
		frame.getContentPane().add(ageTF);
		
		contactTF = new JTextField();
		contactTF.setColumns(10);
		contactTF.setBounds(146, 497, 151, 20);
		frame.getContentPane().add(contactTF);
		
		emailTF = new JTextField();
		emailTF.setColumns(10);
		emailTF.setBounds(85, 456, 151, 20);
		frame.getContentPane().add(emailTF);
		
		streetTF = new JTextField();
		streetTF.setColumns(10);
		streetTF.setBounds(146, 289, 271, 20);
		frame.getContentPane().add(streetTF);
		
		
		
		
		lblNewLabel_5 = new JLabel("Street Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(25, 282, 112, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_7 = new JLabel("City");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(25, 367, 42, 30);
		frame.getContentPane().add(lblNewLabel_7);
		
		cityTF = new JTextField();
		cityTF.setColumns(10);
		cityTF.setBounds(146, 374, 143, 20);
		frame.getContentPane().add(cityTF);
		
		lblNewLabel_8 = new JLabel("State/Province");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(25, 342, 107, 30);
		frame.getContentPane().add(lblNewLabel_8);
		
		stateTF = new JTextField();
		stateTF.setColumns(10);
		stateTF.setBounds(146, 349, 173, 20);
		frame.getContentPane().add(stateTF);
		
		lblNewLabel_9 = new JLabel("Zip Code");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(25, 401, 91, 30);
		frame.getContentPane().add(lblNewLabel_9);
		
		zipTF = new JTextField();
		zipTF.setColumns(10);
		zipTF.setBounds(146, 405, 158, 20);
		frame.getContentPane().add(zipTF);
		
		lblNewLabel_10 = new JLabel("Country");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(25, 311, 91, 30);
		frame.getContentPane().add(lblNewLabel_10);
		
		
		
		


String[] countriesNames = {

		"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", 
		"Armenia", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", 
		"Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", 
		"Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", 
		"Cape Verde", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", 
		"Congo, Republic of the", "Congo, Democratic Republic of the", "Costa Rica", "Cote d'Ivoire", "Croatia", 
		"Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", 
		"East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", 
		"Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "The Gambia", "Georgia", "Germany", 
		"Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras",
		"Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica",
		"Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait",
		"Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", 
		"Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", 
		"Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia, Federated States of", "Moldova", 
		"Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", 
		"Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", 
		"Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", 
		"Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", 
		"Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", 
		"Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", 
		"South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", 
		"Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", 
		"Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", 
		"United States of America", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City",
		"Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
		

};
	
		comboBox_3 = new JComboBox(countriesNames);
        comboBox_3.setSelectedItem("Philippines");

		comboBox_3.setBounds(146, 320, 90, 22);
		frame.getContentPane().add(comboBox_3);
		
		
		
		lblNewLabel_15 = new JLabel("Job Title");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(25, 590, 62, 30);
		frame.getContentPane().add(lblNewLabel_15);
		

		
		
		
		
		
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
		comboBox_6.setBounds(104, 596, 100, 22);
		frame.getContentPane().add(comboBox_6);
		
		lblNewLabel_16 = new JLabel("Date Hired");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_16.setBounds(25, 529, 89, 30);
		frame.getContentPane().add(lblNewLabel_16);
		
		dateHiredTF = new JTextField();
		dateHiredTF.setColumns(10);
		dateHiredTF.setBounds(102, 531, 143, 20);
		frame.getContentPane().add(dateHiredTF);
		
		lblNewLabel_17 = new JLabel("Basic Salary");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_17.setBounds(10, 631, 91, 30);
		frame.getContentPane().add(lblNewLabel_17);
		
		rateTF = new JTextField();
		rateTF.setColumns(10);
		rateTF.setBounds(104, 638, 112, 20);
		rateTF.setEditable(false);
		frame.getContentPane().add(rateTF);
		
		
		lblNewLabel_18 = new JLabel("Branch");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_18.setBounds(25, 662, 89, 30);
		frame.getContentPane().add(lblNewLabel_18);
		
		branchTF = new JTextField();
		branchTF.setColumns(10);
		branchTF.setBounds(104, 669, 112, 20);
		frame.getContentPane().add(branchTF);
		
		
		
		btnNewButton_1 = new JButton("MENU");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuAdmin_Class obj=new MenuAdmin_Class();
				obj.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(824, 596, 100, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("ADD (Database)");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				
				if(idTF.getText().equals("") || firstNameTF.getText().equals("") || middleNameTF.getText().equals("") || lastNameTF.getText().equals("") || ageTF.getText().equals("") || streetTF.getText().equals("") ||stateTF.getText().equals("") || cityTF.getText().equals("") || zipTF.getText().equals("") || emailTF.getText().equals("") ||contactTF.getText().equals("") ||dateHiredTF.getText().equals("") ||rateTF.getText().equals("") ||branchTF.getText().equals("") || idTF.getText().equals("") || comboBox_5.getSelectedItem().toString().equals("") || comboBox_4.getSelectedItem().toString().equals("") ||comboBox.getSelectedItem().toString().equals("") ||comboBox_1.getSelectedItem().toString().equals("") ||comboBox_2.getSelectedItem().toString().equals("") ||comboBox_3.getSelectedItem().toString().equals("") ||comboBox_6.getSelectedItem().toString().equals("")) 
				
					JOptionPane.showMessageDialog(null, "Please fill the complete information");
				
				
						
				
				
				
				
			
		
				
				try {
				
				
				String first_name = firstNameTF.getText();
				String middle_name = middleNameTF.getText();
				String last_name = lastNameTF.getText();
				int age =Integer.parseInt(ageTF.getText());
				String street_address = streetTF.getText();
				String state = stateTF.getText();
				String city = cityTF.getText();
				int zip = Integer.parseInt(zipTF.getText());
				String email = emailTF.getText();
				long contact = Long.parseLong(contactTF.getText());
				String date_hired = dateHiredTF.getText();
				String rate = rateTF.getText();
				String branch = branchTF.getText();
				int id = Integer.parseInt(idTF.getText());
				
				
				
				String gender_combo = comboBox_5.getSelectedItem().toString();
				String cstatus_combo = comboBox_4.getSelectedItem().toString();

				String month_combo = comboBox.getSelectedItem().toString();
				String day_combo = comboBox_1.getSelectedItem().toString();
				String year_combo = comboBox_2.getSelectedItem().toString();
				String countries_combo = comboBox_3.getSelectedItem().toString();
				String jobTitle_combo = comboBox_6.getSelectedItem().toString();
				String money_lost = "0";
				String currentmoney_lost = "0";

				String machinery_damage = "0";
				String currentmachinery_damage = "0";

				String equipment_lost = "0";
				String currentequipment_lost = "0";

				String tardiness = "0";
				String currenttardiness = "0";

				String sss = "0";
				String currentsss = "0";

				String philhealth = "0";
				String currentphilhealth = "0";

				String totaldeduct = "0";
				String regularOT = "0";
				String currentregularOT = "0";
				String holiday = "0";
				String currentholidayOT = "0";
				String totalOT = "0";
				String totaldays= "0";
				String totalpayment = "0";


				//"','"+ money_lost +"','"+currentmoney_lost +"','"+machinery_damage +"','""+equipment_lost +"','"








			
				
				//int yearExp = Integer.parseInt(tf1.getText());
				
				
				 String msg = "" + first_name;
	                msg += " \n";
	
				
				

		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms", "root", "");

		            // Use PreparedStatement to prevent SQL injection
		            String addEmployeeQuery = "INSERT INTO addemployee VALUES('" +id+"','"+ first_name +"','" + middle_name + "','" + last_name + "','" + gender_combo+"','"+cstatus_combo+"','" + month_combo+"','"+day_combo+"','"+year_combo+"','"+ age + "','" + street_address + "','" +countries_combo+"','"+ state + "','"+ city + "','" + zip + "','" + email + "','" + contact + "','"+date_hired + "','" +jobTitle_combo+"','" +rate + "','" +branch +"','" +money_lost +"','"+currentmoney_lost +"','"+machinery_damage +"','"+currentmachinery_damage +"','"+equipment_lost +"','"+currentequipment_lost +"','"+tardiness +"','"+currenttardiness +"','"+sss +"','"+currentsss +"','"+philhealth +"','"+currentphilhealth +"','"+totaldeduct +"','"+regularOT +"','"+currentregularOT +"','"+holiday +"','"+currentholidayOT +"','"+totalOT +"','"+totaldays+"','"+totalpayment+"')";


		            Statement sta = con.createStatement();
                    int x = sta.executeUpdate(addEmployeeQuery);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    con.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
		        

			
				
                }	
				
				
				
			}	    
		});
		btnNewButton.setBounds(265, 596, 117, 49);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_6 = new JLabel("__________________________________________________________");
		lblNewLabel_6.setBounds(25, 27, 500, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 int selectedRow = table.getSelectedRow();
	                if (selectedRow != -1) {
	                	
	                	
	                	
	                    DefaultTableModel model = (DefaultTableModel) table.getModel();

	                    // Get the data from the selected row to construct the DELETE statement
	                    // You will need to adjust this part based on your table structure
	                    String idToDelete = table.getValueAt(selectedRow, 0).toString(); // Assuming ID is in the first column

	                    
	                    
	                 
	                   try {
	                    
	                	  
	   					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms","root","");
                        String deleteQuery = "DELETE FROM `addemployee` WHERE id = ?";
                        PreparedStatement preparedStatement = con.prepareStatement(deleteQuery);
                        preparedStatement.setString(1, idToDelete);
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
                        con.close();
                      
                        
                        
                        
                        

			}catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error deleting row: " + ex.getMessage());
            }
        } else {
            
            JOptionPane.showMessageDialog(frame, "Please select a row to delete in the Table List!");
            JOptionPane.showMessageDialog(frame, "Click 'SHOW TABLE' too see records");

            JOptionPane.showMessageDialog(frame, "Button Clicked!", "DELETED", JOptionPane.INFORMATION_MESSAGE);

            
        try {
			             
            int rowsUpdated = pst.executeUpdate();
				    
				    if (rowsUpdated > 0) {
				        JOptionPane.showMessageDialog(null, "Record Deleted Completely");
				    } else {
				        JOptionPane.showMessageDialog(null, "");
				    }

				    pst.close();
				    con.close();
				} catch (Exception e1) {
				    JOptionPane.showMessageDialog(null, e1);
				
				}}}
		
				
		
		});
		btnDelete.setBounds(465, 647, 112, 30);
		frame.getContentPane().add(btnDelete);
		
		btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				   /// String value1 = idTF.getText();
				    //String value2 = firstNameTF.getText();
				   // String value3 = ageTF.getText();
					
					// String value3 = ageTF.getText();
				    //int ageInt = Integer.parseInt(value3);
					
			
					
					String first_name = firstNameTF.getText();
					String middle_name = middleNameTF.getText();
					String last_name = lastNameTF.getText();
					String age = ageTF.getText();
					String street_address = streetTF.getText();
					String state = stateTF.getText();
					String city = cityTF.getText();
					String zip = zipTF.getText();
					String email = emailTF.getText();
					String contact = contactTF.getText();
					String date_hired = dateHiredTF.getText();
					String rate = rateTF.getText();
					String branch = branchTF.getText();
					String id =idTF.getText();
					
					int ageInt = 0;
				    int zipInt = 0;
				    long contactLong = 0;

				    if (!age.isEmpty()) {
				        ageInt = Integer.parseInt(age);
				        if (contactLong <= 11) {
				            JOptionPane.showMessageDialog(null, "Contact number should contain 11 numbers in your country");
				            return; 
				        }
				    
				    }
				    if (!zip.isEmpty()) {
				        zipInt = Integer.parseInt(zip);
				    }
				    if (!contact.isEmpty()) {
				        contactLong = Long.parseLong(contact);
				    }
					
					String gender_combo = comboBox_5.getSelectedItem().toString();
					String cstatus_combo = comboBox_4.getSelectedItem().toString();
					String month_combo = comboBox.getSelectedItem().toString();
					String day_combo = comboBox_1.getSelectedItem().toString();
					String year_combo = comboBox_2.getSelectedItem().toString();
					String countries_combo = comboBox_3.getSelectedItem().toString();
					String jobTitle_combo = comboBox_6.getSelectedItem().toString();
				    
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms", "root", "");

				    String sql = "update addemployee set id=?, first_name=?, middle_name=?, last_name=?, gender_combo=?, cstatus_combo=?, month_combo=?, day_combo=?, year_combo=?, age=?, street_address=?, countries_combo=?, state=?, city=?,zip=?, email=?, contact=?, date_hired=?, job_title=?, rate=?, branch=? where id=?";
				    PreparedStatement pst = con.prepareStatement(sql);
				    
				    // Set the values for the placeholders in the PreparedStatement
				   
				    
				    pst.setString(1, id);
				    pst.setString(2, first_name);
				    pst.setString(3, middle_name);
				    pst.setString(4, last_name);
				    pst.setString(5, gender_combo);
				    pst.setString(6, cstatus_combo);
				    pst.setString(7, month_combo);
				    pst.setString(8, day_combo);
				    pst.setString(9, year_combo);
				    pst.setInt(10, ageInt);
				    pst.setString(11, street_address);
				    pst.setString(12, countries_combo);
				    pst.setString(13, state);
				    pst.setString(14, city);
				    pst.setInt(15, zipInt);
				    pst.setString(16, email);
				    pst.setLong(17, contactLong);
				    pst.setString(18, date_hired);
				    pst.setString(19, jobTitle_combo);

				    pst.setString(20, rate);
				    pst.setString(21, branch);
				    pst.setString(22, id);



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
		btnUpdate_1.setBounds(659, 592, 100, 30);
		frame.getContentPane().add(btnUpdate_1);
		
		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNameTF.setText("");
				middleNameTF.setText("");
				lastNameTF.setText("");
				ageTF.setText("");
				streetTF.setText("");
				stateTF.setText("");
				cityTF.setText("");
				zipTF.setText("");
				emailTF.setText("");
				contactTF.setText("");
				dateHiredTF.setText("");
				rateTF.setText("");
				branchTF.setText("");
				idTF.setText("");
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				
			}
		});
		btnClear.setBounds(659, 644, 89, 30);
		frame.getContentPane().add(btnClear);
		
		lblNewLabel_13 = new JLabel("mm/dd/yy");
		lblNewLabel_13.setBounds(255, 528, 84, 31);
		frame.getContentPane().add(lblNewLabel_13);
		
		btnAdd = new JButton("SHOW TABLE");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms","root","");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from addemployee");
					while(rs.next()) {
				
						String id = String.valueOf(rs.getInt("id"));
						String first_name = rs.getString("first_name");
						String middle_name = rs.getString("middle_name");
						String last_name = rs.getString("last_name");
						String gender_combo = rs.getString("gender_combo");
						String year_combo = rs.getString("year_combo");
						String street_address = rs.getString("street_address");
						String email = rs.getString("email");
						String contact = String.valueOf(rs.getLong("contact"));
						String date_hired = rs.getString("date_hired");
						String jobTitle_combo = rs.getString("job_title");
						String rate = rs.getString("rate");
						String branch = rs.getString("branch");

						
					String tbData[] = {id,first_name,middle_name,last_name,gender_combo,year_combo,street_address,email,contact,date_hired,jobTitle_combo,rate,branch};
					DefaultTableModel tb1Model = (DefaultTableModel)table.getModel();
					
					
					
					tb1Model.addRow(tbData);
					
					
					
			}
					
					con.close();
					
				}catch(Exception e1) {
					System.out.println(e1.getMessage());
				}}
			
					
		});
		btnAdd.setBounds(465, 590, 112, 29);
		frame.getContentPane().add(btnAdd);
		
		scrollPane = new JScrollPane();
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
				String tb1gender_combo =tb1Model.getValueAt(table.getSelectedRow(), 4). toString();
				String tb1year_combo =tb1Model.getValueAt(table.getSelectedRow(), 5). toString();
				String tb1street_address =tb1Model.getValueAt(table.getSelectedRow(), 6). toString();
				String tb1email = tb1Model.getValueAt(table.getSelectedRow(), 7). toString();
				String tb1contact=tb1Model.getValueAt(table.getSelectedRow(), 8). toString();
				String tb1date_hired=tb1Model.getValueAt(table.getSelectedRow(), 9). toString();
				String tb1job_title=tb1Model.getValueAt(table.getSelectedRow(), 10). toString();
				String tb1rate=tb1Model.getValueAt(table.getSelectedRow(), 11). toString();
				String tb1branch=tb1Model.getValueAt(table.getSelectedRow(), 12). toString();



				idTF.setText(tb1id);
				firstNameTF.setText(tb1first_name);
				middleNameTF.setText(tb1middle_name);
				lastNameTF.setText(tb1last_name);
				comboBox_5.setSelectedItem(tb1gender_combo);
				comboBox_2.setSelectedItem(tb1year_combo);
				streetTF.setText(tb1street_address);
				emailTF.setText(tb1email);
				contactTF.setText(tb1contact);
				dateHiredTF.setText(tb1date_hired);
				comboBox_6.setSelectedItem(tb1job_title);
				rateTF.setText(tb1rate);
				branchTF.setText(tb1branch);

				
				
				
				
				
				
							}
			
			
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID","FirstName", "MiddleName", "LastName","Gender","Birth Year","S.Address","Email","#","D.Hired","Job Title","Salary","Branch"
			}
		));
		

		
		Object pass = null;
		
	

	    }
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		

	}
}
