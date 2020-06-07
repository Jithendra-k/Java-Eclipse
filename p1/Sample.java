package p1;

import java.util.Arrays;

public class Sample
{
	public static void main(String[] args)
	{
		int a[] = new int[5];
		a[0] = 7;
		a[1] = 2;
		a[2] = 8;
		a[3] = 10;
		a[4] = 1;
		for(int i=0;i<5;i++)
			System.out.print(a[i]);
		System.out.println("");
		Arrays.sort(a);
		for(int i=0;i<5;i++)
			System.out.print(a[i]);
	}

}
