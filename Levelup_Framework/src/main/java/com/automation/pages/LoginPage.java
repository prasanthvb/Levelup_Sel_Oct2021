package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.Base.Selenium_Base;

public class LoginPage extends Selenium_Base {

	public LoginPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(id = "logo")
	WebElement eleLogo;

	@FindBy(className = "inputLogin")
	WebElement eleUserName;
	
	@FindBy(id = "password")
	WebElement elePassword;
	
	@FindBy(className = "decorativeSubmit")
	WebElement eleLogin;
	
	@FindBy(id = "errorDiv")
	WebElement errMsg;

	
	
	
	
	
	// Functionalities
	public void enterUserName(String userName) {
		eleUserName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		elePassword.sendKeys(password);
	}

	public void clickLogin() {
		eleLogin.click();
	}
	
	public void driverWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	// Assertion Methods
	public void VerifyErrorMessage() {
		boolean errorDisplayedStatus = errMsg.isDisplayed();
		Assert.assertEquals(errorDisplayedStatus, false, "The Message is not displayed");
	}
	

}
