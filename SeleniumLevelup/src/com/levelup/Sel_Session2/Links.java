package com.levelup.Sel_Session2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://testleaf.herokuapp.com/pages/Link.html");
		  
		  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		  
		  for(int i = 0; i<allLinks.size(); i++) {
			  // 0 1 2 3 4 5 < 6
			  
			  allLinks.get(i).click();
			  
			  if(driver.getTitle().contains("404")) {
				  System.out.println("Link is broken");
				  System.out.println(driver.getTitle());
				  driver.navigate().back();
				  allLinks = driver.findElements(By.tagName("a"));  
			  }else {
				  System.out.println("Below page is working");
				  System.out.println(driver.getTitle());
				  driver.navigate().back();
				  allLinks = driver.findElements(By.tagName("a")); 
			  }
		  }
		  
		  driver.quit();

	}

}
