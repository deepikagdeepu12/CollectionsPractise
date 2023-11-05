package com.collection;

import java.util.Scanner;

public class PushZero 
{
	public static void zero(int[] ar)
	{
		if(ar.length==0 || ar.length==1)
		{
			return;
		}
		int nz=0;
		int z = 0;
		while(nz<ar.length)
		{
			if(ar[nz]!=0)
			{
				int temp=ar[nz];
				ar[nz]=ar[z];
				ar[z]=temp;
				nz++;
				z++;
			}
			else
			{
				nz++;
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		zero(ar);
for(int i=0;i<ar.length;i++)
{
	System.out.print(ar[i]+ " ");
}
System.out.println();
	}

}
