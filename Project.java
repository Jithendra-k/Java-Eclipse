package pkg1;

import java.io.*;
import java.util.Scanner; 

class Patientrec 
{ 
	
  String pname,pgender,pbloodgroup; 	 
  int page,pphonenumber,spid,pid; 
  public int q[]=new int[100]; 
  String str1="";  
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public void displayprecord() 
  {         
	  System.out.println("\t #####Patient Details#####"); 
	  System.out.print("I.D. Number:"+pid);
	  System.out.print("\tName:"+pname);   
	  System.out.print("\tAge:"+page);  
	  System.out.print("\tGender:"+pgender);   
	  System.out.print("\tBlood Group:"+pbloodgroup);      
	  System.out.print("\tPhone Number:"+pphonenumber); 
	  System.out.println("\n");      
  } 
  public void pim() throws IOException 
  { 
        int a,k,x,i=0;
        boolean flag1=true;  
        while(flag1)      
        {    
        	System.out.println("1. Write Record ");    
        	System.out.println("2. Update Record ");   
        	System.out.println("3. Search");   
        	System.out.println("4. Display Record");     
        	System.out.println("5. Quit");     
        	System.out.print("Enter your choice: ");       
        	a= Integer.parseInt(br.readLine());    
        	switch(a)     
        	{
        	case 1: // Creation of Patient file      
        			FileWriter fout1 = new FileWriter("patient.txt"); 
        			//Read data from Keyboard 
        			System.out.println("How many Patients?"); 
        			x= Integer.parseInt(br.readLine());  
        			for(k=0;k<x;k++)   
        			{                 
        				System.out.print("Enter Patient Name:");       
        				pname=br.readLine();     
        				System.out.print("Enter Phone Number:");      
        				pphonenumber= Integer.parseInt(br.readLine());       
        				System.out.print("Enter Age:");     
        				page =Integer.parseInt(br.readLine());    
        				System.out.print("Enter Gender:");    
        				pgender=br.readLine();       
        				System.out.print("Enter Bloodgroup:");      
        				pbloodgroup=br.readLine();      
        				System.out.print("Enter I.D. Number:"); 
        				pid=Integer.parseInt(br.readLine());       
        				q[i] = pid;i++; 
     
        				// Written to Patient file               
        				fout1.write(pphonenumber+"  \n");      
        				fout1.write(pname+"  \n");      
        				fout1.write(page+"  \n");         
        				fout1.write(pgender+"  \n");       
        				fout1.write(pbloodgroup+"  \n");     
        				fout1.write(pid+"  \n\n");     
        			}
        			fout1.write("EOF");   
        			fout1.close();     
        			System.out.println("\nFile is created\n");      
        			break;  
        	case 2: // Updation of Patient file  
        			FileWriter fout2 = new FileWriter("patient.txt",true);      
        			//Read data from Keyboard  
        			System.out.println("How many Patients?");       
        			x= Integer.parseInt(br.readLine());    
        			for(k=0;k<x;k++)   
        			{ 
        				System.out.print("Enter Patient Name:");      
        				pname=br.readLine();      
        				System.out.print("Enter Phone Number:");       
        				pphonenumber= Integer.parseInt(br.readLine());       
        				System.out.print("Enter Age:");     
        				page =Integer.parseInt(br.readLine());     
        				System.out.print("Enter Gender:"); 
        				pgender=br.readLine();   
        				System.out.print("Enter Bloodgroup:");      
        				pbloodgroup=br.readLine();    
        				System.out.print("Enter I.D Number:");     
        				pid=Integer.parseInt(br.readLine());    
        				q[i] = pid;i++;
        				
                          
        				// Written to Patient file     
        				fout2.write(pphonenumber+"  \n");     
        				fout2.write(pname+"  \n");       
        				fout2.write(page+"  \n");       
        				fout2.write(pgender+"  \n");         
        				fout2.write(pbloodgroup+"  \n");        
        				fout2.write(pid+"  \n\n");       
        			}
        			fout2.write("EOF");  
        			fout2.close();    
        			System.out.println("\nFile is updated\n");      
        			break;     
        	case 3: System.out.print("Enter Patient I.D. Number:");         
        			spid = Integer.parseInt(br.readLine());     
        	case 4: FileReader fin = new FileReader("patient.txt");     
        			Scanner sc = new Scanner(fin);
        			while(sc.hasNextInt())    
        			{
        				//Read data from file  
        				pphonenumber = sc.nextInt();      
        				pname = sc.next();     
        				page = sc.nextInt();   
        				pgender = sc.next();    
        				pbloodgroup = sc.next();   
        				pid = sc.nextInt();      
        				q[i] = pid;     
        				if(a==4)     
        					displayprecord();      
        				else if(a==3)
        				{    
        					if(spid == q[i])   
        						displayprecord();   
        					else 
        						System.out.println("Record not found");   
        				}         
        			}
        			str1 = sc.next();      
        			if (str1.equals("EOF")) 
        			{   
        				System.out.println("End of file");      
        			} 
        			else
        			{ 
        				System.out.println("File format error.");     
        			}        
        			fin.close();      
        			break;      
        	case 5: flag1=false;            
        			break;    
        	default:System.out.println("Wrong Choice!!");       
        	flag1=false;
        	}
        }
  }
} 


