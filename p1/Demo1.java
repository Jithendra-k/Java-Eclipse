package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo1 
{
	
	public static void main(String[] args) throws FileNotFoundException
	   { 
		System.out.println("123");
	    File f1=new File("buddoda.txt"); 
	    Scanner sc1=new Scanner(f1); 
	     
	    File f2=new File("buddoda1.txt"); 
	    Scanner sc2=new Scanner(f2); 
	     
	    System.out.println("ID\tName\tAddress"); 
	    while(sc1.hasNext()) 
	    { 
	     sc2.nextLong(); //Ignore ID in Address file 
	     System.out.println(sc1.nextLong()+" "+sc1.next()+" "+sc2.next()); 
	    } 
	   } 
}
