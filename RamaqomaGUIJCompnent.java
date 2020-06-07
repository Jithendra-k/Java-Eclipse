package project;

/*************/
/****@ AUTHOR */
/****RAMAQOMA */
/****SESHELE  */
/****901002502*/
/****BIT A*** */
/***YEAR 4*** */
/***LIMKOKWING*/
/**************/                
import java.awt.print.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
import javax.swing.JLabel;
import java.awt.MenuItem;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.border.*;
import java.lang.reflect.*;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.beans.*;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.*;
import java.lang.reflect.InvocationTargetException;

public class RamaqomaGUIJCompnent extends JFrame implements ActionListener 
{
static RamaqomaGUIJCompnent frame=new RamaqomaGUIJCompnent() ;
private ImageIcon icon=new ImageIcon("2.jpg");
private ImageIcon icon1 = new ImageIcon("ra.gif");
private String line1 = ""; 
private String line2 = "";
private String line3 = "";
private JTextArea textArea;
private int valBold = Font.PLAIN; 
private int valItalic = Font.PLAIN;
private JRadioButton boldJCheckBox;     
private JRadioButton italicJCheckBox;
private JList colorJList; 
private JList copyJList;
private JButton copyJButton,arrows;
final Object rows[][] = {
                        {"1", "Seshele ","Ramaqoma","901002222"},
								{"2", "Ramaqoma","Seshel","901002502"},
								{"3", "Makara","Hape","901002505"},
								{"4", "Liteboho ","Moloi","901002333"},
								{"5", "Moloi","Liteboho","901002345"},
								{"6", "Khalieli","Sama","901001111"},
								{"7", "Tanki","Koli","901002223"},
								{"8", "Liemiso","Paki","901002233"},
								{"9", "Akon","Akon","901002501"},
								{"10", "Kape","Libe","901003333"},
								{"11", "Kabelo","Setala","901002345"},
								{"12", "TB","Toy","901002346"},
								{"13", "Kb","Kali","901002456"},
								{"14", "Max","K","901003445"},
								{"15", "DAVID ","Tsheuoa","901002444"},
								{"16", "Kapy","Koko","901005555"},
								{"17", "George","John","901006666"},
								{"18", "Nal","Abia","901007777"},
								{"19", "Likeli","Maphatshoe","901008888"},
								{"20", "Kgotso","Pule","901009999"},
								};
final Object headers[] = {"Print Patient #",
                          "print Patient Surname",                
								  "Print Patient Names","Patient ID",};
//variable declaration
JPanel pane,pane1,pane2,buttonPane,All,mainPane,p1,p2,me,r,panel,panel1,panel2;
JButton ok,clear,exit,save,submit,print;

BasicArrowButton up = new BasicArrowButton(BasicArrowButton.NORTH),
               down = new BasicArrowButton(BasicArrowButton.SOUTH),
              right = new BasicArrowButton(BasicArrowButton.EAST),
               left = new BasicArrowButton(BasicArrowButton.WEST);
JTextField txtnname,txtsname,txtAddress,txtfile,txtemail,textField;
JPasswordField txtID ;
JLabel lbname1,lbsname,lbID,lbAddress,lbfile,lbemail;
RamaqomaGUIJCompnent () // the constructor 
{
super("Ramaqoma");
JFrame.setDefaultLookAndFeelDecorated(true);
Runnable runner = new Runnable() {
public void run() {
final JTable table = new JTable(rows, headers);
table.setBackground(Color.yellow);
frame.setSize(1065, 559);
JScrollPane scrollPane = new JScrollPane(table);
frame.add(scrollPane, BorderLayout.EAST);
ActionListener printAction = new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
table.print();
} catch (PrinterException pe) {
System.err.println("Error printing: " + pe.getMessage());
}
}
};
print.addActionListener(printAction);
}
};
 EventQueue.invokeLater(runner);
