package com.automation.Testcases;

import org.testng.annotations.Test;

import com.automation.Base.Selenium_Base;
import com.automation.pages.LoginPage;

public class TC001 extends Selenium_Base{

	@Test
	public void loginTest(){
		LoginPage login = new LoginPage();
		login.enterUserName("Abcsd");
		login.enterPassword("fgjhdsfgjhdf");
		login.driverWait();
		login.clickLogin();
	}
	
	@Test
	public void loginTest1(){
		LoginPage login = new LoginPage();
		login.enterUserName("14313243");
		login.enterPassword("465464646");
		login.driverWait();
		login.clickLogin();
	}
	
}
