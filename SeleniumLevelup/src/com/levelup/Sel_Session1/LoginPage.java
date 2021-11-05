package com.levelup.Sel_Session1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser will get launched
		driver.manage().window().maximize();
		
		//Waits
		//Implicite wait 30 sec
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    
	    //Elements
	    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	    
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    
	    WebElement LoginBtn = driver.findElement(By.xpath("//input[@type='submit']"));

	    
	    //Enter User Name
	    username.sendKeys("demosalesmanager");
	    
	    //Click on Login button
	    LoginBtn.click();
	    
	    
	    //Error Message
	    WebElement error= driver.findElement(By.xpath("//div[@id='errorDiv']"));
	 	// boolean displayedstatus = error.isDisplayed();
	  
	 	 //Verification
	 	 if(error.isDisplayed()) {
		//   System.out.println("Error message status is : " + displayedstatus);
	   }
	   
	   //Action based on error message
	   WebElement SecondErrorMsg = driver.findElement(By.xpath("//div[@id='errorDiv']/p[2]"));
	   String SecondErrorMsgText = SecondErrorMsg.getText();
	   System.out.println(SecondErrorMsgText);
	   if(SecondErrorMsgText.equals("password was empty reenter")) {
		   
		   // Re initializing the elements- Stale element Exception
		    WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
		    
		    WebElement password1 = driver.findElement(By.xpath("//input[@id='password']"));
		    
		    WebElement LoginBtn1 = driver.findElement(By.xpath("//input[@type='submit']"));
		   
		// username.clear();
		   username1.sendKeys("demosalesmanager");
		   
		  // password.clear();
		   password1.sendKeys("crmsfa");
		  
		   LoginBtn1.click();
	   }
	   
	   List<WebElement> link = driver.findElements(By.tagName("a"));
	   int size = link.size();
	   System.out.println("Number of links available: " +size );
	   
	  
	   Thread.sleep(3000);
	   // Close the current browser
	   driver.close();
	   
	   // Close all the open tabs or browsers
	  // driver.quit();
	  
	}

}