boldJCheckBox = new JRadioButton( "Bold" );
italicJCheckBox = new JRadioButton( "Italic" );   
add( boldJCheckBox ); 
add( italicJCheckBox );
Ramaqoma handler = new Ramaqoma();
boldJCheckBox.addItemListener( handler );       
italicJCheckBox.addItemListener( handler );  
pane = new JPanel();
pane1 = new JPanel();
pane2 = new JPanel();
buttonPane=new JPanel();
buttonPane.setLayout(new GridLayout(1,1,1,1));
mainPane=new JPanel();
mainPane.setLayout(new GridLayout(3, 1, 1, 1));
panel=new JPanel();
JPanel me=new JPanel();
me.setLayout(new GridLayout(1, 0));
JPanel p1 = new JPanel();
pane.setLayout(new GridLayout(4, 3));
p1.setSize(90, 60);
p1.setBackground(Color.blue);
JPanel p2 = new JPanel(new BorderLayout());
JPanel bluePanel = new JPanel();
p2.add (p1, BorderLayout.CENTER);
add(p2, BorderLayout.CENTER);
JPanel r = new JPanel();
//my label &tetxtfield  initialization
lbname1=new JLabel("First Name");
lbsname=new JLabel("Last Name");
lbID=new JLabel("ID Number");
lbAddress=new JLabel("P. Address");
lbfile=new JLabel("File No");
lbemail=new JLabel("E - mail");
txtnname=new JTextField(11);
txtnname.setToolTipText("Name textfield");
txtsname=new JTextField(11);
txtsname.setToolTipText("Surname textfield");
txtID=new JPasswordField(11);
txtID.setToolTipText("Password textfield");
 txtID.setEchoChar('*');
  txtID.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e)
 { JPasswordField input = (JPasswordField)e.getSource();
  char[] password = input.getPassword(); 
  if (input==txtID) 
  { 
  JOptionPane.showMessageDialog(txtnname, "Success! You typed the right password."); 
  } 
  else 
  { 
  JOptionPane.showMessageDialog(txtnname, "Invalid password. Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
   }
	}
	} );
txtAddress=new JTextField(11);
txtAddress.setToolTipText("Address textfield");
txtfile=new JTextField(11);
txtfile.setToolTipText("File textfield");
txtemail=new JTextField(11);
textField=new JTextField(11);
txtemail.setToolTipText("E-Mail textfield");
add(pane);
//my buttons initialization 
ok = new JButton("OK");
ok.setBackground(Color.green);
print = new JButton("Print");
print.setToolTipText("Print Table on the right");
ok.setToolTipText("check Text");
save = new JButton("Save");
save.setToolTipText("Save text");
submit = new JButton("Submit");
submit.setToolTipText("Submit text");
clear=new JButton("Clear");
clear.setToolTipText("Clear Text");
exit=new JButton("Exit");
exit.setToolTipText("Close System");
exit.setBackground(Color.red);
pane1.setBackground(Color.pink);
r.setSize(50, 50);
r.setBackground(Color.red);
p1.add(r);
p1.setBackground(Color.green);  
bluePanel.setBackground(Color.blue);
bluePanel.add(p1);
//arrows button
Container cp = getContentPane();
         cp.setLayout(new FlowLayout());
         JPanel jp = new JPanel();
         jp.setBorder(new TitledBorder("Directions"));
         jp.add(boldJCheckBox);
		   boldJCheckBox.setToolTipText("Change Font Style to Bold");
			jp.add(up);
			up.setToolTipText("North arrow");
			jp.add(down);
			down.setToolTipText("South arrow");
         jp.add(left);
			left.setToolTipText("West arrow");
         jp.add(right);
			right.setToolTipText("Go to print Table on the right");
         jp.add(italicJCheckBox);
			italicJCheckBox.setToolTipText("Change Font Style to Italic");
      	cp.add(jp);
add(bluePanel);
setLayout (new FlowLayout(FlowLayout.CENTER, 1, 1));
 //creating object for checkbox
ButtonGroup group = new ButtonGroup();
AbstractButton abstract1 =new JCheckBox("X-Ray");
abstract1.setToolTipText("X-Ray");

