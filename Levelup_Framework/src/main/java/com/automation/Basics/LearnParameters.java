package com.automation.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	
	
	@Parameters({"url", "username", "password"})
	@Test
	public void testcase(String Url, String Username, String Password) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Levelup/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(Url);
	    
	    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	    
	    username.sendKeys(Username);
	    password.sendKeys(Password);
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
