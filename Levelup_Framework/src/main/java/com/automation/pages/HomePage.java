package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.Base.Selenium_Base;

public class HomePage extends Selenium_Base {

	public HomePage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(xpath = "//a[text()='Leads']")
	WebElement eleLeads;
	
	@FindBy(xpath = "//div[text()='My Home']")
	WebElement eleMyHome;	
	
	@FindBy(id = "ext-gen600")
	WebElement eleLogout;
	
	// Functionalities
	public void getHeaderText() {
		 String text = eleMyHome.getText();
		 System.out.println(text);
	}

	public void clickLeads() {
		eleLeads.click();
	}

	public void clickLogout() {
		eleLogout.click();
	}
	
	
	public void driverWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// Assertions
	public void verifyHeader() {
		String expected = "My Home";
		String text = eleMyHome.getText();
		// Verifying the header is displayed or not
		Assert.assertTrue(eleMyHome.isDisplayed(), "The Header is not displayed");
		
		// Verify the String value
		Assert.assertEquals(text, expected);
		
	}

}
