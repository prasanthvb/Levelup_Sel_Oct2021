package com.levelup.Sel_Session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Levelup/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/disapper.html");
		
		// Disappearing Element
		WebElement WebDisappear = driver.findElement(By.xpath("//button[@id='btn']/b"));
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//Wait until the element is getting invisible
		wait.until(ExpectedConditions.invisibilityOf(WebDisappear));
		
		String text = driver.findElement(By.tagName("strong")).getText();
		System.out.println(text);
			driver.quit();
	}

}
