package p1;
import javax.swing.*; 
import java.awt.event.*;   
import java.lang.String;
class Calc implements ActionListener 
{  
	JFrame f;
	JTextField t;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,dot,equal,clr;
	static double a=0,b=0,result=0;
	static String operator=null; 
	public Calc()  
	{
		f=new JFrame("Calculator");
		t=new JTextField();
		f.setLayout(null); 
		f.setSize(350,500);
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");  
		b3=new JButton("3");  
		b4=new JButton("4");  
		b5=new JButton("5");   
		b6=new JButton("6");  
		b7=new JButton("7");
		b8=new JButton("8"); 
		b9=new JButton("9"); 
		div=new JButton("/");   
		mul=new JButton("*");   
		sub=new JButton("-");
		add=new JButton("+"); 
		dot=new JButton(".");  
		equal=new JButton("=");  
		clr=new JButton("Clear");  
		t.setBounds(30,40,280,30);   
		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);   
		div.setBounds(250,100,50,40);    
		b4.setBounds(40,170,50,40); 
		b5.setBounds(110,170,50,40); 
		b6.setBounds(180,170,50,40);   
		mul.setBounds(250,170,50,40);      
		b1.setBounds(40,240,50,40);  
		b2.setBounds(110,240,50,40);   
		b3.setBounds(180,240,50,40); 
		sub.setBounds(250,240,50,40);   
		dot.setBounds(40,310,50,40); 
		b0.setBounds(110,310,50,40);
		equal.setBounds(180,310,50,40);   
		add.setBounds(250,310,50,40);  
		clr.setBounds(180,380,100,40); 
		f.add(t); 
		f.add(b7);   
		f.add(b8);
		f.add(b9);   
		f.add(div); 
		f.add(b4);   
		f.add(b5); 
		f.add(b6); 
		f.add(mul); 
		f.add(b1);  
		f.add(b2);
		f.add(b3);  
		f.add(sub);   
		f.add(dot);  
		f.add(b0);
		f.add(equal);  
		f.add(add); 
		f.add(clr); 
 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setLocationRelativeTo(null); 
		f.setVisible(true); 
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		b3.addActionListener(this); 
		b4.addActionListener(this);  
		b5.addActionListener(this);
		b6.addActionListener(this);  
		b7.addActionListener(this);   
		b8.addActionListener(this);
		b9.addActionListener(this); 
		b0.addActionListener(this);   
		add.addActionListener(this); 
		sub.addActionListener(this);
		mul.addActionListener(this);  
		div.addActionListener(this);   
		dot.addActionListener(this);  
		equal.addActionListener(this);  
		clr.addActionListener(this);  
	}    
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b0)    
			t.setText(t.getText()+"0");    
		if(e.getSource()==b1)    
			t.setText(t.getText()+"1"); 
		if(e.getSource()==b2)   
			t.setText(t.getText()+"2");  
		if(e.getSource()==b3)   
			t.setText(t.getText()+"3");    
		if(e.getSource()==b4)  
			t.setText(t.getText()+"4");
		if(e.getSource()==b5)
			t.setText(t.getText()+"5");   
		if(e.getSource()==b6)  
			t.setText(t.getText()+"6");     
		if(e.getSource()==b7)  
			t.setText(t.getText()+"7");    
		if(e.getSource()==b8)  
			t.setText(t.getText()+"8"); 
		if(e.getSource()==b9) 
			t.setText(t.getText()+"9"); 
		if(e.getSource()==dot) 
			t.setText(t.getText().concat(".")); 
		if(e.getSource()==add) 
		{   
			a=Double.parseDouble(t.getText());   
			operator="+";  
			t.setText("");  
		} 
		if(e.getSource()==sub)  
		{  
			a=Double.parseDouble(t.getText());    
			operator="-";   
			t.setText("");   
		}
		if(e.getSource()==mul)   
		{
			a=Double.parseDouble(t.getText()); 
			operator="*"; 
			t.setText("");
		}
		if(e.getSource()==div)   
		{
			a=Double.parseDouble(t.getText());    
			operator="/"; 
			t.setText(""); 
		}
		if(e.getSource()==equal)
		{
			b=Double.parseDouble(t.getText());
			switch(operator)
			{
				case "+": result=a+b;      
							break; 
				case "-": result=a-b;  
							break;  
				case "*": result=a*b;  
							break; 
				case "/": result=a/b;  
							break; 
				default: result=0;   
			}	
			t.setText(""+result);
		}     	
		if(e.getSource()==clr) 
			t.setText("");  
	}
	public static void main(String args[])  
	{
		new Calc();  
	}
} 
 
