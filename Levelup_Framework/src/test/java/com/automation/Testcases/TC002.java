package com.automation.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.Base.Selenium_Base;
import com.automation.pages.LoginPage;

public class TC002 extends Selenium_Base{
	@BeforeClass
	public void testData() {
		fileName = "TestData";
	}
	
	@Test(dataProvider = "LoginData")
	public void loginTest(String[] data){
		LoginPage login = new LoginPage(driver);
		login.enterUserName(data[0]);
		login.enterPassword(data[1]);
		login.driverWait();
		login.clickLogin();
	}
}
