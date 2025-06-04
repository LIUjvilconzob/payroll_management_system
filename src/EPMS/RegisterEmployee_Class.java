package EPMS;


import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.time.YearMonth;
import java.awt.Font;
public class RegisterEmployee_Class {


	private JFrame f1;
	private JComboBox<String> Month_CB;
    private JComboBox<String> Year_CB;
    private JComboBox<String> Day_CB;
    private JComboBox<String> Gender_CB;
    private JComboBox<String> Country_CB;
    private JComboBox<String> MS_CB;
    private JTextField FName_TF;
    private JTextField MName_TF;
    private JTextField LName_TF;
    private JTextField StAdd1_TF;
    private JTextField StAdd2_TF;
    private JTextField SP_TF;
    private JTextField PZC_TF;
    private JTextField City_TF;
    private String[] countries = new String[] {
		    "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia",
		    "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
		    "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria",
		    "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad",
		    "Chile", "China", "Colombia", "Comoros", "Congo (Congo-Brazzaville)", "Costa Rica", "Croatia", "Cuba", "Cyprus",
		    "Czechia (Czech Republic)", "Democratic Republic of the Congo (Congo-Kinshasa)", "Denmark", "Djibouti", "Dominica",
		    "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini",
		    "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada",
		    "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hungary", "Iceland", "India",
		    "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan",
		    "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia",
		    "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali",
		    "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia",
		    "Montenegro", "Morocco", "Mozambique", "Myanmar (formerly Burma)", "Namibia", "Nauru", "Nepal", "Netherlands",
		    "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "North Macedonia (formerly Macedonia)", "Norway",
		    "Oman", "Pakistan", "Palau", "Palestine State", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines",
		    "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
		    "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal",
		    "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia",
		    "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland",
		    "Syria", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia",
		    "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States of America",
		    "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
		};
	private String[] years = new String[30];
	private String[] months = new String[]{
            	"January", "February", "March", "April", "May", "June",
            	"July", "August", "September", "October", "November", "December"
    	};
    private String[] marital_status = new String[] {
    		"Single","Married","Divorced","Widowed"};
	private String[] gender = new String[] {
			"Boy","Girl","Lesbian","Gay","Transgender","Bisexual"};
	private String[] sex = new String[] {"Male","Female"};
	private JLabel lblNewLabel;
	private JTextField textField;
	private JComboBox Sex_CB;
	private JLabel address_Title;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel City_LBL;
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterEmployee_Class window = new RegisterEmployee_Class();
					window.f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegisterEmployee_Class() {
		initialize();
	}

