package com.levelup.Sel_Session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/pages/Alert.html");
	    
	    
	    //Alert 1 
	    // Click on Alert Box button
	    driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	    
	    Alert alert = driver.switchTo().alert();
	    
	    String text = alert.getText(); // to get the text in the popup
	    System.out.println(text);
	    alert.accept(); // Click on Ok or accept the pop up
	    
	    
	    // Alert 2
	    driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	    String text2 = alert.getText();
	    System.out.println(text2);
	    alert.dismiss(); /// To Cancel the pop up
	    
	    String CancelText = driver.findElement(By.id("result")).getText();
	    
	    if(CancelText.contains("Cancel")) {
	    	
	    	System.out.println("You clicked on cancel button");
	    }else {
	    	System.out.println("You clicked on Ok button");
		}
	    
	    
	    
	    
	    // Alert 3
	    driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	    String text3 = alert.getText();
	    System.out.println(text3);
	    
	    alert.sendKeys("Levelup"); // Sending an value to popup
	    Thread.sleep(5000);
	    alert.accept(); /// To Accept the pop up
	    
	    String AcceptText = driver.findElement(By.id("result1")).getText();
	    
	    if(AcceptText.contains("Levelup")) {
	    	
	    	System.out.println("You clicked on Ok button");
	    }else {
	    	System.out.println("You clicked on Cancel button");
		}
	    
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	    driver.close();
	}

}
