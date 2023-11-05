package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAsanddec 
{
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(40);
		System.out.println(list);
		System.out.println("Decending order");
	
		Collections.sort(list);
		
		Collections.reverse(list);
		
		for(int i=list.size()-1;i>0;i--)
		{
			System.out.println(list);
		}
		
		
		Collections.sort(list);
		System.out.println("----------");
		
		
		System.out.println("Ascending order");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list);
		
	}
		

}}