	private void initialize() {
		f1 = new JFrame();
		f1.setBounds(100, 100, 805, 628);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.getContentPane().setLayout(null);
		
        int currentYear = YearMonth.now().getYear();
        for (int i = 0; i < 30; i++) {
            years[i] = Integer.toString(currentYear + i);
        }
		
		JPanel p1 = new JPanel();
		p1.setBounds(10, 11, 775, 569);
		f1.getContentPane().add(p1);
		p1.setLayout(null);
		
		JLabel FullNameTitle_LBL = new JLabel("FULL NAME");
		FullNameTitle_LBL.setFont(new Font("SansSerif", Font.PLAIN, 25));
		FullNameTitle_LBL.setBounds(310, 10, 145, 45);
		p1.add(FullNameTitle_LBL);
		
		JLabel FName_LBL = new JLabel("First Name");
		FName_LBL.setFont(new Font("SansSerif", Font.PLAIN, 15));
		FName_LBL.setBounds(70, 50, 80, 30);
		p1.add(FName_LBL);
		
		JLabel MName_LBL = new JLabel("Middle Name");
		MName_LBL.setFont(new Font("SansSerif", Font.PLAIN, 15));
		MName_LBL.setBounds(340, 50, 90, 30);
		p1.add(MName_LBL);
		
		JLabel LName_LBL = new JLabel("Last Name");
		LName_LBL.setFont(new Font("SansSerif", Font.PLAIN, 15));
		LName_LBL.setBounds(620, 50, 80, 30);
		p1.add(LName_LBL);
		
		JLabel BirthDateTitle_LBL = new JLabel("Birthdate");
		BirthDateTitle_LBL.setFont(new Font("SansSerif", Font.PLAIN, 15));
		BirthDateTitle_LBL.setBounds(355, 130, 66, 40);
		p1.add(BirthDateTitle_LBL);
		
		JLabel Sex_LBL = new JLabel("Sex and Gender");
		Sex_LBL.setFont(new Font("SansSerif", Font.PLAIN, 15));
		Sex_LBL.setBounds(60, 130, 115, 40);
		p1.add(Sex_LBL);
		
		JLabel Country_LBL = new JLabel("Country");
		Country_LBL.setFont(new Font("SansSerif", Font.PLAIN, 15));
		Country_LBL.setBounds(10, 375, 80, 40);
		p1.add(Country_LBL);
		
		JLabel CivilStatus_LBL = new JLabel("Civil Status");
		CivilStatus_LBL.setFont(new Font("SansSerif", Font.PLAIN, 15));
		CivilStatus_LBL.setBounds(670, 130, 80, 40);
		p1.add(CivilStatus_LBL);
		
		Day_CB = new JComboBox<>();
		Day_CB.setBounds(350, 180, 80, 35);
		p1.add(Day_CB);
		
		Month_CB = new JComboBox<>(months);
		Month_CB.setBounds(260, 180, 80, 35);
		p1.add(Month_CB);
		
		Year_CB = new JComboBox<>(years);
		Year_CB.setBounds(440, 180, 80, 35);
		p1.add(Year_CB);
		
		Gender_CB = new JComboBox<>(gender);
		Gender_CB.setBounds(116, 180, 95, 35);
		p1.add(Gender_CB);
		
		Country_CB = new JComboBox<>(countries);
		Country_CB.setBounds(80, 380, 300, 35);
		p1.add(Country_CB);
		
		MS_CB = new JComboBox<>(marital_status);
		MS_CB.setBounds(650, 180, 115, 35);
		p1.add(MS_CB);
		
		FName_TF = new JTextField();
		FName_TF.setBounds(10, 90, 200, 35);
		p1.add(FName_TF);
		FName_TF.setColumns(10);
		
		MName_TF = new JTextField();
		MName_TF.setBounds(290, 90, 200, 35);
		p1.add(MName_TF);
		MName_TF.setColumns(10);
		
		LName_TF = new JTextField();
		LName_TF.setBounds(565, 90, 200, 35);
		p1.add(LName_TF);
		LName_TF.setColumns(10);
		
		StAdd1_TF = new JTextField();
		StAdd1_TF.setBounds(10, 330, 755, 35);
		p1.add(StAdd1_TF);
		StAdd1_TF.setColumns(10);
		
		StAdd2_TF = new JTextField();
		StAdd2_TF.setBounds(267, 519, 96, 20);
		p1.add(StAdd2_TF);
		StAdd2_TF.setColumns(10);
		
		SP_TF = new JTextField();
		SP_TF.setBounds(545, 380, 220, 35);
		p1.add(SP_TF);
		SP_TF.setColumns(10);
		
		PZC_TF = new JTextField();
		PZC_TF.setBounds(545, 430, 220, 35);
		p1.add(PZC_TF);
		PZC_TF.setColumns(10);
		
		City_TF = new JTextField();
		City_TF.setColumns(10);
		City_TF.setBounds(80, 430, 300, 35);
		p1.add(City_TF);
		
		lblNewLabel = new JLabel("Age");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel.setBounds(580, 130, 30, 40);
		p1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(565, 180, 60, 35);
		p1.add(textField);
		textField.setColumns(10);
		
		Sex_CB = new JComboBox<>(sex);
		Sex_CB.setBounds(10, 180, 95, 35);
		p1.add(Sex_CB);
		
		address_Title = new JLabel("HOME ADDRESS");
		address_Title.setFont(new Font("SansSerif", Font.PLAIN, 25));
		address_Title.setBounds(280, 230, 220, 45);
		p1.add(address_Title);
		
		lblNewLabel_1 = new JLabel("Street Address");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(330, 280, 105, 40);
		p1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("State / Province");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(410, 375, 110, 40);
		p1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("State / Province");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(410, 425, 125, 40);
		p1.add(lblNewLabel_3);
		
		City_LBL = new JLabel("City");
		City_LBL.setFont(new Font("SansSerif", Font.PLAIN, 15));
		City_LBL.setBounds(10, 426, 80, 40);
		p1.add(City_LBL);
		
		ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateDayComboBox();
                }
            }
        };
        Month_CB.addItemListener(itemListener);
        Year_CB.addItemListener(itemListener);
        updateDayComboBox();
	}
	private void updateDayComboBox() {
        int selectedMonth = Month_CB.getSelectedIndex() + 1;
        int selectedYear = Integer.parseInt((String) Year_CB.getSelectedItem());
        int daysInMonth = YearMonth.of(selectedYear, selectedMonth).lengthOfMonth();
        Day_CB.removeAllItems();
        for (int day = 1; day <= daysInMonth; day++) {
            Day_CB.addItem(Integer.toString(day));
        }
    }
}