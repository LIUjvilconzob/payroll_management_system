package EPMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class updateTest {

	private JFrame frame;
	private JTable table;
	private JButton addbtn;
	private JButton tablebtn;
	private JTextField idTF;
	private JTextField firstNameTF;
	private JTextField ageTF;
	private JScrollPane scrollPane;
	Connection con;
	PreparedStatement pst;
	private JTextField findIDTF;
	ResultSetMetaData rsmd;
	private JScrollPane scrollPane_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateTest window = new updateTest();
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
	public updateTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 523, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(32, 30, 439, 198);
		frame.getContentPane().add(scrollPane_1);
		
		scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();

				String tb1id = tb1Model.getValueAt(table.getSelectedRow(), 0). toString();
				String tb1first_name = tb1Model.getValueAt(table.getSelectedRow(), 1). toString();
				String tb1age = tb1Model.getValueAt(table.getSelectedRow(), 2). toString();
				

				
				
				idTF.setText(tb1id);
				firstNameTF.setText(tb1first_name);
				ageTF.setText(tb1age);
				
			
			}
		});
		
		
		
		
		
		table.setModel(new DefaultTableModel(
				
				new Object[][] {
				},
				new String[] {
					"ID","FirstName", "Age"
				}
			));
			

			
			Object pass = null;
			
		 
		
		
		
		
		
		
		
		JButton updatebtn = new JButton("Update");
		updatebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				    String value1 = idTF.getText();
				    String value2 = firstNameTF.getText();
				    String value3 = ageTF.getText();
				    int ageInt = Integer.parseInt(value3);

				    
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms", "root", "");

				    String sql = "update test set id=?, first_name=?, age=? where id=?";
				    PreparedStatement pst = con.prepareStatement(sql);
				    
				    // Set the values for the placeholders in the PreparedStatement
				    pst.setString(1, value1);
				    pst.setString(2, value2);
				    pst.setInt(3,ageInt);
				    pst.setString(4, value1);

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
			   
		updatebtn.setBounds(360, 288, 89, 23);
		frame.getContentPane().add(updatebtn);
		
		addbtn = new JButton("ADD DATABASE");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idTF.getText().equals("") || firstNameTF.getText().equals("") || ageTF.getText().equals("")); 
					
					JOptionPane.showMessageDialog(null, "Please fill the complete information");
				
				
						
				
				
				
				
			
		
				
				try {
				
				int id = Integer.parseInt(idTF.getText());
				String first_name = firstNameTF.getText();
				int age =Integer.parseInt(ageTF.getText());
				
				
				
				
		
				//int yearExp = Integer.parseInt(tf1.getText());
				
				
				 String msg = "" + first_name;
	                msg += " \n";
	
				
				

		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms", "root", "");

		            // Use PreparedStatement to prevent SQL injection
		            String addEmployeeQuery = "INSERT INTO test VALUES('" +id+"','"+ first_name +"','"+ age + "')";


		            Statement sta = con.createStatement();
                    int x = sta.executeUpdate(addEmployeeQuery);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(addbtn, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(addbtn,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    con.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
		        

			
				
                }	
			}
		});
		addbtn.setBounds(85, 386, 109, 23);
		frame.getContentPane().add(addbtn);
		
		tablebtn = new JButton("Show Table");
		tablebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				
		                
		                
		                
		                
			}
			
		});
		tablebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms","root","");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from test");
					while(rs.next()) {
				
						String id = String.valueOf(rs.getInt("id"));
						String first_name = rs.getString("first_name");
						String age = rs.getString("age");

						
					String tbData[] = {id,first_name,age};
					DefaultTableModel tb1Model = (DefaultTableModel)table.getModel();
					
					
					
					tb1Model.addRow(tbData);
					
					
					
			}
					
					con.close();
					
				}catch(Exception e1) {
					System.out.println(e1.getMessage());
				}}
			
					
		});
		
		tablebtn.setBounds(360, 254, 89, 23);
		frame.getContentPane().add(tablebtn);
		
		idTF = new JTextField();
		idTF.setBounds(85, 273, 86, 20);
		frame.getContentPane().add(idTF);
		idTF.setColumns(10);
		
		firstNameTF = new JTextField();
		firstNameTF.setColumns(10);
		firstNameTF.setBounds(85, 310, 86, 20);
		frame.getContentPane().add(firstNameTF);
		
		ageTF = new JTextField();
		ageTF.setColumns(10);
		ageTF.setBounds(85, 341, 86, 20);
		frame.getContentPane().add(ageTF);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(20, 313, 68, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(20, 344, 68, 14);
		frame.getContentPane().add(lblAge);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(20, 276, 68, 14);
		frame.getContentPane().add(lblId);
		
		JButton registerbtn = new JButton("Register");
		registerbtn.setBounds(382, 443, 89, 23);
		frame.getContentPane().add(registerbtn);
		
		findIDTF = new JTextField();
		findIDTF.setBounds(254, 401, 86, 20);
		frame.getContentPane().add(findIDTF);
		findIDTF.setColumns(10);
		
		JButton btnNewButton = new JButton("Find ID");
		btnNewButton.setBounds(251, 431, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
