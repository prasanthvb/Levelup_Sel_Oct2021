package com.automation.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Selenium_Base {
	
	public WebDriver driver = null;
	String url = "http://leaftaps.com/opentaps/control/main";
	
	@BeforeMethod
	public void initBrowser(){

		System.setProperty("webdriver.chrome.driver", "D:/Levelup/driver/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(url);
	}
//	
//	//@Parameters({"url", "username", "password"})
//	@BeforeMethod
//	public void startAPP(){
//		initBrowser("http://leaftaps.com/opentaps/control/main");
//	}

	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
	
	

}
