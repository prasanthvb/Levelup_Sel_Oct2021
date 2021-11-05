package com.levelup.Sel_Session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/pages/frame.html");
	    
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]")));
	    
	    driver.switchTo().frame("frame2");
	    
	    driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	    
	    driver.switchTo().defaultContent();// Used to switch driver to web browser again
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	    driver.close();
	}

}
