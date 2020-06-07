package project;

public class Methodoveloading 
{
	public static void main(String[] args)
	{
		int a=5,b=7;
		System.out.println(a+b);
		long c=8;
		main(c);
		main(a+1);
	}
	public static void main(long c)
	{
		System.out.println(c*c);
	}
	public static void main(int d)
	{
		System.out.println(d*d);
	}
}
