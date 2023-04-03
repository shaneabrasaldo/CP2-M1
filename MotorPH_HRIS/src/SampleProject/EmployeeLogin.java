package SampleProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class EmployeeLogin {

	JFrame EmployeeLogin;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLogin window = new EmployeeLogin();
					window.EmployeeLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		EmployeeLogin = new JFrame();
		EmployeeLogin.setResizable(false);
		EmployeeLogin.setFont(new Font("Century Gothic", Font.BOLD, 14));
		EmployeeLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\shane\\eclipse-workspace\\MotorPH_HRIS\\src\\Data\\Motorcycle Racing Logo (8).png"));
		EmployeeLogin.setTitle("MotorPH");
		EmployeeLogin.setBounds(100, 100, 770, 365);
		EmployeeLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EmployeeLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(168, 189, 193));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 356, 327);
		EmployeeLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to MotorPH");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 36, 225, 43);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField.setForeground(new Color(72, 101, 104));
		textField.setBounds(61, 119, 237, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(61, 104, 101, 13);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "2022"}));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(187, 204, 111, 21);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pay Period");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(61, 168, 101, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Month");
		lblNewLabel_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(61, 191, 50, 13);
		panel.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setForeground(new Color(72, 101, 104));
		comboBox_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "9", "10", "11", "12"}));
		comboBox_1.setMaximumRowCount(5);
		comboBox_1.setBounds(61, 204, 78, 21);
		panel.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeDetails empD = new EmployeeDetails();
				empD.EmployeeDetails.setVisible(true);
				EmployeeLogin.dispose();
			}
		});
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnNewButton.setBounds(93, 264, 160, 27);
		panel.add(btnNewButton);
			
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(61, 145, 237, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Year");
		lblNewLabel_1_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(187, 192, 50, 13);
		panel.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(226, 234, 235));
		panel_1.setBounds(355, 0, 401, 327);
		EmployeeLogin.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\shane\\eclipse-workspace\\MotorPH_HRIS\\src\\Data\\Motorcycle Racing Logo (1).png"));
		lblNewLabel_1_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(-39, 83, 376, 157);
		panel_1.add(lblNewLabel_1_1_2);
	}
}
