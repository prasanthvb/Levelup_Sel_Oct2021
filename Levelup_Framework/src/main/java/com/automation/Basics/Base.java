package com.automation.Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	
	@BeforeTest
	public void test1() {
		System.out.println(" Im from Before test");
	}

	@BeforeMethod
	public void test2() {
		System.out.println(" Im from Before method");
	}
	@AfterMethod
	public void test4() {
		System.out.println(" Im from After Method");
	}

	@AfterClass
	public void test5() {
		System.out.println(" Im from After Class");
	}
	
	
	
	@Test
	public void test3() {
		System.out.println(" Im the test");
	}
	
	@Test
	public void test6() {
		System.out.println(" Im also the test");
	}

	


}
