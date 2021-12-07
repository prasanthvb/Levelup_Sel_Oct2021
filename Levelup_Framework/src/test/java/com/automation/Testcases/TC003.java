package com.automation.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.Base.Selenium_Base;
import com.automation.pages.LoginPage;

public class TC003 extends Selenium_Base{
	
	@BeforeClass
	public void testData() {
		fileName = "TestData";
	}
	
	@Test(dataProvider = "LoginData")
	public void loginTest(String UName, String PWD){
		LoginPage login = new LoginPage(driver);
		login.enterUserName(UName);
		login.enterPassword(PWD);
		login.driverWait();
		login.clickLogin();
		login.VerifyErrorMessage();
		
	}
}
