package EPMS;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.awt.Font;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Payslip_Class extends JFrame {
	JFrame frame;
	private JPanel contentPane;
	private JTextField idTF;
	private JTextField firstnameTF;
	private JTextField middlenameTF;
	private JTextField lastnameTF;
	private JTextField ageTF;
	private JTextField jobtitleTF;
	private JTextField phTF;
	private JTextField sssTF;
	private JTextField damageTF;
	private JTextField branchTF;
	private JTextField eqTF;
	private JTextField tardTF;
	private JTextField lostTF;
	private JTextField rateTF;
	private JTextField regularOTTF;
	private JTextField totaldeductTF;
	private JTextField totalOTTF;
	private JTextField holidayOTTF;
	private JTextField totalsalaryTF;
	private JTextField searchTF;
	private JTextField dutydaysTF;

		// TODO Auto-generated method stub
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payslip_Class  frame = new Payslip_Class ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public Payslip_Class () {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(false);
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alber\\OneDrive\\Documents\\epms icon\\logo.png"));
		setTitle("BITE DELIGHT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 715);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel P1 = new JPanel();
		P1.setLayout(null);
		P1.setBounds(10, 10, 400, 390);
		contentPane.add(P1);
		
		JLabel lb2 = new JLabel("Employee ID:");
		lb2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb2.setBounds(25, 70, 130, 30);
		P1.add(lb2);
		
		JLabel lb3 = new JLabel("First Name:");
		lb3.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb3.setBounds(25, 110, 100, 30);
		P1.add(lb3);
		
		JLabel lb4 = new JLabel("Middle Name:");
		lb4.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb4.setBounds(25, 150, 100, 30);
		P1.add(lb4);
		
		JLabel lb5 = new JLabel("Last Name:");
		lb5.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb5.setBounds(25, 190, 80, 30);
		P1.add(lb5);
		
		JLabel lb6 = new JLabel("Age:");
		lb6.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb6.setBounds(25, 230, 141, 30);
		P1.add(lb6);
		
		JLabel lb7 = new JLabel("Job Title:");
		lb7.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb7.setBounds(25, 270, 157, 30);
		P1.add(lb7);
		
		JLabel lb8 = new JLabel("Branch:");
		lb8.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb8.setBounds(25, 349, 80, 30);
		P1.add(lb8);
		
		idTF = new JTextField();
		idTF.setColumns(10);
		idTF.setBounds(140, 70, 240, 30);
		P1.add(idTF);
		
		firstnameTF = new JTextField();
		firstnameTF.setColumns(10);
		firstnameTF.setBounds(140, 110, 240, 30);
		P1.add(firstnameTF);
		
		middlenameTF = new JTextField();
		middlenameTF.setColumns(10);
		middlenameTF.setBounds(140, 150, 240, 30);
		P1.add(middlenameTF);
		
		lastnameTF = new JTextField();
		lastnameTF.setColumns(10);
		lastnameTF.setBounds(140, 190, 240, 30);
		P1.add(lastnameTF);
		
		ageTF = new JTextField();
		ageTF.setColumns(10);
		ageTF.setBounds(140, 230, 240, 30);
		P1.add(ageTF);
		
		jobtitleTF = new JTextField();
		jobtitleTF.setColumns(10);
		jobtitleTF.setBounds(140, 270, 240, 30);
		P1.add(jobtitleTF);
		
		rateTF = new JTextField();
		rateTF.setColumns(10);
		rateTF.setBounds(140, 311, 240, 30);
		P1.add(rateTF);
		
		JLabel lblEmployeeDetails = new JLabel("EMPLOYEE DETAILS");
		lblEmployeeDetails.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblEmployeeDetails.setBounds(100, 23, 250, 30);
		P1.add(lblEmployeeDetails);
		
		branchTF = new JTextField();
		branchTF.setBounds(140, 351, 240, 30);
		P1.add(branchTF);
		branchTF.setColumns(10);
		
		JLabel lb14 = new JLabel("Basic Salary");
		lb14.setBounds(25, 311, 130, 30);
		P1.add(lb14);
		lb14.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JPanel P2 = new JPanel();
		P2.setBounds(10, 407, 400, 265);
		contentPane.add(P2);
		P2.setLayout(null);
		
		JLabel lblEmployeeDetails_1 = new JLabel("EMPLOYEE OVERTIME");
		lblEmployeeDetails_1.setBounds(90, 25, 220, 26);
		lblEmployeeDetails_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		P2.add(lblEmployeeDetails_1);
		
		JLabel lb18 = new JLabel("Regular Day Overtime:");
		lb18.setBounds(25, 70, 178, 30);
		P2.add(lb18);
		lb18.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JLabel lb19 = new JLabel("Holiday/Rest Day Overtime:");
		lb19.setBounds(25, 140, 192, 30);
		P2.add(lb19);
		lb19.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JLabel lb11 = new JLabel("Total Overtime:");
		lb11.setBounds(25, 210, 130, 30);
		P2.add(lb11);
		lb11.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		regularOTTF = new JTextField();
		regularOTTF.setBounds(213, 72, 175, 30);
		P2.add(regularOTTF);
		regularOTTF.setColumns(10);
		
		holidayOTTF = new JTextField();
		holidayOTTF.setBounds(213, 142, 175, 30);
		P2.add(holidayOTTF);
		holidayOTTF.setColumns(10);
		
		totalOTTF = new JTextField();
		totalOTTF.setBounds(213, 212, 175, 30);
		P2.add(totalOTTF);
		totalOTTF.setColumns(10);
		
		JPanel P3 = new JPanel();
		P3.setBounds(420, 10, 380, 65);
		contentPane.add(P3);
		P3.setLayout(null);
		
		JLabel lblSearchId = new JLabel("Search ID:");
		lblSearchId.setBounds(20, 20, 130, 30);
		P3.add(lblSearchId);
		
		lblSearchId.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		searchTF = new JTextField();
		searchTF.setBounds(100, 20, 260, 30);
		P3.add(searchTF);
		searchTF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		searchTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try {
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms", "root", "");
				    String query = "SELECT * FROM addemployee WHERE id = ?";
				    PreparedStatement pst = con.prepareStatement(query);
				    
				    pst.setString(1, searchTF.getText());

				    ResultSet rs = pst.executeQuery();

				    if (rs.next()) {
				        String id = rs.getString("id");
				        idTF.setText(id);
				        
				        String firstname = rs.getString("first_name");
				        firstnameTF.setText(firstname);
				        
				        String middlename = rs.getString("middle_name");
				        middlenameTF.setText(middlename);
				        
				        String lastname = rs.getString("last_name");
				        lastnameTF.setText(lastname);
				        
				        String age = rs.getString("age");
				        ageTF.setText(age);
				        
				        String jobtitle = rs.getString("job_title");
				        jobtitleTF.setText(jobtitle);
				        
				        String rate = rs.getString("rate");
				        rateTF.setText(rate);
				       
				        String branch = rs.getString("branch");
				        branchTF.setText(branch);
				        
				        String damage = rs.getString("machinery_damage");
				        damageTF.setText(damage);
				        
				        String lost = rs.getString("money_lost");
				        lostTF.setText(lost);
				        
				        String tardiness = rs.getString("tardiness");
				        tardTF.setText(tardiness);
				        
				        String eqlost = rs.getString("equipment_lost");
				        eqTF.setText(eqlost);
				        
				        String sss = rs.getString("sss");
				        sssTF.setText(sss);
				        
				        String ph = rs.getString("philhealth");
				        phTF.setText(ph);
				        
				        String totaldeduct = rs.getString("totaldeduct");
				        totaldeductTF.setText(totaldeduct);
				        
				        String regularOT = rs.getString("regularOT");
				        regularOTTF.setText(regularOT);
				        
				        String holidayOT = rs.getString("holidayOT");
				        holidayOTTF.setText(holidayOT);
				        
				        String totalOT = rs.getString("totalOT");
				        totalOTTF.setText(totalOT);
				        
				        String dutydays= rs.getString("totaldays");
				        dutydaysTF.setText(dutydays);
				        
				        String totalpayment = rs.getString("totalpayment");
				        totalsalaryTF.setText(totalpayment);
				    } else {
				      
				    }

				    rs.close();
				    pst.close();
				    con.close();
				} catch (Exception e1) {
				    e1.printStackTrace();
				}
			}
		});
		searchTF.setColumns(10);
		
		JPanel P4 = new JPanel();
		P4.setBounds(420, 85, 380, 440);
		contentPane.add(P4);
		P4.setLayout(null);
		
		JLabel lblEmployeesPayslipPayment = new JLabel("EMPLOYEE DEDUCTION");
		lblEmployeesPayslipPayment.setBounds(72, 25, 235, 26);
		P4.add(lblEmployeesPayslipPayment);
		lblEmployeesPayslipPayment.setFont(new Font("SansSerif", Font.BOLD, 20));
		
		JLabel lb12 = new JLabel("SSS:");
		lb12.setBounds(25, 70, 130, 30);
		P4.add(lb12);
		lb12.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JLabel lb13 = new JLabel("Phil. Health:");
		lb13.setBounds(25, 110, 130, 30);
		P4.add(lb13);
		lb13.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JLabel lb10 = new JLabel("Tardiness / Undertime :");
		lb10.setBounds(25, 150, 160, 30);
		P4.add(lb10);
		lb10.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JLabel lb16 = new JLabel("Equipment Lost:");
		lb16.setBounds(25, 190, 130, 30);
		P4.add(lb16);
		lb16.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JLabel lb17 = new JLabel("Total Deduction:");
		lb17.setBounds(25, 310, 130, 30);
		P4.add(lb17);
		lb17.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JLabel lb15 = new JLabel("Money Lost / Short:");
		lb15.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb15.setBounds(25, 230, 140, 30);
		P4.add(lb15);
		
		JLabel lb9 = new JLabel("Machinery Damage:");
		lb9.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb9.setBounds(25, 270, 140, 30);
		P4.add(lb9);
		
		JLabel lb11_1_1 = new JLabel("Total Duty Days:");
		lb11_1_1.setBounds(25, 350, 130, 30);
		P4.add(lb11_1_1);
		lb11_1_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		JLabel lb11_1 = new JLabel("Total Salary:");
		lb11_1.setBounds(25, 390, 130, 30);
		P4.add(lb11_1);
		lb11_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		sssTF = new JTextField();
		sssTF.setBounds(190, 72, 170, 30);
		P4.add(sssTF);
		sssTF.setColumns(10);
		
		tardTF = new JTextField();
		tardTF.setBounds(190, 152, 170, 30);
		P4.add(tardTF);
		tardTF.setColumns(10);
		
		eqTF = new JTextField();
		eqTF.setBounds(190, 190, 170, 30);
		P4.add(eqTF);
		eqTF.setColumns(10);
		
		phTF = new JTextField();
		phTF.setBounds(190, 110, 170, 30);
		P4.add(phTF);
		phTF.setColumns(10);
		
		damageTF = new JTextField();
		damageTF.setBounds(190, 270, 170, 30);
		P4.add(damageTF);
		damageTF.setColumns(10);
		
		totaldeductTF = new JTextField();
		totaldeductTF.setBounds(190, 312, 170, 30);
		P4.add(totaldeductTF);
		totaldeductTF.setColumns(10);
		
		lostTF = new JTextField();
		lostTF.setBounds(190, 230, 170, 30);
		P4.add(lostTF);
		lostTF.setColumns(10);
		
		totalsalaryTF = new JTextField();
		totalsalaryTF.setBounds(190, 390, 170, 30);
		P4.add(totalsalaryTF);
		totalsalaryTF.setColumns(10);
		
		dutydaysTF = new JTextField();
		dutydaysTF.setBounds(190, 352, 170, 30);
		P4.add(dutydaysTF);
		dutydaysTF.setToolTipText("Input no. of duty days");
		dutydaysTF.setText("Input no. of duty days");
		dutydaysTF.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double totalOT = Double.parseDouble(totalOTTF.getText());
		        double totaldeduct = Double.parseDouble(totaldeductTF.getText());
		        double salary = 443.0;
		        double basicsalary = 0.0;
		        double total = 0.0;

		        String dutyDaysText = dutydaysTF.getText();
		        int dutyDays = 0;
		        try {
		            dutyDays = Integer.parseInt(dutyDaysText);
		        } catch (NumberFormatException ex) {
		        
		          return;
		        }

		        if (dutyDays == 1) {
		            basicsalary = 1 * salary;
		            total=basicsalary+totalOT-totaldeduct;
                    String peso1 =  String.format("%.2f", total);
                    totalsalaryTF.setText(peso1);	            
		            
		        } else if (dutyDays == 2) {
		            basicsalary = 2 * salary;
		            basicsalary = 2*salary;
                	total=basicsalary+totalOT-totaldeduct;
                    String peso2 =  String.format("%.2f", total);
                    totalsalaryTF.setText(peso2);
		            
		        } else {if (dutyDays ==3) {
		            basicsalary = 3 * salary;
		            basicsalary = 3*salary;
                	total=basicsalary+totalOT-totaldeduct;
                    String peso3 =  String.format("%.2f", total);
                    totalsalaryTF.setText(peso3);               
		            
		        } else {if (dutyDays ==4) {
		            basicsalary = 4 * salary;
		            total=basicsalary+totalOT-totaldeduct;
                    String peso4 =  String.format("%.2f", total);
                    totalsalaryTF.setText(peso4);                   
		            
		        } else {if (dutyDays ==5) {
		            basicsalary = 5 * salary;
		            basicsalary = 5*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso5 =  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso5);                  
	                    
		        } else {if (dutyDays ==6) {
		            basicsalary = 6* salary;
		        	total=basicsalary+totalOT-totaldeduct;
                    String peso6 =  String.format("%.2f", total);
                    totalsalaryTF.setText(peso6);
                    
		        } else {if (dutyDays ==7) {
		            basicsalary = 8 * salary;
		          	total=basicsalary+totalOT-totaldeduct;
                    String peso7 =  String.format("%.2f", total);
                    totalsalaryTF.setText(peso7);   
                    
          		} else {if (dutyDays ==8) {
          		    basicsalary = 8 * salary;
          		    total=basicsalary+totalOT-totaldeduct;
  	                String peso8 =  String.format("%.2f", total);
  	                totalsalaryTF.setText(peso8);        		            
          		            
		        } else {if (dutyDays ==9) {
		            basicsalary = 9 * salary;
		            total=basicsalary+totalOT-totaldeduct;
                    String peso9=  String.format("%.2f", total);
                    totalsalaryTF.setText(peso9);
		            
		        } else {if (dutyDays ==10) {
		            basicsalary = 10 * salary;
		            total=basicsalary+totalOT-totaldeduct;
                    String peso10 =  String.format("%.2f", total);
                    totalsalaryTF.setText(peso10);
                    
		        } else {if (dutyDays ==11) {
		            basicsalary = 11 * salary;
		           total=basicsalary+totalOT-totaldeduct;
                    String peso11 =  String.format("%.2f", total);
                    totalsalaryTF.setText(peso11);	            
		            
		        } else {if (dutyDays ==12) {
		            basicsalary = 12 * salary;
		            total=basicsalary+totalOT-totaldeduct;
                    String peso12=  String.format("%.2f", total);
                    totalsalaryTF.setText(peso12);
		            
		        } else {if (dutyDays ==13) {
		            basicsalary =13*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                   String peso13=  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso13);
		            
		        } else {if (dutyDays ==14) {
		        	   basicsalary =14*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso14 =  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso14);	                    
		                    
		        } else {if (dutyDays ==15) {
		        	 basicsalary =15*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso15=  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso15);		                    		                    
		                    
		        } else {if (dutyDays ==16) {
		        	basicsalary =16*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso16=  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso16);
		            	            
		        } else {if (dutyDays ==17) {
		        	basicsalary =17*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso17 =  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso17);                    
	                    
		        } else {if (dutyDays ==18) {
		        	 basicsalary =18*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso18 =  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso18);	            
		            
		        } else {if (dutyDays ==19) {
		        	  basicsalary =19*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso19 =  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso19);	                    
		                    
		        } else {if (dutyDays ==20) {
		        	  basicsalary =20*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso20 =  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso20);	                    
		                    
		        } else {if (dutyDays ==21) {
		        	basicsalary =21*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso21=  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso21);
	                    
		        } else {if (dutyDays ==22) {
		        	basicsalary =22*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso22 =  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso22);                    

		        } else {if (dutyDays ==23) {
		        	basicsalary =23*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso23 =  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso23);                    
	                    
		        } else {if (dutyDays ==24) {
		        	basicsalary =24*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso24 =  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso24);                    
	                    
		        } else {if (dutyDays ==25) {
		        	 basicsalary =25*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso25 =  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso25);		                    
		                    
		        } else {if (dutyDays ==26) {
		        	 basicsalary =26*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso26 =  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso26);		                    
		            
		        } else {if (dutyDays ==27) {
		        	 basicsalary =27*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso27 =  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso27);
		                             
		        } else {if (dutyDays ==28) {
		        	basicsalary =28*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso28 =  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso28);
	                    
		        } else {if (dutyDays ==29) {
		        	   basicsalary =29*salary;
	                   	total=basicsalary+totalOT-totaldeduct;
		                    String peso29 =  String.format("%.2f", total);
		                    totalsalaryTF.setText(peso29);
		                    
		        } else {if (dutyDays ==30) {
		        	basicsalary =30*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso30 =  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso30);
		        } else {if (dutyDays ==31) {
		        	basicsalary =31*salary;
                   	total=basicsalary+totalOT-totaldeduct;
	                    String peso31 =  String.format("%.2f", total);
	                    totalsalaryTF.setText(peso31);
		            
		        																														}
		        																													}
		        																												}
		        																											}
		        																										}
		        																									}
		        																								}
		        																							}
		        																						}
		        																					}
		        																				}
		        																			}
		        																		}
		        																	}
		        																}
		        															}
		        														}
		        													}
		        												}
		        											}
		        										}
		        									}
		        								}
		        							}
          		        				}
		        					}
		        				}
		        			}
		        		}
		        	}
		        }
			
		});
		dutydaysTF.setColumns(10);
		
		JPanel P5 = new JPanel();
		P5.setBounds(420, 536, 380, 138);
		contentPane.add(P5);
		P5.setLayout(null);
		
		JButton B1 = new JButton("GENERATE SLIP");
		B1.setBounds(10, 10, 175, 50);
		P5.add(B1);
		
		JButton B2 = new JButton("MENU");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				MenuAdmin_Class obj=new MenuAdmin_Class();
				obj.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		B2.setBounds(195, 10, 175, 50);
		P5.add(B2);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchTF.setText("");
				idTF.setText("");
				firstnameTF.setText("");
				middlenameTF.setText("");
				lastnameTF.setText("");
				ageTF.setText("");
				jobtitleTF.setText("");
				rateTF.setText("");
				branchTF.setText("");
				damageTF.setText("");
				lostTF.setText("");
				tardTF.setText("");
				eqTF.setText("");
				sssTF.setText("");
				phTF.setText("");
				totaldeductTF.setText("");
				regularOTTF.setText("");
				holidayOTTF.setText("");
				totalOTTF.setText("");
				dutydaysTF.setText("");
				totalsalaryTF.setText("");
				
			}
		});
		btnClear.setBounds(105, 75, 175, 50);
		P5.add(btnClear);
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = idTF.getText();
				String first_name = firstnameTF.getText();
				String middle_name = middlenameTF.getText();
				String last_name = lastnameTF.getText();
				String age = ageTF.getText();
				String job_title = jobtitleTF.getText();
				String rate = rateTF.getText();
				String branch = branchTF.getText();
				String machinery_damage = damageTF.getText();
				String money_lost = lostTF.getText();
				String tardiness = tardTF.getText();
				String equipment_lost = eqTF.getText();
				String sss = sssTF.getText();
				String philhealth = phTF.getText();
				String totaldeduct = totaldeductTF.getText();
				String regularOT =regularOTTF.getText();
				String holidayOT = holidayOTTF.getText();
				String totalOT = totalOTTF.getText();
				String dutydays = dutydaysTF.getText();
				String totalpayment = totalsalaryTF.getText();
				
				JFileChooser dialog = new JFileChooser();
				dialog.setSelectedFile(new File(id+"_"+first_name+"_"+last_name+"_"+"-SalarySlip"+".pdf"));
				int result  = dialog.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					String file_path = dialog.getSelectedFile().getPath();

				try {
					
					Document payslip = new Document();
					PdfWriter mywriter = PdfWriter.getInstance(payslip, new FileOutputStream(file_path));
												
					payslip.open();
					payslip.add(new Paragraph("___________________________________________________",FontFactory.getFont(FontFactory.HELVETICA_BOLD,18)));
					payslip.add(new Paragraph("                                    BITE DELIGHT ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph("                                                                     Payslip ",FontFactory.getFont(FontFactory.HELVETICA,13)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                  Employee Details ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" Employee ID : "+ "			"+id,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Employee Name : "+ "			"+last_name +", "+ first_name +", "+ middle_name,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Age : "+ "			"+age,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Job Title : "+ "			"+job_title,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Branch : "+ "			"+branch,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                     Salary Deduction ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,18)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" Machinery Damage : "+ "			"+machinery_damage,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Money Lost/Short : "+ "			"+money_lost,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Tardinesss/Undertime : "+ "			"+tardiness,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Equipment Lost : "+ "			"+equipment_lost,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" PHIL. HEALTH : "+ "			"+philhealth,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" SSS : "+ "			"+sss,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Total Deductions : "+ "			"+totaldeduct,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                      Salary Earnings ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,18)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" Total Duty Days	: "+ "			"+dutydays,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Basic Salary : "+ "			"+rate,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Regular Overtime : "+ "			"+regularOT,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Holiday/Rest Day OT	: "+ "			"+holidayOT,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Total Overtime : "+ "			"+totalOT,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph(" Net Salary : "+ "			"+totalpayment,FontFactory.getFont(FontFactory.TIMES,14)));
					payslip.add(new Paragraph("___________________________________________________",FontFactory.getFont(FontFactory.HELVETICA_BOLD,18)));
					payslip.add(new Paragraph(new Date().toString()));
					
					payslip.close();
					JOptionPane.showMessageDialog(null, "Successfully Generated");
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}	
				
				}
			}	
		});
		
	}
}

