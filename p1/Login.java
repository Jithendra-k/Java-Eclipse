package p1;

import java.lang.String;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 

class LoginFrame extends JFrame implements ActionListener 
 {
 
    Container container = getContentPane();
    JLabel userLabel = new JLabel("Name");
    JLabel passwordLabel = new JLabel("Age");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Add");
    JButton resetButton = new JButton("View");
    JCheckBox showPassword = new JCheckBox("Accept terms and Conditions");
 
 
    LoginFrame() 
    {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
 
    }
 
    public void setLayoutManager() 
    {
        container.setLayout(null);
    }
 
    public void setLocationAndSize() 
    {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
 
 
    }
 
    public void addComponentsToContainer() 
    {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }
 
    public void addActionEvent() 
    {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) 
        {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("Jithendra") && pwdText.equalsIgnoreCase("Jithu")) 
            {
                //JOptionPane.showMessageDialog(this, "Login Successful");
                Jithu j=new Jithu();
                j.setVisible(true);
            } else 
            {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) 
        {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) 
        {
            if (showPassword.isSelected()) 
            {
                passwordField.setEchoChar((char) 0);
            } 
            else 
            {
                passwordField.setEchoChar('*');
            }
 
 
        }
    }
 
}
 
public class Login 
{
    public static void main(String[] a) 
    {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Srinivas Hospital's");
        frame.setVisible(true);
        frame.setBounds(100, 100,450, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
 
    }
 
}
