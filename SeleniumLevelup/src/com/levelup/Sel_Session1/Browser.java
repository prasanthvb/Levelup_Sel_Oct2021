package com.levelup.Sel_Session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser will get launched

		//Selenium -----> Driver-----> Browser
		driver.manage().window().maximize();
		
		//
		driver.get("https://www.w3schools.com/");
		
		//Get Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//get Url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		if (title.contains("W3")) {
			System.out.println("We are in W3 schools");
		}
		
		
		driver.close();

	}

}
