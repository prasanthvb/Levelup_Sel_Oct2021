package com.levelup.Java_OOPS;

public class Bike extends Vehicle {
	
	public boolean diskbrake() {
		return true;
	}
	
	@Override
	public void applybrake() {
		super.applybrake(); // super is key word that is used to access the parent class
		System.out.println("Bike applied brake");
	}

}



// Key : this and Super

// super is key word that is used to access the parent class
//  this is key word that is used to access the current class