package com.automation.Basics;

import org.testng.annotations.Test;

public class TestNG_1 {

	@Test(priority = 1, enabled = false)
	public void signup() {
		System.out.println("Signup page");
	}

	@Test(description = "This method is used for login")
	public void login() {
		System.out.println("login page");
	}

	@Test
	public void searchProduct() {
		System.out.println("search page");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "Basics.TestNG_1.searchProduct", priority = 4, alwaysRun = true)
	public void addTocart() {
		System.out.println("cart page");
	}

	@Test(dependsOnMethods = "addTocart", priority = 5)
	public void payment() {
		System.out.println("Payment page");
	}

	@Test(priority = 6)
	public void signout() {
		System.out.println("logout page");
	}

}
