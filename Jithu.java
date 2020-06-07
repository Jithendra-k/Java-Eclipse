import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JToolBar;

public class Jithu 
{

	private JFrame frame;
	private JTextField txtXcjnjdn;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jithu window = new Jithu();
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
	public Jithu() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtXcjnjdn = new JTextField();
		txtXcjnjdn.setBounds(213, 23, 125, 29);
		frame.getContentPane().add(txtXcjnjdn);
		txtXcjnjdn.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(58, 104, 125, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel IblNew_Label = new JLabel("Username");
		IblNew_Label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		IblNew_Label.setBounds(58, 23, 125, 29);
		frame.getContentPane().add(IblNew_Label);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(213, 104, 125, 29);
		frame.getContentPane().add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(" Remember Me");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.ITALIC, 15));
		chckbxNewCheckBox.setBounds(58, 148, 280, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(129, 198, 137, 36);
		frame.getContentPane().add(btnNewButton);
	}
}
