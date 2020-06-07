package project;

public class Prime {

	public static void main(String[] args) 
	{
		
		public class Prime implements Runnable{
		Thread t;
		int n;
		Prime(String name,int n)
		{
			t=new Thread(this,name);
			this.n=n;
			t.start();
		}
		public void run()
		{
			for(int i=2;i<=n;i++)
			{
				int c=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
						c++;

				}

				if(c==2)
				{
					System.out.println(t.getName()+"-"+i);
					try { Thread.sleep(1000); }
					catch(InterruptedException e) {
						System.out.println(e);}
				}
			}
		}
	}
}
