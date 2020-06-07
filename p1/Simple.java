package p1;
import java.lang.String;
public class Simple 
{
	String name="Apple";
	float sal=1000.237F;    
	static Simple obj=new Simple();
	protected static Simple getInstance()
	{   
		return obj;  
	}  
	void display() 
	{   
		System.out.println("Name is "+obj.name);
		System.out.println("Salary is "+obj.sal); 
	}
}