r.add(abstract1);
group.add(abstract1);
AbstractButton abstract2 =new JCheckBox("Blood Test");
abstract2.setToolTipText("Blood Test");
r.add(abstract2);
group.add(abstract2);
ButtonGroup group2 = new ButtonGroup();
AbstractButton abstract5 =new JCheckBox("Treatment");
abstract5.setToolTipText("Treatment");

r.add(abstract5);
group.add(abstract5);
AbstractButton abstract6 =new JCheckBox("Injection");
abstract6.setToolTipText("Injection");

r.add(abstract6);
group.add(abstract6);
//creating object for Radiobutton 
 ButtonGroup group1 = new ButtonGroup();
 AbstractButton abstract3 =new JRadioButton("Male");
 abstract3.setToolTipText("Male");
add(abstract3);
r. add(abstract3);
group1.add(abstract3);
AbstractButton abstract4 =new JRadioButton("Female");
abstract4.setToolTipText("Female");
add(abstract4);
r.add(abstract4);
group1.add(abstract4);
//creating compobox
r. add(new JComboBox(new String[]{"patient 1","patient 2","patient 3",
                                  "patient 4","patient 5","patient 6",
											 "patient 6","patient 7","patient 8",
											 "patient 9","patient 10","patient 11",
											 "patient 12","patient 13","patient 14",
											 "patient 15","patient 16","patient 17",
											 "patient 18","patient 19","patient 20",
											 "patient 21","patient 22","patient 23"}));
		 //adding labels and textfield to the panel
pane1.add(lbname1);
pane1.add(txtnname);
pane1.add(lbsname);
pane1.add(txtsname);
pane1.add(lbfile);
pane1.add(txtfile);
pane2.add(lbID);
pane2.add(txtID);
pane2.add(lbAddress);
pane2.add(txtAddress);
pane2.add(lbemail);
pane2.add(txtemail);

mainPane.add(pane1);
mainPane.add(pane2);
mainPane.add(bluePanel);
panel.add(new JLabel(icon));
//panel.add(new JLabel(icon2));
panel.add(new JLabel(icon1));
pane.add(panel);
mainPane.add(buttonPane);
mainPane.setBorder(  BorderFactory.createTitledBorder("Patient service "));
mainPane.setBackground(Color.orange);
pane.add(bluePanel);
bluePanel.setBorder(  BorderFactory.createTitledBorder("Status of patient "));
pane.add(mainPane,BorderLayout.CENTER);
pane.setBackground(Color.magenta);
mainPane.add(jp);
Container con = this.getContentPane();// inherit main frame
con.add(pane,BorderLayout.CENTER);

//con.add(jp);
 //buttonPane.setBorder(BorderFactory.createEmptyBorder()); //right 
//buttonPane.add(new JSeparator(JSeparator.HORIZONTAL), BorderLayout.LINE_START);
//JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true,ok,save);
  pane.add(buttonPane);
pane.setBorder(  BorderFactory.createTitledBorder("WELCOME TO DR.S.E.RAMAQOMA'S HOSPITAL"));
pane.setLayout( new BoxLayout(pane, BoxLayout.Y_AXIS));
ok.setMnemonic('P'); // associate hotkey 
print.addActionListener(this);
ok.addActionListener(this);// register button listener 
save.addActionListener(this);
submit.addActionListener(this);
clear.addActionListener(this);
exit.addActionListener(this);
//adding buttons to the panel
buttonPane.add(ok);
buttonPane.add(print);
buttonPane.add(save);
buttonPane.add(submit);
buttonPane.add(clear);
buttonPane.add(exit);
ok.requestFocus();
setVisible(true); 
} 

