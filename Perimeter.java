package project;
import java.util.Scanner;
public class Perimeter 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a+b)>c && (b+c)>a && (c+a)>b)
		{
			System.out.println("perimeter is:"+(a+b+c));
		}
		else
		{
			System.out.println("input is invalid");
		}
	}
}