class Doctorrec
{ 
   String dname,dgender,dspecial;     
   int dage,dphonenumber,sdid,did;   
   public int r[]=new int[100];     
   String str2="";  
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
   public void displaydrecord() 
   {  
	   System.out.println("\t #####Doctor Details#####");    
	   System.out.print("I.D. Number:"+did);   
	   System.out.print("\tName:"+dname);  
	   System.out.print("\tAge:"+dage);   
	   System.out.print("\tGender:"+dgender);   
	   System.out.print("\tBlood Group:"+dspecial);    
	   System.out.print("\tPhone Number:"+dphonenumber);    
	   System.out.println("\n"); 

   }   
   public void dim() throws IOException
   {
	   int b,l,y; 
	   boolean flag2=true; 
	   while(flag2) 
	   {
		   System.out.println("1. Write Record ");  
		   System.out.println("2. Update Record ");   
		   System.out.println("3. Search");      
		   System.out.println("4. Display Record");  
		   System.out.println("5. Quit");     
		   System.out.print("Enter your choice: ");     
		   b= Integer.parseInt(br.readLine());
		   switch(b)  
		   { 
		   case 1: // Creation of Doctor file          
			   		FileWriter fout1 = new FileWriter("doctor.txt");                
			   		System.out.println("How many Doctors?\t");    
			   		y= Integer.parseInt(br.readLine());    
			   		for(l=0;l<y;l++)  
			   		{   
			   			System.out.print("Enter Doctor Name:");        
			   			dname=br.readLine();     
			   			System.out.print("Enter Phone Number:");        
			   			dphonenumber= Integer.parseInt(br.readLine());      
			   			System.out.print("Enter Age:");      
			   			dage =Integer.parseInt(br.readLine()); 
			   			System.out.print("Enter Gender:");    
			   			dgender=br.readLine();      
			   			System.out.print("Enter Specialisation:");      
			   			dspecial=br.readLine();      
			   			System.out.print("Enter I.D. Number:");        
			   			did=Integer.parseInt(br.readLine());            
			   			// Written to Doctor file   
			   			fout1.write(dphonenumber+"  \n");     
			   			fout1.write(dname+"  \n");     
			   			fout1.write(dage+"  \n");         
			   			fout1.write(dgender+"  \n");       
			   			fout1.write(dspecial+"  \n");    
			   			fout1.write(did+"  \n\n");     
			   		}
			   		fout1.write("EOF");          
			   		fout1.close();   
			   		System.out.println("\nFile is created\n");    
			   		break;    
		   case 2: // Updation of Doctor file 
			   		FileWriter fout2 = new FileWriter("doctor.txt",true);        
			   		System.out.println("How many Doctors?\t");        
			   		y= Integer.parseInt(br.readLine());     
			   		for(l=0;l<y;l++)       
			   		{
			   			System.out.print("Enter Doctor Name:");          
			   			dname=br.readLine();      
			   			System.out.print("Enter Phone Number:");      
			   			dphonenumber= Integer.parseInt(br.readLine());      
			   			System.out.print("Enter Age:");         
			   			dage =Integer.parseInt(br.readLine());        
			   			System.out.print("Enter Gender:");       
			   			dgender=br.readLine(); 
			   			System.out.print("Enter Specialisation:");     
			   			dspecial=br.readLine();      
			   			System.out.print("Enter I.D. Number:");        
			   			did=Integer.parseInt(br.readLine());      
			   			// Written to Doctor file   
			   			fout2.write(dphonenumber+"  \n");     
			   			fout2.write(dname+"  \n");     
			   			fout2.write(dage+"  \n");     
			   			fout2.write(dgender+"  \n");       
			   			fout2.write(dspecial+"  \n");      
			   			fout2.write(did+"  \n\n");      
			   		}
			   		fout2.write("EOF");  
			   		fout2.close();      
			   		System.out.println("\nFile is updated\n");       
			   		break;     
		   case 3: System.out.print("Enter Doctor I.D. Number:");      
		   			sdid = Integer.parseInt(br.readLine());    
		   case 4: FileReader fin = new FileReader("doctor.txt");            
		   			Scanner sc = new Scanner(fin);        
		   			while(sc.hasNextInt())     
		   			{     
		   				//Read data from file      
		   				dphonenumber = sc.nextInt();      
		   				dname = sc.next();   
		   				dage = sc.nextInt();       
		   				dgender = sc.next();      
		   				dspecial = sc.next();        
		   				did = sc.nextInt();     
		   				int i=0;       
		   				r[i]=did;
		   				i++;       
		   				if(b==4)
                           displaydrecord();      
		   				else if(b==3)
		   				{
		   					if(sdid == did)     
		   						displaydrecord();     
		   					else     
		   						System.out.println("Record not found");      
		   				}
		   			}
		   			str2 = sc.next();      
		   			if (str2.equals("EOF")) 
		   			{      
		   				System.out.println("End of file");     
		   			}
		   			else
		   			{
		   				System.out.println("File format error.");     
		   			}
		   			fin.close();         
		   			break;     
		   	case 5: flag2=false;     
		   			break;     
		   	default:System.out.println("Wrong Choice!!");         
		   			flag2=false;     
		   			break;   
		   			}
		   }
	   }
   } 


