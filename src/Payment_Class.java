import java.awt.EventQueue;



import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.Document;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Payment_Class extends JFrame {

	private JPanel contentPane;
	private JTextField SID_TF;
	private JTextField EID_TF;
	private JTextField FN_TF;
	private JTextField MN_TF;
	private JTextField LN_TF;
	private JTextField AGE_TF;
	private JTextField JT_TF;
	private JTextField TS_TF;
	private JTextField TD_TF;
	private JTextField YB_TF;
	private JTextField BRANCH_TF;
	private JTextField SSS_TF;
	private JTextField PH_TF;
	private JTextField PI_TF;
	private JTextField RPH_TF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment_Class frame = new Payment_Class();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Payment_Class() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 11, 765, 480);
		contentPane.add(p1);
		
		JLabel lb1 = new JLabel("Search ID:");
		lb1.setBounds(20, 30, 130, 30);
		p1.add(lb1);
		
		JLabel lb2 = new JLabel("Employee ID:");
		lb2.setBounds(20, 100, 130, 30);
		p1.add(lb2);
		
		JLabel lb3 = new JLabel("First Name:");
		lb3.setBounds(20, 140, 65, 30);
		p1.add(lb3);
		
		JLabel lb4 = new JLabel("Middle Name:");
		lb4.setBounds(20, 181, 100, 30);
		p1.add(lb4);
		
		JLabel lb5 = new JLabel("Last Name:");
		lb5.setBounds(20, 220, 80, 30);
		p1.add(lb5);
		
		JLabel lb6 = new JLabel("Age:");
		lb6.setBounds(20, 260, 30, 30);
		p1.add(lb6);
		
		JLabel lb7 = new JLabel("Job Title:");
		lb7.setBounds(20, 301, 60, 30);
		p1.add(lb7);
		
		JLabel lb8 = new JLabel("Branch:");
		lb8.setBounds(20, 340, 80, 30);
		p1.add(lb8);
		
		JLabel lb9 = new JLabel("Yearly Bonus (%):");
		lb9.setBounds(380, 100, 130, 30);
		p1.add(lb9);
		
		JLabel lb10 = new JLabel("Total Deductions:");
		lb10.setBounds(380, 260, 130, 30);
		p1.add(lb10);
		
		JLabel lb11 = new JLabel("Total Salary:");
		lb11.setBounds(380, 340, 130, 30);
		p1.add(lb11);
		
		JLabel lb12 = new JLabel("SSS:");
		lb12.setBounds(380, 220, 130, 30);
		p1.add(lb12);
		
		JLabel lb13 = new JLabel("Phil. Health:");
		lb13.setBounds(380, 180, 130, 30);
		p1.add(lb13);
		
		JLabel lb14 = new JLabel("PAG - IBIG:");
		lb14.setBounds(380, 140, 130, 30);
		p1.add(lb14);
		
		JLabel lb15 = new JLabel("Rate / Hour:");
		lb15.setBounds(380, 301, 130, 30);
		p1.add(lb15);
		
		SID_TF = new JTextField();
		SID_TF.setColumns(10);
		SID_TF.setBounds(110, 30, 630, 30);
		p1.add(SID_TF);
		
		EID_TF = new JTextField();
		EID_TF.setColumns(10);
		EID_TF.setBounds(120, 100, 220, 30);
		p1.add(EID_TF);
		
		FN_TF = new JTextField();
		FN_TF.setColumns(10);
		FN_TF.setBounds(120, 140, 220, 30);
		p1.add(FN_TF);
		
		MN_TF = new JTextField();
		MN_TF.setColumns(10);
		MN_TF.setBounds(120, 180, 220, 30);
		p1.add(MN_TF);
		
		LN_TF = new JTextField();
		LN_TF.setColumns(10);
		LN_TF.setBounds(120, 220, 220, 30);
		p1.add(LN_TF);
		
		AGE_TF = new JTextField();
		AGE_TF.setColumns(10);
		AGE_TF.setBounds(120, 260, 220, 30);
		p1.add(AGE_TF);
		
		JT_TF = new JTextField();
		JT_TF.setColumns(10);
		JT_TF.setBounds(120, 300, 220, 30);
		p1.add(JT_TF);
		
		TS_TF = new JTextField();
		TS_TF.setColumns(10);
		TS_TF.setBounds(520, 340, 220, 30);
		p1.add(TS_TF);
		
		TD_TF = new JTextField();
		TD_TF.setColumns(10);
		TD_TF.setBounds(520, 260, 220, 30);
		p1.add(TD_TF);
		
		YB_TF = new JTextField();
		YB_TF.setColumns(10);
		YB_TF.setBounds(520, 100, 220, 30);
		p1.add(YB_TF);
		
		BRANCH_TF = new JTextField();
		BRANCH_TF.setColumns(10);
		BRANCH_TF.setBounds(120, 340, 220, 30);
		p1.add(BRANCH_TF);
		
		SSS_TF = new JTextField();
		SSS_TF.setColumns(10);
		SSS_TF.setBounds(520, 220, 220, 30);
		p1.add(SSS_TF);
		
		PH_TF = new JTextField();
		PH_TF.setColumns(10);
		PH_TF.setBounds(520, 180, 220, 30);
		p1.add(PH_TF);
		
		PI_TF = new JTextField();
		PI_TF.setColumns(10);
		PI_TF.setBounds(520, 140, 220, 30);
		p1.add(PI_TF);
		
		RPH_TF = new JTextField();
		RPH_TF.setColumns(10);
		RPH_TF.setBounds(520, 300, 220, 30);
		p1.add(RPH_TF);
		
		JButton B1 = new JButton("Generate Slip");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EID = EID_TF.getText();
				String FName = FN_TF.getText();
				String MName = MN_TF.getText();
				String LName = LN_TF.getText();
				String Age = AGE_TF.getText();
				String JobTitle = JT_TF.getText();
				String TSalary = TS_TF.getText();
				String TDeduct = TD_TF.getText();
				String YBonus = YB_TF.getText();
				String Branch = BRANCH_TF.getText();
				String PI = BRANCH_TF.getText();
				String PH = BRANCH_TF.getText();
				String SSS = BRANCH_TF.getText();
				String RPH = BRANCH_TF.getText();

				
				JFileChooser dialog = new JFileChooser();
				dialog.setSelectedFile(new File(EID+"_"+FName+"_"+LName+"_"+"-SalarySlip"+".pdf"));
				int result  = dialog.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					String file_path = dialog.getSelectedFile().getPath();

				try {
					Document payslip = new Document();
					PdfWriter mywriter = PdfWriter.getInstance((com.itextpdf.text.Document) payslip, new FileOutputStream(file_path));
					
					payslip.open();
					
					payslip.add(new Paragraph("------------------------------------------------------------------------------",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                    BITE DELIGHT ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph("                                                                     Payslip ",FontFactory.getFont(FontFactory.HELVETICA,13)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                  Employee Details ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" Employee ID		: "+ EID,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Employee Name	: "+ LName +", "+ FName +" "+ MName,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Age				: "+ Age,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Branch			: "+ Branch,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                  Salary Deduction ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" PAG-IBIG		: "+ PI,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" PHIL. HEALTH	: "+ PH,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" SSS				: "+ SSS,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Total Deductions: "+ TDeduct,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                   Salary Earnings ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" Job Title		: "+ JobTitle,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Rate / Hour		: "+ RPH,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Yearly Bonus	: "+ YBonus,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Total Salary	: "+ TSalary,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("------------------------------------------------------------------------------",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(new Date().toString()));
					
					payslip.close();
					JOptionPane.showMessageDialog(null, "Successfully Generated");
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}	
				
				}
			}	
		});
		B1.setBounds(20, 400, 350, 60);
		p1.add(B1);
		
		JButton B2 = new JButton("Return to Menu");
		B2.setBounds(390, 400, 350, 60);
		p1.add(B2);
		
		
		
		
	}
}