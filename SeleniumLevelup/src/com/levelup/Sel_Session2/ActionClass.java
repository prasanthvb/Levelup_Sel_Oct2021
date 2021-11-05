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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		
		// Click on Draggable
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act = new Actions(driver);
		// Action - we need to tell our driver once the action is completed .....Tell driver to perform it
		act.clickAndHold(draggable).dragAndDropBy(draggable, 60, 60).release(draggable).perform();
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/drag.png");
		FileHandler.copy(Source, dest);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
