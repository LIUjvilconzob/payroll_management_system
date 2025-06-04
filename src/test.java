import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class test {

	 private static final String JDBC_URL = "jdbc:mysql://localhost/your_database";
	    private static final String JDBC_USER = "your_username";
	    private static final String JDBC_PASSWORD = "your_password";
	private JFrame frame;
	private JTable table;

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
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				 table.setRowHeight(0);

			        // Fetch updated data from the database and populate the table
			        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
			            String selectQuery = "SELECT * FROM your_table";
			            Statement statement = connection.createStatement();
			            ResultSet resultSet = statement.executeQuery(selectQuery);

			            while (resultSet.next()) {
			                int id = resultSet.getInt("id");
			                String name = resultSet.getString("name");
			                int age = resultSet.getInt("age");

			                tableModel.addRow(new Object[]{id, name, age});
			            }
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
			        }
			    }

			    public static void main(String[] args) {
			        SwingUtilities.invokeLater(new Runnable() {
			            @Override
			            public void run() {
			                new UpdateButtonAndJTableExample();
			            }}}
			        });
			    
			
		table.setBounds(174, 11, 250, 250);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/epms","root","")) {
			            String updateQuery = "UPDATE your_table SET name=?, age=? WHERE id=?";
			            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

			            // Replace these values with your data
			            String newName = "Updated Name";
			            int newAge = 30;
			            int idToUpdate = 1;

			            preparedStatement.setString(1, newName);
			            preparedStatement.setInt(2, newAge);
			            preparedStatement.setInt(3, idToUpdate);

			            int rowsAffected = preparedStatement.executeUpdate();

			            if (rowsAffected > 0) {
			                JOptionPane.showMessageDialog(null, "Update Successful");
			                // Refresh the table with updated data
			                refreshTable();
			            } else {
			                JOptionPane.showMessageDialog(null, "Update Failed");
			            }
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
			        }
				 
			}
		});
		btnNewButton.setBounds(10, 122, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
