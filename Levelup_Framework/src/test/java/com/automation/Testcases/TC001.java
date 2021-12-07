package com.automation.Testcases;

import org.testng.annotations.Test;

import com.automation.Base.Selenium_Base;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.WelcomePage;

public class TC001 extends Selenium_Base{

	@Test
	public void loginTest(){
		LoginPage login = new LoginPage(driver);
		WelcomePage welcome = new WelcomePage(driver);
		HomePage home = new HomePage(driver);
		
		//Login page
		login.enterUserName("demosalesmanager");
		login.enterPassword("crmsfa");
		login.driverWait();
		login.clickLogin();
		
		// Welcome Page
		welcome.getHeaderText();
		welcome.clickCrm();
		welcome.driverWait();
		
		// Home Page
		home.verifyHeader();
		home.clickLeads();
		
	}
}
