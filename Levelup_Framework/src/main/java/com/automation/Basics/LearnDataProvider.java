package com.automation.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.DataUtils;

public class LearnDataProvider {
	
	@Test(dataProvider = "login", dataProviderClass = DataUtils.class)
	public void testcase(String Username, String Password) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Levelup/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	    username.sendKeys(Username);
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    password.sendKeys(Password);
	    WebElement login = driver.findElement(By.xpath("//input[@type='submit1']"));
	  
	    login.click();
	    
	    try {
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
