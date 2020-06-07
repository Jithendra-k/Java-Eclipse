package p1;
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
import java.lang.String;
class Student
{
    String name,br;
    long id;
    public Student(String a,long b,String c)
    {
   	 this.name=a;
   	 this.id=b;
   	 this.br=c;
    }
    public String toString()
    {
   	 String str;
   	 str=String.format("Name: %s%nID: %d%nBranch: %s%n",name,id,br);
   	 return str;
    }
}
public class MyClass {
public static String st;
    public static void main(String[] args) {
   	 Scanner sc=new Scanner(System.in);
   	 ArrayList<String> obj=new ArrayList<String>();
   	 int n=sc.nextInt();
   	 for(int i=0;i<n;i++)
   	 {
   		 String name=sc.next();
   		 long id=sc.nextLong();
   		 String br=sc.next();
   		Student s=new Student(name,id,br);
   		 st=s.toString();
   		 obj.add(st);
   	 }
   	 System.out.println(obj);
   	 
    }

}