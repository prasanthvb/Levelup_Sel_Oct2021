package com.levelup.JavaSession;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collections_Set {

	public static void main(String[] args) {
		
		// Set is something in collection: 
		
				// It does not allow Duplicates
				// It is Un-ordered
			
		
		// Set- HashSet, TreeSet and LinkedHashSet
				
				Set <String> set1 = new HashSet <String>();
				//HashSet will Remove duplicates and its is unordered
		
		
				//Set <String> set1 = new TreeSet <String>();
				//TreeSet will Remove duplicates and it will maintain ASSCII value- A-Z , It will sort your data
				
				
				//Set <String> set1 = new LinkedHashSet <String>();
				// LinkedHashSet will Remove duplicates and it maintain the insertion Order
				
				set1.add("apple"); 
				set1.add("mango"); 
				set1.add("apple"); 
				set1.add("pine"); 
				set1.add("orange"); 
				
				// Length of the list list.size()
				System.out.println(set1.size()); //4 removed the duplicate
				System.out.println("--------------List below------------------");
				
				List <String> mylist = new ArrayList<String>(set1);
				
				for (String myset : mylist) {
					System.out.println(myset);
				}
				
				System.out.println("----------Window Handling in Selenium---------------------");
				
				String secondString = mylist.get(1);
				System.out.println(secondString);
				System.out.println("-----------List Printed---------------------");
				
				for (String myset : set1) {
					System.out.println(myset);
				}
				// Since order of insertion is not maintained in set...... the .get() method is not allowed in set
				System.out.println("--------------------------------");
			
				boolean contains = set1.contains("orange");
				System.out.println(contains);
				
				System.out.println("--------------------------------");
				
				set1.remove("apple");
				System.out.println("--------------------------------");
				for (String mylist2 : set1) {
					System.out.println(mylist2);
					
				}
				
				System.out.println("--------------------------------");
				System.out.println(set1.size()); //3
				
				System.out.println("--------------------------------");
				boolean empty = set1.isEmpty();
				System.out.println(empty);
				
				
				set1.clear(); // Delete the entire list
				System.out.println("--------------------------------");
				System.out.println(set1.size()); 
				
				
				System.out.println("--------------------------------");
				boolean empty1 = set1.isEmpty();
				System.out.println(empty1);
				

	}
	
}