private class Ramaqoma implements ItemListener
{   
public void itemStateChanged( ItemEvent event )
{
if ( event.getSource() == boldJCheckBox )
valBold = boldJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
if ( event.getSource() == italicJCheckBox )
valItalic =italicJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
txtnname.setFont( new Font( "Times New Roman", valBold + valItalic, 20  ) );
txtsname.setFont( new Font( "Times New Roman", valBold + valItalic, 20 ) );
txtID.setFont( new Font( "Times New Roman", valBold + valItalic,  20 ) );
txtAddress.setFont( new Font( "Times New Roman", valBold + valItalic,  20  ) );
txtfile.setFont( new Font( "Times New Roman", valBold + valItalic,  20  ) );
 txtemail.setFont( new Font( "Times New Roman", valBold + valItalic,  20  ) );
  textField.setFont( new Font( "Times New Roman", valBold + valItalic,  20 ) );
} 
} 
// here is the basic event handler 
public void actionPerformed(ActionEvent event)
{                                                                                                                                                                                                                                                                      
Object source = event.getSource(); 
if (source == ok)
{
ok.setBackground(Color.cyan);
txtnname.setText("");
txtsname.setText("");
txtID.setText("");
txtAddress.setText("");
JOptionPane.showMessageDialog(null,"Thanks bye!","Message Dialog",
JOptionPane.PLAIN_MESSAGE);
}
else 
if(source==clear)
{

txtnname.setText("");
txtsname.setText("");
txtID.setText("");
txtAddress.setText("");
txtfile.setText("");
txtemail.setText("");
JOptionPane.showMessageDialog(null,"text deleted","Message Dialog",
JOptionPane.PLAIN_MESSAGE);

}
else
if(source==exit)
{
dispose();
}
else
if(source==save)
{
save.setBackground(Color.blue);

JOptionPane.showMessageDialog(null,"Sorry nothing to save","Message Dialog",
JOptionPane.PLAIN_MESSAGE);
}
else
if(source==print)
{
}
if(source==submit)
{
JOptionPane.showMessageDialog(null,"Sorry no database to submit data","Message Dialog",
JOptionPane.PLAIN_MESSAGE);

}
}
public void Manus() {
Runnable runner = new Runnable() {
public void run() {
JScrollPane leftScrollPane = new JScrollPane(textField);
leftScrollPane.setPreferredSize(null);
final JTextArea rightArea = new JTextArea();
JScrollPane rightScrollPane = new JScrollPane(rightArea);
rightScrollPane.setPreferredSize(null);
JMenuBar menuBar = new JMenuBar();
frame.setJMenuBar(menuBar);
 JMenuItem smenuItem;
JMenu menu = new JMenu("Options                  ");
menu.setFont(new Font("Time New Roman",Font.BOLD,12));
menu.setToolTipText("Option menu");
menu.add(menu);
menuBar.add(menu);
menuBar.setBorder(BorderFactory.createTitledBorder("PARAY HOSPTAL"));

JMenuItem menuItem;
//option menu
Action readAction =textField.getActionMap().get(DefaultEditorKit.readOnlyAction);
menuItem = menu.add(readAction);
menuItem.setText("Read-Only");
Action writeAction =
textField.getActionMap().get(DefaultEditorKit.writableAction);
menuItem = menu.add(writeAction);
menuItem.setText("Writable");

menu.addSeparator();
Action cutAction =textField.getActionMap().get(DefaultEditorKit.cutAction);
menuItem = menu.add(cutAction);
menuItem.setText("Cut");
Action copyAction =textField.getActionMap().get(DefaultEditorKit.copyAction);
menuItem = menu.add(copyAction);
menuItem.setText("Copy");
Action pasteAction =textField.getActionMap().get(DefaultEditorKit.pasteAction);
menuItem = menu.add(pasteAction);
menuItem.setText("Paste");//end of option menu

//file menu
JMenu fileMenu = new JMenu("     File    ");
fileMenu.setFont(new Font("Time New Roman",Font.BOLD,12));

fileMenu.setToolTipText("Files manu");

fileMenu.setMnemonic(KeyEvent.VK_F);
menuBar.add(fileMenu);
JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
fileMenu.add(newMenuItem);
JMenuItem openMenuItem = new JMenuItem("Open", KeyEvent.VK_O);
fileMenu.add(openMenuItem);
JMenuItem closeMenuItem = new JMenuItem("Close", KeyEvent.VK_C);
fileMenu.add(closeMenuItem);
fileMenu.addSeparator();
JMenuItem saveMenuItem = new JMenuItem("Save", KeyEvent.VK_S);
fileMenu.add(saveMenuItem);
fileMenu.addSeparator();
JMenuItem exitMenuItem = new JMenuItem("Exit", KeyEvent.VK_X);
fileMenu.add(exitMenuItem);//endit of menu
//start of edit menu
JMenu editMenu = new JMenu("        Edit    ");
editMenu.setToolTipText("Edit menu");
editMenu.setFont(new Font("Time New Roman",Font.BOLD,12));

editMenu.setMnemonic(KeyEvent.VK_E);
menuBar.add(editMenu);
JMenuItem cutMenuItem = new JMenuItem("Cut", KeyEvent.VK_T);
KeyStroke ctrlXKeyStroke = KeyStroke.getKeyStroke("control X");
cutMenuItem.setAccelerator(ctrlXKeyStroke);
editMenu.add(cutMenuItem);
JMenuItem copyMenuItem = new JMenuItem("Copy", KeyEvent.VK_C);
KeyStroke ctrlCKeyStroke = KeyStroke.getKeyStroke("control C");
copyMenuItem.setAccelerator(ctrlCKeyStroke);
editMenu.add(copyMenuItem);
JMenuItem pasteMenuItem = new JMenuItem("Paste", KeyEvent.VK_P);
KeyStroke ctrlVKeyStroke = KeyStroke.getKeyStroke("control V");
pasteMenuItem.setAccelerator(ctrlVKeyStroke);
pasteMenuItem.setEnabled(false);
editMenu.add(pasteMenuItem);
editMenu.addSeparator();
JMenuItem findMenuItem = new JMenuItem("Find", KeyEvent.VK_F);
KeyStroke f3KeyStroke = KeyStroke.getKeyStroke("F3");
findMenuItem.setAccelerator(f3KeyStroke);
editMenu.add(findMenuItem);
JMenu findOptionsMenu = new JMenu("Options");
//JLabel n= new JLabel ("-->");
findOptionsMenu.setText("Menu");
findOptionsMenu.setMnemonic(KeyEvent.VK_O);
ButtonGroup directionGroup = new ButtonGroup();
JRadioButtonMenuItem forwardMenuItem =new JRadioButtonMenuItem("Forward", true);
forwardMenuItem.setMnemonic(KeyEvent.VK_F);
findOptionsMenu.add(forwardMenuItem);
directionGroup.add(forwardMenuItem);
JRadioButtonMenuItem backwardMenuItem =new JRadioButtonMenuItem("Backward");
backwardMenuItem.setMnemonic(KeyEvent.VK_B);
findOptionsMenu.add(backwardMenuItem);
directionGroup.add(backwardMenuItem);
findOptionsMenu.addSeparator();
JCheckBoxMenuItem caseMenuItem =new JCheckBoxMenuItem("Case Sensitive");
caseMenuItem.setMnemonic(KeyEvent.VK_C);
findOptionsMenu.add(caseMenuItem);
editMenu.add(findOptionsMenu);//end of edit menu
JMenu view = new JMenu("        View     ");
view.setToolTipText("View manu");
view.setFont(new Font("Time New Roman",Font.BOLD,12));

view.setMnemonic(KeyEvent.VK_E);
menuBar.add(view);
JMenuItem findMenuItem3 = new JMenuItem("Find", KeyEvent.VK_F);
KeyStroke f3KeyStroke1 = KeyStroke.getKeyStroke("F3");
findMenuItem3.setAccelerator(f3KeyStroke);
view.add(findMenuItem3);
JMenu findOptionsMenu3 = new JMenu("ToolBars");
Icon atIcon3 = new ImageIcon ("3.jpg");
findOptionsMenu3.setIcon(atIcon3);
findOptionsMenu3.setMnemonic(KeyEvent.VK_O);
ButtonGroup directionGroup3 = new ButtonGroup();
JRadioButtonMenuItem singleMenuItem =new JRadioButtonMenuItem("Single", true);
singleMenuItem.setMnemonic(KeyEvent.VK_F);
findOptionsMenu3.add(singleMenuItem);
directionGroup3.add(singleMenuItem);
JRadioButtonMenuItem multipleMenuItem =new JRadioButtonMenuItem("Multiple");
multipleMenuItem.setMnemonic(KeyEvent.VK_B);
findOptionsMenu3.add(multipleMenuItem);
directionGroup3.add(multipleMenuItem);
findOptionsMenu3.addSeparator();
JRadioButtonMenuItem noneMenuItem =new JRadioButtonMenuItem("None");
noneMenuItem.setMnemonic(KeyEvent.VK_C);
findOptionsMenu3.add(noneMenuItem);
view.add(findOptionsMenu3);

JMenu tools = new JMenu("      Tools       ");
tools.setToolTipText("Tool menu");
tools.setFont(new Font("Time New Roman",Font.BOLD,12));
menuBar.add(tools);
JMenuItem menuItem2;
Action readAction2 =textField.getActionMap().get(DefaultEditorKit.readOnlyAction);
menuItem2 = menu.add(readAction);
menuItem2.setText("Read-Only");
Action writeAction2 =
textField.getActionMap().get(DefaultEditorKit.writableAction);
menuItem2 = tools.add(writeAction);
menuItem2.setText("Writable");

tools.addSeparator();
Action cutAction2 =textField.getActionMap().get(DefaultEditorKit.cutAction);
menuItem2 = tools.add(cutAction);
menuItem2.setText("Cut");
Action copyAction2 =textField.getActionMap().get(DefaultEditorKit.copyAction);
menuItem2 =tools.add(copyAction);
menuItem2.setText("Copy");
Action pasteAction2 =textField.getActionMap().get(DefaultEditorKit.pasteAction);
menuItem2 = tools.add(pasteAction);
menuItem2.setText("Paste");
//
JMenu editMenu4 = new JMenu("         Help       ");
editMenu4.setToolTipText("Help menu");
editMenu4.setFont(new Font("Time New Roman",Font.BOLD,12));

editMenu4.setMnemonic(KeyEvent.VK_E);
menuBar.add(editMenu4);
JMenuItem findMenuItem4 = new JMenuItem("Find", KeyEvent.VK_F);
KeyStroke f3KeyStroke3 = KeyStroke.getKeyStroke("F3");
findMenuItem4.setAccelerator(f3KeyStroke);
editMenu4.add(findMenuItem4);
JMenu findOptionsMenu4 = new JMenu("ToolBars");
Icon atIcon2 = new ImageIcon ("2.jpg");
findOptionsMenu4.setIcon(atIcon2);
findOptionsMenu4.setMnemonic(KeyEvent.VK_O);
ButtonGroup directionGroup4 = new ButtonGroup();
JRadioButtonMenuItem singleMenuItem1 =new JRadioButtonMenuItem("Single", true);
singleMenuItem1.setMnemonic(KeyEvent.VK_F);
findOptionsMenu4.add(singleMenuItem1);
directionGroup4.add(singleMenuItem1);
JRadioButtonMenuItem multipleMenuItem1 =new JRadioButtonMenuItem("Multiple");
multipleMenuItem1.setMnemonic(KeyEvent.VK_B);
findOptionsMenu4.add(multipleMenuItem1);
directionGroup4.add(multipleMenuItem1);
findOptionsMenu4.addSeparator();
JRadioButtonMenuItem noneMenuItem1 =new JRadioButtonMenuItem("None");
noneMenuItem1.setMnemonic(KeyEvent.VK_C);
findOptionsMenu4.add(noneMenuItem1);
view.add(findOptionsMenu3);
}
};
EventQueue.invokeLater(runner);
}

public static void main(String args[])
{
JFrame.setDefaultLookAndFeelDecorated(true);
//RamaqomaGUIJCompnent frame=new RamaqomaGUIJCompnent ();


frame.Manus();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(1126, 611);
frame.setVisible(true);
}

}
