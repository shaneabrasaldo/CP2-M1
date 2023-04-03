package SampleProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeDetails {

	JFrame EmployeeDetails;
	private JTextField LastName_txtbox;
	private JTextField EmpNum_txtbox;
	private JTextField Bday_txtbox;
	private JTextField hoursbreakdown_txtbox;
	private JLabel icon_pic;
	private JTextField FirstName_txtbox;
	private JLabel lblNewLabel;
	private JLabel HoursWorked_label;
	private JLabel Gross_label;
	private JTextField grossbreakdown_txtbox;
	private JLabel grossbreakdown_label;
	private JLabel pagibig_label;
	private JLabel sss_label;
	private JTextField hoursworked_txtbox;
	private JTextField gross_txtbox;
	private JTextField netsalary_txtbox;
	private JLabel NetSalary_label;
	private JTextField pagibig_txtbox;
	private JTextField sss_txtbox;
	private JLabel philhealth_label;
	private JTextField philhealth_txtbox;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel NetSalary_label_1;
	private JLabel deductions_label;
	private JTextField total_txtbox;
	private JLabel total_label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDetails window = new EmployeeDetails();
					window.EmployeeDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		EmployeeDetails = new JFrame();
		EmployeeDetails.setResizable(false);
		EmployeeDetails.setBackground(new Color(184, 180, 201));
		EmployeeDetails.setForeground(new Color(255, 255, 255));
		EmployeeDetails.setTitle("MotorPH");
		EmployeeDetails.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\shane\\Downloads\\Motorcycle Racing Logo (8).png"));
		EmployeeDetails.getContentPane().setBackground(new Color(214, 225, 226));
		EmployeeDetails.setBounds(100, 100, 698, 603);
		EmployeeDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EmployeeDetails.getContentPane().setLayout(null);
		
		hoursbreakdown_txtbox = new JTextField();
		hoursbreakdown_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		hoursbreakdown_txtbox.setEnabled(false);
		hoursbreakdown_txtbox.setColumns(10);
		hoursbreakdown_txtbox.setBounds(269, 178, 178, 95);
		EmployeeDetails.getContentPane().add(hoursbreakdown_txtbox);
		
		JLabel hoursbreakdwon_label = new JLabel("Weekly breakdown");
		hoursbreakdwon_label.setFont(new Font("Century Gothic", Font.BOLD, 13));
		hoursbreakdwon_label.setBounds(270, 162, 178, 13);
		EmployeeDetails.getContentPane().add(hoursbreakdwon_label);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 232, 709);
		EmployeeDetails.getContentPane().add(panel);
		panel.setLayout(null);
		
		LastName_txtbox = new JTextField();
		LastName_txtbox.setBounds(23, 296, 187, 27);
		panel.add(LastName_txtbox);
		LastName_txtbox.setEnabled(false);
		LastName_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 14));
		LastName_txtbox.setColumns(10);
		
		JLabel LastName_label = new JLabel("Last Name");
		LastName_label.setBounds(24, 281, 86, 13);
		panel.add(LastName_label);
		LastName_label.setFont(new Font("Century Gothic", Font.BOLD, 13));
		
		FirstName_txtbox = new JTextField();
		FirstName_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 14));
		FirstName_txtbox.setEnabled(false);
		FirstName_txtbox.setColumns(10);
		FirstName_txtbox.setBounds(23, 354, 187, 27);
		panel.add(FirstName_txtbox);
		
		JLabel FirstName_label = new JLabel("First Name");
		FirstName_label.setFont(new Font("Century Gothic", Font.BOLD, 13));
		FirstName_label.setBounds(24, 339, 86, 13);
		panel.add(FirstName_label);
		
		icon_pic = new JLabel("");
		icon_pic.setBounds(36, 22, 151, 172);
		panel.add(icon_pic);
		icon_pic.setIcon(new ImageIcon("C:\\Users\\shane\\Downloads\\741-7413047_employee-png-grey-transparent-png (1).png"));
		icon_pic.setFont(new Font("Century Gothic", Font.BOLD, 13));
		
		Bday_txtbox = new JTextField();
		Bday_txtbox.setBounds(23, 406, 187, 27);
		panel.add(Bday_txtbox);
		Bday_txtbox.setEnabled(false);
		Bday_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 14));
		Bday_txtbox.setColumns(10);
		
		JLabel Birthday_label = new JLabel("Birthday");
		Birthday_label.setBounds(24, 391, 186, 13);
		panel.add(Birthday_label);
		Birthday_label.setFont(new Font("Century Gothic", Font.BOLD, 13));
		
		EmpNum_txtbox = new JTextField();
		EmpNum_txtbox.setBounds(23, 244, 187, 27);
		panel.add(EmpNum_txtbox);
		EmpNum_txtbox.setEnabled(false);
		EmpNum_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 14));
		EmpNum_txtbox.setColumns(10);
		
		JLabel EmpNum_label = new JLabel("Employee Number");
		EmpNum_label.setBounds(24, 229, 150, 13);
		panel.add(EmpNum_label);
		EmpNum_label.setFont(new Font("Century Gothic", Font.BOLD, 13));
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shane\\Downloads\\Motorcycle Racing Logo (1).png"));
		lblNewLabel.setBounds(-138, 432, 360, 137);
		panel.add(lblNewLabel);
		
		HoursWorked_label = new JLabel("Hours Worked");
		HoursWorked_label.setFont(new Font("Century Gothic", Font.BOLD, 16));
		HoursWorked_label.setBounds(269, 92, 178, 34);
		EmployeeDetails.getContentPane().add(HoursWorked_label);
		
		Gross_label = new JLabel(" Monthly Gross Salary");
		Gross_label.setFont(new Font("Century Gothic", Font.BOLD, 16));
		Gross_label.setBounds(482, 92, 178, 34);
		EmployeeDetails.getContentPane().add(Gross_label);
		
		grossbreakdown_txtbox = new JTextField();
		grossbreakdown_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		grossbreakdown_txtbox.setEnabled(false);
		grossbreakdown_txtbox.setColumns(10);
		grossbreakdown_txtbox.setBounds(482, 179, 178, 93);
		EmployeeDetails.getContentPane().add(grossbreakdown_txtbox);
		
		grossbreakdown_label = new JLabel("Weekly breakdown");
		grossbreakdown_label.setFont(new Font("Century Gothic", Font.BOLD, 13));
		grossbreakdown_label.setBounds(482, 162, 178, 17);
		EmployeeDetails.getContentPane().add(grossbreakdown_label);
		
		pagibig_label = new JLabel("PAG-IBIG");
		pagibig_label.setFont(new Font("Century Gothic", Font.BOLD, 16));
		pagibig_label.setBounds(266, 340, 178, 34);
		EmployeeDetails.getContentPane().add(pagibig_label);
		
		sss_label = new JLabel("SSS");
		sss_label.setFont(new Font("Century Gothic", Font.BOLD, 16));
		sss_label.setBounds(482, 336, 178, 34);
		EmployeeDetails.getContentPane().add(sss_label);
		
		hoursworked_txtbox = new JTextField();
		hoursworked_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		hoursworked_txtbox.setEnabled(false);
		hoursworked_txtbox.setColumns(10);
		hoursworked_txtbox.setBounds(269, 125, 178, 27);
		EmployeeDetails.getContentPane().add(hoursworked_txtbox);
		
		gross_txtbox = new JTextField();
		gross_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		gross_txtbox.setEnabled(false);
		gross_txtbox.setColumns(10);
		gross_txtbox.setBounds(482, 125, 178, 27);
		EmployeeDetails.getContentPane().add(gross_txtbox);
		
		netsalary_txtbox = new JTextField();
		netsalary_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		netsalary_txtbox.setEnabled(false);
		netsalary_txtbox.setColumns(10);
		netsalary_txtbox.setBounds(482, 55, 178, 27);
		EmployeeDetails.getContentPane().add(netsalary_txtbox);
		
		NetSalary_label = new JLabel(" Monthly Net Salary");
		NetSalary_label.setFont(new Font("Century Gothic", Font.BOLD, 16));
		NetSalary_label.setBounds(482, 24, 178, 34);
		EmployeeDetails.getContentPane().add(NetSalary_label);
		
		pagibig_txtbox = new JTextField();
		pagibig_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		pagibig_txtbox.setEnabled(false);
		pagibig_txtbox.setColumns(10);
		pagibig_txtbox.setBounds(266, 370, 178, 27);
		EmployeeDetails.getContentPane().add(pagibig_txtbox);
		
		sss_txtbox = new JTextField();
		sss_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		sss_txtbox.setEnabled(false);
		sss_txtbox.setColumns(10);
		sss_txtbox.setBounds(482, 369, 178, 27);
		EmployeeDetails.getContentPane().add(sss_txtbox);
		
		philhealth_label = new JLabel("Philhealth");
		philhealth_label.setFont(new Font("Century Gothic", Font.BOLD, 16));
		philhealth_label.setBounds(267, 407, 178, 34);
		EmployeeDetails.getContentPane().add(philhealth_label);
		
		philhealth_txtbox = new JTextField();
		philhealth_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		philhealth_txtbox.setEnabled(false);
		philhealth_txtbox.setColumns(10);
		philhealth_txtbox.setBounds(267, 437, 178, 27);
		EmployeeDetails.getContentPane().add(philhealth_txtbox);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(482, 437, 178, 27);
		EmployeeDetails.getContentPane().add(textField);
		
		JLabel sss_label_1 = new JLabel("Withholding Tax");
		sss_label_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		sss_label_1.setBounds(482, 404, 178, 34);
		EmployeeDetails.getContentPane().add(sss_label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(269, 55, 178, 27);
		EmployeeDetails.getContentPane().add(textField_1);
		
		NetSalary_label_1 = new JLabel("Pay Period");
		NetSalary_label_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		NetSalary_label_1.setBounds(269, 24, 391, 34);
		EmployeeDetails.getContentPane().add(NetSalary_label_1);
		
		JPanel deduction_panel = new JPanel();
		deduction_panel.setBackground(new Color(200, 217, 225));
		deduction_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		deduction_panel.setBounds(269, 296, 391, 34);
		EmployeeDetails.getContentPane().add(deduction_panel);
		deduction_panel.setLayout(null);
		
		deductions_label = new JLabel("Deductions");
		deductions_label.setBounds(0, -22, 394, 80);
		deduction_panel.add(deductions_label);
		deductions_label.setBackground(new Color(255, 255, 255));
		deductions_label.setHorizontalAlignment(SwingConstants.CENTER);
		deductions_label.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		total_txtbox = new JTextField();
		total_txtbox.setFont(new Font("Century Gothic", Font.BOLD, 16));
		total_txtbox.setEnabled(false);
		total_txtbox.setColumns(10);
		total_txtbox.setBounds(269, 514, 175, 27);
		EmployeeDetails.getContentPane().add(total_txtbox);
		
		total_label = new JLabel("Total Deductions");
		total_label.setFont(new Font("Century Gothic", Font.BOLD, 16));
		total_label.setBounds(269, 484, 178, 34);
		EmployeeDetails.getContentPane().add(total_label);
		
		JButton Backbutton = new JButton("Go Back");
		Backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      EmployeeLogin empL = new EmployeeLogin();
		      empL.EmployeeLogin.setVisible(true);
		      EmployeeDetails.dispose();
			}
		});
		Backbutton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		Backbutton.setBounds(482, 496, 178, 45);
		EmployeeDetails.getContentPane().add(Backbutton);
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
