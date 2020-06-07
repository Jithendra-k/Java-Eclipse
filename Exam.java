package project;

public class Exam 
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		int a;
		try
		{
			try
			{
				String s=null;
				System.out.println(s.length());
				
			}
			catch(Exception obj)
			{
				System.out.println(obj);
			}
			a=5/0;
			System.out.println(a);
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		
		System.out.println("Hello1");
	}
}