class Treatmentrec 
{
	String dateofjoining,treatment,diagnoseddisease,prescription,dischargedate,result; 
	int tid,stid,spid,sdid,t1,t2;  
	boolean f=true;
	String str3="";
	BufferedReader   br  = new BufferedReader(new InputStreamReader(System.in)); 
	Patientrec       p1  = new Patientrec();  
	Doctorrec        d1  = new Doctorrec(); 

    void displaytrecord() throws IOException 
    {   
    	System.out.print("Treament I.D. Number:"+tid); 
    	System.out.print("Date of Joining:"+dateofjoining);    
    	System.out.print("Patient's I.D. Number:"+spid);  
    	System.out.print("Doctor's I.D. Number:"+sdid);       
    	System.out.print("Treament:"+treatment);    
    	System.out.print("Disease Diagnosed with:"+diagnoseddisease);      
    	System.out.print("Medicines Prescription:"+prescription);      
    	System.out.print("Date of Discharge:"+dischargedate);     
    	System.out.print("RESULT:"+result); 
    	System.out.println("\n");  
    }
    public void tim() throws IOException 
    {
    	int c,m,z;
    	boolean flag3=true; 

    	while(flag3)
    	{    
    		System.out.println("1. Write Record ");   
    		System.out.println("2. Update Record ");       
    		System.out.println("3. Search");  
    		System.out.println("4. Display Record");         
    		System.out.println("5. Quit"); 
    		System.out.print("Enter your choice: ");     
    		c= Integer.parseInt(br.readLine());    
    		switch(c) 
    		{     
    		case 1: FileWriter fout3 = new FileWriter("treatment.txt"); 
                       System.out.print("How many Treatment Records? ");      
                       z= Integer.parseInt(br.readLine());    
                       for(m=0;m<z;m++) 
                       {
                    	   System.out.print("Enter Date of Joining:");        
                    	   dateofjoining=br.readLine();   
                    	   System.out.print("Enter Patient's I.D. Number:");     
                    	   t1= Integer.parseInt(br.readLine());       
                    	   int k=0;     
                    	   if(p1.q.length!=0) 
                    	   { 
                    		   if(t1 == p1.q[k])      
                    			   System.out.println("Patient I.D number not found");    
                    		   else       
                    		   {         
                    			   t1=1;      
                    			   spid=t1;k++;      
                    			   System.out.println("Patient I.D number found");                      
                    		   }
                    	   }               
                    	   System.out.print("Enter Doctor's I.D. Number:");     
                    	   t2=Integer.parseInt(br.readLine());  
                    	   int l=0;          
                    	   if(d1.r.length!=0)
                    	   {    
                    		   if(d1.r[l] == t2)   
                    			   System.out.println("Doctor I.D number not found");    
                    		   else
                    		   {         
                    			   t2=2;l++;         
                    			   sdid= t2;     
                    			   System.out.println("Doctor I.D number found");      
                    		   }       
                    	   } 
                    	   System.out.print("Enter Treament:");  
                    	   treatment=br.readLine(); 
                    	   
                           System.out.print("Enter Disease Diagnosed with:");     
                           diagnoseddisease=br.readLine();     
                           System.out.print("Enter Medicines Prescribed:");     
                           prescription=br.readLine();       
                           System.out.print("Enter Date of Discharge:");     
                           dischargedate=br.readLine();  
                           System.out.print("Enter RESULT:");       
                           result=br.readLine();      
                           System.out.print("Enter Treatment I.D. Number:");         
                           tid =Integer.parseInt(br.readLine());       
                           //Write to file.  
                           fout3.write(tid+"  \n");          
                           fout3.write(dateofjoining+"  \n");        
                           fout3.write(treatment+"  \n");       
                           fout3.write(diagnoseddisease+"  \n");      
                           fout3.write(prescription+"  \n");      
                           fout3.write(dischargedate+"  \n");     
                           fout3.write(result+"  \n");    
                           fout3.write(sdid+"  \n\n");        
                       }
                       fout3.write("EOF");   
                       fout3.close();     
                       System.out.println("File is created");      
                       break;      
    		case 2: FileWriter fout4 = new FileWriter("treatment.txt");  
                       System.out.print("How many Treatment Records? "); 
                       z= Integer.parseInt(br.readLine());     
                       for(m=0;m<z;m++) 
                       {
                    	   System.out.print("Enter Date of Joining:");        
                    	   dateofjoining=br.readLine();    
                    	   System.out.print("Enter Patient's I.D. Number:"); 
                           t1= Integer.parseInt(br.readLine());               
                           int k=0;   
                           if(p1.q.length!=0)
                           {     
                        	   if(t1 == p1.q[k])     
                        		   System.out.println("Patient I.D number not found");     
                        	   else     
                        	   {        
                        		   t1=1;     
                        		   spid=t1;k++;        
                        		   System.out.println("Patient I.D number found");       
                        	   }
                           }
                           System.out.print("Enter Doctor's I.D. Number:");
                           t2=Integer.parseInt(br.readLine());      
                           int l=0;     
                           if(d1.r.length!=0)
                           {
                        	   if(d1.r[l] == t2)  
                        		   System.out.println("Doctor I.D number not found");    
                        	   else
                        	   {               
                        		   t2=2;l++;       
                        		   sdid= t2;    
                        		   System.out.println("Doctor I.D number found");    
                        	   }
                           }
                           System.out.print("Enter Treament:");          
                           treatment=br.readLine();    
                           System.out.print("Enter Disease Diagnosed with:");      
                           diagnoseddisease=br.readLine();     
                           System.out.print("Enter Medicines Prescribed:");    
                           prescription=br.readLine();      
                           System.out.print("Enter Date of Discharge:");        
                           dischargedate=br.readLine();    
                           System.out.print("Enter RESULT:"); 
 
                           result=br.readLine();    
                           System.out.print("Enter Treatment I.D. Number:");      
                           tid =Integer.parseInt(br.readLine());    
                           //Write to file.
                           fout4.write(tid+"  \n");   
                           fout4.write(dateofjoining+"  \n");       
                           fout4.write(treatment+"  \n");  
                           fout4.write(diagnoseddisease+"  \n");    
                           fout4.write(prescription+"  \n");      
                           fout4.write(dischargedate+"  \n");   
                           fout4.write(result+"  \n");       
                           fout4.write(sdid+"  \n\n");      
                       }
                       fout4.write("EOF");        
                       fout4.close();     
                       System.out.println("File is created");   
                       break;     
    		case 3:System.out.print("Enter Treatment I.D. Number : ");  
    				stid = Integer.parseInt(br.readLine());     
    		case 4:FileReader fin = new FileReader("treatment.txt");    
    				Scanner sc = new Scanner(fin);
    				while(sc.hasNextInt())  
    				{
    					//Read data from file     
    					tid = sc.nextInt();       
    					dateofjoining = sc.next();    
    					treatment = sc.next();   
    					diagnoseddisease = sc.next();     
    					prescription = sc.next();       
    					dischargedate = sc.next();    
    					result = sc.next();   
    					spid = sc.nextInt();
    					sdid = sc.nextInt();  
    					if(c==3)     
    					{         
    						displaytrecord();     
    					}
    					if(c==2)
    					{
    						if(spid==p1.pid && sdid==d1.did && stid==tid)     
    						{ 
    							displaytrecord();  
    						}
    					}
    				}
    				str3= sc.next();   
    				if(str3.equals("EOF"))       
    				{  
    					System.out.println("\nEnd of file");      
    				}
    				else        
    				{       
    					System.out.println("File format error.");      
    				} 
    				fin.close();       
    				break;        
    		case 5: flag3=false;
    				break;  
    		default:System.out.println("Wrong Choice!!");  
    		}
    	}
    }
}  
public class Project
{
	public static void main(String[] args) throws IOException
	{    
		int choice;  
		boolean flag=true;    
		final int LIMIT = 300; 
		int count = 0;
		String username1 = "hospital"; 
		String password1 = "management";  
		String username2,password2;
		Scanner scan = new Scanner (System.in);   
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));    
		Patientrec      pr = new Patientrec();  
		Doctorrec       dr = new Doctorrec();     
		Treatmentrec    tr = new Treatmentrec();    
		while(flag)
		{  
			System.out.print ("Enter Username: ");  
			username2 = scan.nextLine();

			if (username1.equals(username2))
			{
				while(count < LIMIT)
				{   
					System.out.print("Enter Passwsord: ");
					password2 = scan.nextLine();
					if(password2.equals(password1))  
					{  
						System.out.println("Welcome!");   
						System.out.println("\tMenu"); 
						System.out.println("1. Patient Information Management ");  
						System.out.println("2. Doctor Information Management");        
						System.out.println("3. Treatment Information Management");       
						System.out.println("4. Quit"); 
						System.out.print("Enter your choice: ");       
						choice= Integer.parseInt(br.readLine());     
						switch(choice)
						{
						case 1:        
								pr.pim();
								break;    
						case 2:    
								dr.dim();
								break;   
						case 3:    
								tr.tim();
								break;   
						case 4:   
								System.out.println("Quit");      
								System.exit(0);   
						default:System.out.println("Wrong Choice!!");      
						} 
					}
					else
					{
						System.out.println("Incorrect entry. Please try again.");  
						count++;  
					}
				}
				System.out.println("Your 3 tries are up!");
				System.out.println("Wiping hard drive!");   
				System.exit(0);
			} 
		}
	}
} 
