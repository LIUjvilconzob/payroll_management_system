package EPMS;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Bonus_Class extends JFrame {

	private JPanel contentPane;
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
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bonus_Class frame = new Bonus_Class();
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
	public Bonus_Class() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 11, 765, 275);
		contentPane.add(p1);
		
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
		lblBirthDate.setBounds(381, 70, 130, 30);
		p1.add(lblBirthDate);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setBounds(381, 110, 130, 30);
		p1.add(lblSex);
		
		JLabel lblJT = new JLabel("Job Title:");
		lblJT.setBounds(381, 150, 130, 30);
		p1.add(lblJT);
		
		JLabel lblTS = new JLabel("Total Salary:");
		lblTS.setBounds(381, 190, 130, 30);
		p1.add(lblTS);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setBounds(381, 230, 130, 30);
		p1.add(lblBranch);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
	          
				
				try{

					
			
					
					
		            String sql ="select * from addemployee where id=? ";
		            Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/epms","root","");
		            PreparedStatement preparedStatement = con.prepareStatement(sql);
		            preparedStatement.setString(1,textField.getText());
					ResultSet rs=preparedStatement.executeQuery("select * from addemployee");

		            
		                String add1 =rs.getString("id");
		                textField_1.setText(add1);

		                String add2 =rs.getString("first_name");
		                textField_2.setText(add2);
		                
		                String add22=rs.getString("middle_name");
		                textField_3.setText(add22);

		                String add3 =rs.getString("last_name");
		                textField_4.setText(add3);

		                String add4 =rs.getString("age");
		                textField_5.setText(add4);

		                String add5 =rs.getString("year_combo");
		                textField_6.setText(add5);

		                String add6 =rs.getString("job_title");
		                textField_9.setText(add6);

		                String add7 =rs.getString("salary");
		                textField_8.setText(add7);

		                String add8 =rs.getString("branch");
		                textField_7.setText(add8);
		              
		        }catch(Exception e1){
		          
		      
		            
		         }

			}
		});
		textField.setColumns(10);
		textField.setBounds(100, 10, 655, 30);
		p1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 70, 270, 30);
		p1.add(textField_1);
		
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
		textField_6.setBounds(485, 70, 270, 30);
		p1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(485, 230, 271, 30);
		p1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(485, 190, 270, 30);
		p1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(485, 150, 270, 30);
		p1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(485, 110, 270, 30);
		p1.add(textField_10);
		
		JPanel p2 = new JPanel();
		p2.setBounds(10, 297, 765, 392);
		contentPane.add(p2);
		p2.setLayout(null);
		
		JLabel lblYearsOfService = new JLabel("Years of Service:");
		lblYearsOfService.setBounds(65, 50, 110, 30);
		p2.add(lblYearsOfService);
		
		JLabel lblYearlyBonus = new JLabel("        Yearly Bonus");
		lblYearlyBonus.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblYearlyBonus.setBounds(10, 10, 205, 30);
		p2.add(lblYearlyBonus);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(10, 150, 205, 50);
		p2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Record");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 210, 205, 50);
		p2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBounds(10, 270, 205, 50);
		p2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Return to Menu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuAdmin_Class().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(10, 330, 205, 50);
		p2.add(btnNewButton_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(10, 94, 205, 45);
		p2.add(textField_11);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(225, 15, 530, 371);
		p2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
				String tb1id = tb1Model.getValueAt(table.getSelectedRow(), 0). toString();
				String tb1age = tb1Model.getValueAt(table.getSelectedRow(), 1). toString();
				String tb1first_name = tb1Model.getValueAt(table.getSelectedRow(), 1). toString();
				String tb1middle_name = tb1Model.getValueAt(table.getSelectedRow(), 2). toString();
				String tb1last_name =tb1Model.getValueAt(table.getSelectedRow(), 3). toString();
				String tb1gender_combo =tb1Model.getValueAt(table.getSelectedRow(), 4). toString();
				String tb1year_combo =tb1Model.getValueAt(table.getSelectedRow(), 5). toString();
				String tb1job_title=tb1Model.getValueAt(table.getSelectedRow(), 10). toString();
				String tb1branch=tb1Model.getValueAt(table.getSelectedRow(), 12). toString();


				textField_1.setText(tb1id);
				textField_2.setText(tb1first_name);
				textField_3.setText(tb1middle_name);
				textField_4.setText(tb1last_name);
				textField_5.setText(tb1age);
				textField_6.setText(tb1year_combo);
				textField_7.setText(tb1branch);
				textField_10.setText(tb1gender_combo);
				textField_9.setText(tb1job_title);


				
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "L. Name", "F. Name", "M. Name", "Job Title", "YoS", "Total Salary"
			}
		));
	}
}
