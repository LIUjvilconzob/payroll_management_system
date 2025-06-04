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
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class testReg {

	private JFrame frame;
	private JTextField idTF;
	private JTextField firstNameTF;
	private JTextField agtTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testReg window = new testReg();
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
	public testReg() {
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
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(62, 93, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(62, 118, 75, 16);
		frame.getContentPane().add(lblFirstName);
		
		JLabel ageTF = new JLabel("Age");
		ageTF.setBounds(62, 156, 75, 16);
		frame.getContentPane().add(ageTF);
		
		idTF = new JTextField();
		idTF.setBounds(118, 90, 86, 20);
		frame.getContentPane().add(idTF);
		idTF.setColumns(10);
		
		firstNameTF = new JTextField();
		firstNameTF.setColumns(10);
		firstNameTF.setBounds(118, 116, 86, 20);
		frame.getContentPane().add(firstNameTF);
		
		agtTF = new JTextField();
		agtTF.setColumns(10);
		agtTF.setBounds(118, 154, 86, 20);
		frame.getContentPane().add(agtTF);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idTF.getText().equals("") || firstNameTF.getText().equals("") || ageTF.getText().equals(""));
					
					JOptionPane.showMessageDialog(null, "Please fill the complete information");
				
				
						
				
				
				
				
			
		
				
				try {
				
					int id = Integer.parseInt(idTF.getText());
				String first_name = firstNameTF.getText();
				String age = ageTF.getText();

				

				//int yearExp = Integer.parseInt(tf1.getText());
				
				
				 String msg = "" + first_name;
	                msg += " \n";
	
				
				

		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms", "root", "");

		            // Use PreparedStatement to prevent SQL injection
		            String addEmployeeQuery = "INSERT INTO test VALUES('" +id+"','"+ first_name +"','" + age+"')";


		            Statement sta = con.createStatement();
                    int x = sta.executeUpdate(addEmployeeQuery);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnRegister, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnRegister,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    con.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
		        

			
				
                }	
				
			}
		});
		btnRegister.setBounds(118, 197, 89, 23);
		frame.getContentPane().add(btnRegister);
	}

}
