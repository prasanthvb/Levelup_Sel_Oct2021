package com.levelup.JavaSession;

import java.util.ArrayList;
import java.util.List;

public class Collections_List {
	
	public static void main(String[] args) {
		
		// List and Set 
		// List is an interface
		//List from  java.util
		// <> will have the Generics
		
		// List is something in collection: 
		
		// It allows Duplicates
		// It is Ordered
	
		
		List<String> list = new ArrayList <String>();
		
		list.add("apple"); 
		list.add("mango"); 
		list.add("apple"); 
		list.add("pine"); 
		list.add("orange"); 
		
		
		// Length of the list list.size()
		System.out.println(list.size()); //5
		System.out.println("--------------------------------");
		
		System.out.println(list.get(1));
		System.out.println("--------------------------------");
		
		for (String mylist1 : list) {
			System.out.println(mylist1);
			
		}
		System.out.println("--------------------------------");
		
		boolean contains = list.contains("apple");
		System.out.println(contains);
		
		list.remove("apple");
		System.out.println("--------------------------------");
		for (String mylist2 : list) {
			System.out.println(mylist2);
			
		}
		
		System.out.println("--------------------------------");
		System.out.println(list.size()); //4
		
		
		System.out.println("--------------------------------");
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		
		list.clear(); // Delete the entire list
		System.out.println("--------------------------------");
		System.out.println(list.size()); 
		
		
		System.out.println("--------------------------------");
		boolean empty1 = list.isEmpty();
		System.out.println(empty1);
		
	}
}
