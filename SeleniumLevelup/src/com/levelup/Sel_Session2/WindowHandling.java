package com.levelup.Sel_Session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		  
		  String FirstWindow = driver.getWindowHandle();
		  System.out.println(FirstWindow);
		  
		  
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		  driver.findElement(By.xpath("//button[text()='Try it']")).click(); // Second win will open
		  
		  
//		  String FirstWindow1 = driver.getWindowHandle();
//		  System.out.println(FirstWindow1);
		 // driver.close();
		  
		  Set<String> allwins = driver.getWindowHandles();
		  System.out.println(allwins);
		  List<String> eachWindow = new ArrayList<String>(allwins);
		  // 0 1
//		  driver.switchTo().window(eachWindow.get(1));
//		  System.out.println(driver.getTitle());
		  
		  
		  
		  // Second Scenario if I have more window
		  for(int i = 0; i< eachWindow.size(); i++) {
			  
			  driver.switchTo().window(eachWindow.get(i));
			  if (driver.getTitle().contains("W3Schools")) {
				  System.out.println(driver.getCurrentUrl());
			  }
			  
		  }
		  driver.quit();
	}

}
