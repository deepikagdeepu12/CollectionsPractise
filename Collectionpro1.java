package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionpro1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList<>(); 
		
		l.add(10);
		l.add(90);
		l.add(40);
		l.add(60);
		l.add(30);
		l.add(20);
		System.out.println(l);
		
		System.out.println("Before sorting");
		for(Integer c:l)
		{
			System.out.println(c);
		}
		
		Collections.sort(l);
		
		System.out.println("After Sorting");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
	}

	

	
	
}
