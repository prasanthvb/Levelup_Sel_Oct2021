package com.levelup.Sel_Session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// http://automationpractice.com/index.php?controller=contact
		
		System.setProperty("webdriver.chrome.driver", "D:/Levelup/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=contact");
		
		// Note : Attribute should be "type" with value as "file"
		
		WebElement uploadButton = driver.findElement(By.id("fileUpload"));
		uploadButton.sendKeys("C:/Users/Vb Prasanth/Desktop/Defect Tracking.xlsx");
		
		driver.quit();

	}

}
