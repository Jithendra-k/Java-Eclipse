package project;
import java.util.Scanner;
public class Exam1 
{
	int accnumber;
	String name,branch;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int accountnumber=sc.nextInt();
		Exam1 b[]=new Exam1[100];
		for(int i=0;i<100;i++)
		{
			b[i]=new Exam1();
		}
		accDetails(accountnumber,b);
		
	}
	public static void accDetails(int accnum,Exam1 b[])
	{
		int i;
		getaccnumber(accnum,b);
		for(i=0;i<100;i++)
		{
			if(b[i].accnumber==accnum)
			{
				System.out.println(b[i].accnumber);
				System.out.println(b[i].name);
				System.out.println(b[i].branch);
			}
		}
	}
	public static void getaccnumber(int accnum,Exam1 b[])
	{
		b[9].accnumber=100;
		b[9].name="JITHU";
		b[9].branch="vijayawada";
	}
}

