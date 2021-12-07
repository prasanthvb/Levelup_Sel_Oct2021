package com.automation.Basics;

import org.testng.annotations.Test;

public class TestNG_2 {

	@Test(groups = {"smoke", "sanity"})
	public void signup() {
		System.out.println("Signup page");
	}

	@Test(groups = {"sanity"})
	public void login() {
		System.out.println("login page");
	}

	@Test(groups = {"smoke"})
	public void searchProduct() {
		System.out.println("search page");
	}

	@Test
	public void addTocart() {
		System.out.println("cart page");
	}

	@Test(groups = {"sanity"})
	public void payment() {
		System.out.println("Payment page");
	}

	@Test(groups = {"smoke"})
	public void signout() {
		System.out.println("logout page");
	}

}
