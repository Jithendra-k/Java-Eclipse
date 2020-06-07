package p1;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Files 
{
	private static String s;
	public static void main(String[] args)throws IOException,FileNotFoundException
	{
		File fobj=new File("buddoda1.txt");
		if(fobj.createNewFile())
		System.out.println("yes");	
		else
		System.out.println("no");	
		Scanner sc=new Scanner(System.in);
		FileWriter fw=new FileWriter("buddoda1.txt");
		fw.write("hadavidi");
		fw.write("great perugu");
		fw.close();
	}
}
