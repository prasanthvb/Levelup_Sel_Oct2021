package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Selenium_Base;

public class LoginPage extends Selenium_Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "logo")
	WebElement eleLogo;

	@FindBy(className = "inputLogin")
	WebElement eleUserName;

	@FindBy(id = "password")
	WebElement elePassword;

	@FindBy(className = "decorativeSubmit")
	WebElement eleLogin;

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
}
