package com.levelup.Java_OOPS;

public class TVS extends Bike{
	
	// Class and Class will Extends
	// Interface and Interface will Extends
	
	// Class and Interface ------- It implements
	
	
	// Inheritance-- Multi-Level is possible
	// Multiple inheritance is not possible
	
	
	
	int mileage = 20;
	
	String getcolor(){
		return("Sky Blue");
	}

	public static void main(String[] args) {
		TVS mybike = new TVS();
		
		System.out.println("My bike mileage is " + mybike.mileage);
		System.out.println("My bike color is " + mybike.getcolor());
		
		boolean diskbrake = mybike.diskbrake();
		System.out.println("Disk brake from Bike : " +diskbrake);
		
		mybike.applybrake();
		mybike.applyhorn();
	}
}
