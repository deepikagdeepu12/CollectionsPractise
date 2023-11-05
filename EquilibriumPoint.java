package com.collection;

import java.util.Scanner;

public class EquilibriumPoint 
{
	public static int equ(int ar[],int a)
	{
		int  ts=0;
        int  ls=0;
        
        for(int i=0;i<a-1;i++)
        {
            ts+=ar[i];
        }
        for(int i=0;i<a-1;i++)
        {
            ts-=ar[i];
            if(ls==ts)
            {
                return i+1;
            }
            
            ls+=ar[i];
        }
        return -1;
      
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length-1;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println(equ(ar,a));
		
	}

}
