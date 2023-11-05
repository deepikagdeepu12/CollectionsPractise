package com.collection;

import java.util.Scanner;

//Column name from a given column number

public class CoumName 
{
	public static String colum(int n)
	{
		String r="";
		while(n>0)
		{
			n--;
			int temp=n % 26;
			char col=(char)('A' +temp);
			r=col+r;
					n=n/26;
		}
		return r;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(colum(n));
		
	}
	

}
