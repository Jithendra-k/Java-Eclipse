package project;
import java.util.*;
import java.lang.*;
public class Strings 
{
	public static int countHi(String str) 
	{
	  int c=0;
	  for(int i=0;i<str.length();i++)
	  {
	    if(str.charAt(i)=='h')
	    {
	      if(str.charAt(i+1)=='i')
	      {
	        c++;
	      }
	    }
	  }
	  return c;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		int c=countHi(str);
		System.out.println(c);
	}
}