package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList 
{
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Red");
		list.add("Yellow");
		list.add("black");
		list.add("white");
		list.add("green");
		
		System.out.println("Before Swap");
		for(String a:list)
		{
			System.out.println(a);
		}
		
		Collections.swap(list, 2, 3);
		System.out.println("===============");
		System.out.println("After Swap");
		for(String b:list)
		{
			System.out.println(b);
		}
		
	}

}
