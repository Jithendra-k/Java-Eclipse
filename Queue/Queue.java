package Lists; 
import java.util.Scanner; 
class QNode 
{ 
protected QNode front=null,rear=null; 
protected int data; 
protected QNode next; 
QNode() 
{ 
this.data=0; 
this.next=null; 
} protected void enQueue() 
{ 
QNode newNode=new QNode(); 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter new node value"); 
int ele=sc.nextInt(); 
newNode.data=ele; 
newNode.next=null; 
if(front==null) 
{ 
front=newNode; 
rear=newNode; 
} else 
{ 
rear.next=newNode; 
rear=newNode; 
} 
System.out.println("Node inserted successfully"); 
} protected void deQueue() 
{ 
if(front==null) 
System.out.println("Queue underflow!!!"); 
else if(front==rear || front.next==null) 
{ 
System.out.println("Deleted node is " + front.data); 
front=null; 
rear=null; 
} else 
{ 
System.out.println("Deleted node is " + front.data); 
front=front.next; 
} 
} protected void display() 
{ 
QNode ptr=front; 
if(front==null) 
System.out.println("No elements in Queue"); 
else 
{ 
System.out.println("Nodes in Queue are"); 
while(ptr!=null) 
{ 
System.out.printf(ptr.data + "->"); 
ptr=ptr.next; 
} 
System.out.println("null"); 
} 
} 
} public class Queue 
{ 
public static void main(String[] args) 
{ 
Scanner sc=new Scanner(System.in); 
QNode q=new QNode(); 
while(true) 
{ 
System.out.printf("\n\n1. Insert\n2. Delete\n3. Display\n4. Exit\n\n"); 
System.out.println("Enter yout option"); 
int op=sc.nextInt(); 
switch(op) 
{ 
case 1: q.enQueue(); 
break; 
case 2: q.deQueue(); 
break; 
case 3: q.display(); 
break; 
case 4: System.exit(0); 
} 
} 
} 
} 
