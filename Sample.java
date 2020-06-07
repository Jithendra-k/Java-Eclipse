import java.util.Scanner;
public class Sample 
{
	
	Scanner sc = new Scanner(System.in);
	static Sample obj = new Sample();
	public static void main(String[] args)
	{
		Sample obj1 = new Sample();
		System.out.print(obj1.sum());
	}
	private int sum()
	{
		int a = obj.read();
		int b = obj.read();
		return a+b;
	}
	private int read()
	{
		int a = sc.nextInt();
		return a;
	}
}
