package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.Base.Selenium_Base;

public class WelcomePage extends Selenium_Base {

	public WelcomePage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(id = "form")
	WebElement eleWelcomeHeader;
	
	@FindBy(id = "label")
	WebElement lnkCrm;	
	
	@FindBy(className = "decorativeSubmit")
	WebElement eleLogout;
	
	// Functionalities
	public void getHeaderText() {
		 String text = eleWelcomeHeader.getText();
		 System.out.println(text);
	}

	public void clickCrm() {
		lnkCrm.click();
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

}
