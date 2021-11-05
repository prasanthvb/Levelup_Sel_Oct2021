package com.levelup.Sel_Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser will get launched
		driver.manage().window().maximize();
		
		
		
	
		driver.get("https://homeaharaa.com/");
//		
//	WebElement radioHtml = driver.findElement(By.id("html"));
//	
//	radioHtml.click();
////		driver.findElement(By.tagName("input")).click();
////		driver.findElement(By.className("Classs"));
//
//	driver.findElement(By.xpath("//input[@id='javascript']")).click();
	
	
		
		driver.findElement(By.xpath("//button[contains(@class,'popmake-close')]")).click();
		driver.findElement(By.xpath("(//input[@class='autosearch-input'])[1]")).sendKeys("Testing");
	String txt= driver.findElement(By.xpath("//button[contains(@class,'popmake-close')]")).getText();
			
	}

}
