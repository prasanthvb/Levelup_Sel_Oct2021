package com.levelup.Sel_Session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

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
	    
	    
	    WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    
	    // These three methods will return a boolean value.... True/False
	    // isDisplayed
	    // isEnabled
	    // isSelected
	    
	    
	    boolean displayed = checkbox.isDisplayed();
	    System.out.println("The checkbox displayed status is : " +displayed);
	    
	    boolean enabled = checkbox.isEnabled();
	    System.out.println("The checkbox enabled status is : " +enabled);
	    
	    
	    boolean Beforeselect = checkbox.isSelected();
	    System.out.println("The checkbox Beforeselected status is : " +Beforeselect);
	    
	    checkbox.click();
	    
	    boolean Afterselect = checkbox.isSelected();
	    System.out.println("The checkbox Afterselected status is : " +Afterselect);
	    
	    Thread.sleep(5000);
	    driver.close();

	}

}
