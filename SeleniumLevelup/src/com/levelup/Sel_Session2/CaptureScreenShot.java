package com.levelup.Sel_Session2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		// File- .png, .jpg, .jpeg
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/img1.png");
		FileHandler.copy(Source, dest);
		
	
		WebElement element1 = driver.findElement(By.xpath("//div[@id='broadcast']"));
		File eleScr = element1.getScreenshotAs(OutputType.FILE);
		File eledest = new File("./Screenshots/img2.png");
		FileHandler.copy(eleScr, eledest);
		
		driver.quit();

	}

}
