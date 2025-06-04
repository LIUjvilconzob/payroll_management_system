package EPMS;

import java.awt.EventQueue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ScrollPaneConstants;

public class AddEmployee extends JFrame {

	private JFrame frmEmployeesPayrollManagement;
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
	private JButton btnUpdate;
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
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee_Class frame = new AddEmployee_Class ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddEmployee () {
		
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE REGISTRATION");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(100, 20, 340, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel);
		
		idTF = new JTextField();
		idTF.setColumns(10);
		idTF.setBounds(250, 210, 105, 30);
		frmEmployeesPayrollManagement.getContentPane().add(idTF);
		
		lblNewLabel_14 = new JLabel("ID");
		lblNewLabel_14.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_14.setBounds(220, 210, 31, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(25, 60, 91, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Middle Name");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(25, 90, 105, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(25, 120, 83, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_1_2);
		
		firstNameTF = new JTextField();
		firstNameTF.setBounds(140, 60, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(firstNameTF);
		firstNameTF.setColumns(10);
		
		middleNameTF = new JTextField();
		middleNameTF.setColumns(10);
		middleNameTF.setBounds(140, 90, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(middleNameTF);
		
		lastNameTF = new JTextField();
		lastNameTF.setColumns(10);
		lastNameTF.setBounds(140, 120, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lastNameTF);
		
		//beginning of birthdate
		
		lblNewLabel_1_3 = new JLabel("Birth Date");
		lblNewLabel_1_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(25, 180, 100, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_1_3);
		
		lblNewLabel_11 = new JLabel("Civil Status");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(255, 150, 83, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_11);
		
		String[] civilStatus = {
				"Single", "Married", "Divorced", "Widowed"};
		
		comboBox_4 = new JComboBox<>(civilStatus);
		comboBox_4.setBounds(345, 150, 100, 30);
		frmEmployeesPayrollManagement.getContentPane().add(comboBox_4);
		
		lblNewLabel_12 = new JLabel("Sex");
		lblNewLabel_12.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_12.setBounds(25, 150, 62, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_12);
		
		String[] sex = { 
				"Male", "Female"
		};
		
		comboBox_5 = new JComboBox<>(sex);
		comboBox_5.setBounds(140, 150, 100, 30);
		frmEmployeesPayrollManagement.getContentPane().add(comboBox_5);
		
		String[] monthNames = {
	                "January", "February", "March", 
	                "April", "May", "June", "July", "August",
	                "September", "October", "November", "December"};
	        
		comboBox = new JComboBox<>(monthNames);
		comboBox.setBounds(140, 180, 100, 30);
		frmEmployeesPayrollManagement.getContentPane().add(comboBox);

		//arrayList for days
		
		 List<Integer> days = new ArrayList<>();
	        for (int day = 1; day <= 31; day++) {
	            days.add(day);
	        }

		comboBox_1 = new JComboBox<>(days.toArray(new Integer[0]));
		comboBox_1.setBounds(260, 180, 70, 30);
		
		frmEmployeesPayrollManagement.getContentPane().add(comboBox_1);
		
		//arrayList for birthYear
		
		 List<Integer> years = new ArrayList<>();
	        for (int year = 1900; year <= 2050; year++) {
	            years.add(year);
	        }
		
		
		comboBox_2 = new JComboBox<>(years.toArray(new Integer[0]));
		comboBox_2.setBounds(345, 180, 100, 30);
		frmEmployeesPayrollManagement.getContentPane().add(comboBox_2);
		
		lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_2.setBounds(25, 210, 42, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Contact Num.");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_3.setBounds(25, 480, 110, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_4.setBounds(25, 450, 50, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_4);
		
		ageTF = new JTextField();
		ageTF.setColumns(10);
		ageTF.setBounds(140, 210, 70, 30);
		frmEmployeesPayrollManagement.getContentPane().add(ageTF);
		
		contactTF = new JTextField();
		contactTF.setColumns(10);
		contactTF.setBounds(140, 480, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(contactTF);
		
		emailTF = new JTextField();
		emailTF.setFont(new Font("SansSerif", Font.PLAIN, 15));
		emailTF.setColumns(10);
		emailTF.setBounds(140, 450, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(emailTF);
		
		streetTF = new JTextField();
		streetTF.setColumns(10);
		streetTF.setBounds(140, 270, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(streetTF);
		
		lblNewLabel_5 = new JLabel("Street Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(25, 270, 112, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_7 = new JLabel("City");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_7.setBounds(25, 358, 42, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_7);
		
		cityTF = new JTextField();
		cityTF.setColumns(10);
		cityTF.setBounds(140, 360, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(cityTF);
		
		lblNewLabel_8 = new JLabel("State/Province");
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_8.setBounds(25, 330, 110, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_8);
		
		stateTF = new JTextField();
		stateTF.setColumns(10);
		stateTF.setBounds(140, 330, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(stateTF);
		
		lblNewLabel_9 = new JLabel("Zip Code");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_9.setBounds(25, 390, 91, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_9);
		
		zipTF = new JTextField();
		zipTF.setColumns(10);
		zipTF.setBounds(140, 390, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(zipTF);
		
		lblNewLabel_10 = new JLabel("Country");
		lblNewLabel_10.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_10.setBounds(25, 300, 91, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_10);
		
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
		comboBox_3.setBounds(140, 300, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(comboBox_3);
		
		
		
		lblNewLabel_15 = new JLabel("Job Title");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(25, 540, 62, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_15);
		

		
		
		
		
		
		comboBox_6 = new JComboBox();
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
             String selectedOption = (String) comboBox_6.getSelectedItem();
                
                switch (selectedOption) {
                case "Cashier":
                    rateTF.setText("₱58");
                    break;
                case "Server":
                    rateTF.setText("₱56");
                    break;
                case "Cook":
                	rateTF.setText("₱60");
                    break;
                case "Dishwasher":
                	rateTF.setText("₱56");
                	break;
                default:
                	rateTF.setText(""); // Clear the text field if none of the options match
                    break;

			}
		}});
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Cashier", "Server", "Cook", "Dishwasher"}));
		comboBox_6.setBounds(140, 540, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(comboBox_6);
		
		lblNewLabel_16 = new JLabel("Date Hired");
		lblNewLabel_16.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_16.setBounds(25, 510, 89, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_16);
		
		dateHiredTF = new JTextField();
		dateHiredTF.setColumns(10);
		dateHiredTF.setBounds(140, 510, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(dateHiredTF);
		
		lblNewLabel_17 = new JLabel("Rate/hour");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_17.setBounds(25, 570, 91, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_17);
		
		rateTF = new JTextField();
		rateTF.setColumns(10);
		rateTF.setBounds(140, 570, 305, 30);
		rateTF.setEditable(false);
		frmEmployeesPayrollManagement.getContentPane().add(rateTF);
		
		lblNewLabel_18 = new JLabel("Branch");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_18.setBounds(25, 600, 89, 30);
		frmEmployeesPayrollManagement.getContentPane().add(lblNewLabel_18);
		
		branchTF = new JTextField();
		branchTF.setColumns(10);
		branchTF.setBounds(140, 600, 305, 30);
		frmEmployeesPayrollManagement.getContentPane().add(branchTF);
		
		btnNewButton_1 = new JButton("RETURN TO MENU");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuAdmin_Class obj=new MenuAdmin_Class ();
				obj.setVisible(true);
				frmEmployeesPayrollManagement.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(915, 570, 200, 30);
		frmEmployeesPayrollManagement.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
				int contact = Integer.parseInt(contactTF.getText());	
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
		
				//int yearExp = Integer.parseInt(tf1.getText());
				
				 String msg = "" + first_name;
	                msg += " \n";

		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee's information", "root", "");

		            // Use PreparedStatement to prevent SQL injection
		            String addEmployeeQuery = "INSERT INTO addemployee VALUES('" +id+"','"+ first_name +"','" + middle_name + "','" + last_name + "','" + gender_combo+"','"+cstatus_combo+"','" + month_combo+"','"+day_combo+"','"+year_combo+"','"+ age + "','" + street_address + "','" +countries_combo+"','"+ state + "','"+ city + "','" + zip + "','" + email + "','" + contact + "','"+date_hired + "','" +jobTitle_combo+"','" +rate + "','" +branch + "')";

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
		btnNewButton.setBounds(915, 600, 200, 30);
		frmEmployeesPayrollManagement.getContentPane().add(btnNewButton);
		
		
		btnUpdate = new JButton("DELETE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int selectedRow = table.getSelectedRow();
	                if (selectedRow != -1) {
	                	
	                	
	                    DefaultTableModel model = (DefaultTableModel) table.getModel();
	                    String idToDelete = table.getValueAt(selectedRow, 0).toString(); // Assuming ID is in the first column
	                 
	                   try {

	   					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee's information","root","");
                        String sql = "DELETE FROM `addemployee` WHERE id = ?";
                        PreparedStatement preparedStatement = con.prepareStatement(sql);
                        preparedStatement.setString(1, idToDelete);
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
                        con.close();
                      

			}catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frmEmployeesPayrollManagement, "Error deleting row: " + ex.getMessage());
            }
        } else {
            
            JOptionPane.showMessageDialog(frmEmployeesPayrollManagement, "Please select a row to delete in the Table List!");
            JOptionPane.showMessageDialog(frmEmployeesPayrollManagement, "Click 'SHOW TABLE' too see records");

        }                                     
	                
			}
				
		});
		btnUpdate.setBounds(455, 600, 200, 30);
		frmEmployeesPayrollManagement.getContentPane().add(btnUpdate);
		
		btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				try {
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee's information", "root", "");
					String query="Update addemployee set id='" +Integer.parseInt(idTF.getText())+"' ,first_name='"+firstNameTF.getText()
								+"', middle_name='"+middleNameTF.getText()+"',last_name='"+lastNameTF.getText()
								+"',gender_combo='"+comboBox_5.getSelectedItem().toString()
								+"',cstatus_combo='"+comboBox_4.getSelectedItem().toString()
								+"',month_combo='"+comboBox.getSelectedItem().toString()
								+"',day_combo='"+comboBox_1.getSelectedItem().toString()
								+"',year_combo='"+comboBox_2.getSelectedItem().toString()
								+"',age='"+Integer.parseInt(ageTF.getText())
								+"',street_address='"+streetTF.getText()
								+"',countries_combo='"+comboBox_3.getSelectedItem().toString()
								+"',state='"+stateTF.getText()
								+"',city='"+cityTF.getText()
								+"',zip='"+Integer.parseInt(zipTF.getText())
								+"',email='"+emailTF.getText()
								+"',contact='"+Integer.parseInt(contactTF.getText())
								+"',date_hired='"+dateHiredTF.getText()
								+"',jobTitle_combo='"+comboBox_6.getSelectedItem().toString()
								+"',rate='"+rateTF.getText()
								+"',branch='"+ branchTF.getText()
								+"' where id='"+Integer.parseInt(idTF.getText())+"' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null,"Data updated");
					pst.close();
						
				}catch (Exception e4) { 
					e4.printStackTrace();
				}
			
			}
		});
		btnUpdate_1.setBounds(685, 570, 200, 30);
		frmEmployeesPayrollManagement.getContentPane().add(btnUpdate_1);
		
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
		btnClear.setBounds(685, 602, 200, 30);
		frmEmployeesPayrollManagement.getContentPane().add(btnClear);
		
		btnAdd = new JButton("SHOW TABLE");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee's information","root","");
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
						String contact = String.valueOf(rs.getInt("contact"));
						String date_hired = rs.getString("contact");
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
		btnAdd.setBounds(455, 570, 200, 30);
		frmEmployeesPayrollManagement.getContentPane().add(btnAdd);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(454, 38, 663, 521);
		frmEmployeesPayrollManagement.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID","FirstName","MiddleName", 
				"LastName","Age","S. Address",
				"State","City","#",
				"Date Hired","R/H","Gender",
				"C. Stat"	
				
			}
		));
		
		JButton btnNewButton_2 = new JButton("Generate");
		btnNewButton_2.setBounds(355, 210, 91, 30);
		frmEmployeesPayrollManagement.getContentPane().add(btnNewButton_2);
	
		Object pass = null;

	}
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}

			}