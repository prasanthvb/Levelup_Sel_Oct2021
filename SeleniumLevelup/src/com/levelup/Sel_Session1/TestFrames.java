package com.levelup.Sel_Session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    
	    
	    driver.switchTo().frame("iframeResult");
	    //driver.switchTo().frame(2);
	   // driver.switchTo().frame(driver.findElement(By.xpath("")));
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    
	    Alert alert = driver.switchTo().alert();
	    String text3 = alert.getText();
	    System.out.println(text3);
	    
	    alert.sendKeys("Levelup"); // Sending an value to popup
	    Thread.sleep(5000);
	    alert.accept(); /// To Accept the pop up
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	    driver.close();
	}

}
