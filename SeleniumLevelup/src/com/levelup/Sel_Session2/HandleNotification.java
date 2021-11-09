package com.levelup.Sel_Session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandleNotification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Levelup/Drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.carwale.com/");
		
		WebElement newcars = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(newcars).perform();
		//Right Click
		act.contextClick().perform();
		//Double Click
		//act.doubleClick().perform();
	}

}
