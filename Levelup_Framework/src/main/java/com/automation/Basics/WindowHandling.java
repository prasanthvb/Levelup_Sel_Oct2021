package com.automation.Basics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/PrasanthVB/Selenium Automation/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		List<WebElement> socialNetworks = driver.findElements(By.xpath("//ul[@class='social']/li"));

		String mainwin = driver.getWindowHandle();
		for (Iterator<WebElement> iterator = socialNetworks.iterator(); iterator.hasNext();) {
			WebElement social = (WebElement) iterator.next();
			social.click();

			Set<String> allwin = driver.getWindowHandles();
			Iterator<String> it = allwin.iterator();

			while (it.hasNext()) {
				String childwin = it.next();
				if (!mainwin.equalsIgnoreCase(childwin)) {
					driver.switchTo().window(childwin);
					System.out.println("Switched to child Window");
					System.out.println(driver.getTitle());
					driver.close();
					System.out.println("Closed child Window");
					Thread.sleep(3000);
				}
			}
			driver.switchTo().window(mainwin);
			System.out.println("Returned to Main Window");
		}
		driver.close();
	}

}
