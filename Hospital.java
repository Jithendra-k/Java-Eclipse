package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextPane;

import p1.Jithu;

public class Hospital extends JFrame implements ActionListener
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton b;
	private ButtonGroup bg;
	private JTextField txtoutpatientRecord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospital window = new Hospital();
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
	public Hospital() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Srinivas Hospital's");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(66, 64, 88, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(66, 114, 88, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(184, 62, 168, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 114, 168, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton b = new JButton("Add");
		b.setBackground(Color.GREEN);
		b.setBounds(184, 209, 85, 21);
		frame.getContentPane().add(b);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBackground(Color.PINK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(66, 163, 88, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(184, 170, 67, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(253, 170, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		
		
		txtoutpatientRecord = new JTextField();
		txtoutpatientRecord.setText("***Out-Patient Record***");
		txtoutpatientRecord.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		txtoutpatientRecord.setBackground(new Color(255, 255, 0));
		txtoutpatientRecord.setColumns(10);
		txtoutpatientRecord.setBounds(84, 10, 256, 32);
		frame.getContentPane().add(txtoutpatientRecord);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(157, 234, -60, 19);
		frame.getContentPane().add(textPane);
	}
	public void addActionEvent() 
    {
		b.addActionListener(this);
		
    }    
	 public void actionPerformed(ActionEvent e) 
	    {
	        //Coding Part of LOGIN button
	        if (e.getSource() == b) 
	        {
	            String userText;
	            String pwdText;
	            userText = textField.getText();
	            pwdText = textField_1.getText();
	            if (userText.equalsIgnoreCase("Jithendra") && pwdText.equalsIgnoreCase("Jithu")) 
	            {
	                //JOptionPane.showMessageDialog(this, "Login Successful");
	                Jithu11 j=new Jithu11();
	                j.setVisible(true);
	            } 
	 
	        }
	    }    
}
