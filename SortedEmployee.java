package com.collection;

import java.util.TreeSet;

public class SortedEmployee 
{
	public static void main(String[] args) {
		
		Employee emp1=new Employee(3, "c");
		Employee emp2=new Employee(1, "a");
		Employee emp3=new Employee(2, "b");
		
		SortedById sort=new SortedById();
		TreeSet<Employee> set=new TreeSet<Employee>(sort);
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		
		
		for(Employee em : set)
		{
			System.out.println(em);
		}
		
		
		
	}

}
