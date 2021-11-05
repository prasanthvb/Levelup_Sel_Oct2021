package com.levelup.Sel_Session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	    
	    username.sendKeys("demosalesmanager");
	    password.sendKeys("crmsfa");
	    login.click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	    
	   String header = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
	   if(header.equals("Create Lead")) {
		   
		   System.out.println("We are in create lead page");
	   }
	    
	    Thread.sleep(3000);
	    driver.close();

	}

}
