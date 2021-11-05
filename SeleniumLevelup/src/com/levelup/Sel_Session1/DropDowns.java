package com.levelup.Sel_Session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/TestLeaf/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	    
	    username.sendKeys("demosalesmanager");
	    password.sendKeys("crmsfa");
	    login.click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	    
	    // Create lead page functions
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Levelup");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prasanth");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VB");
	    
	    
	    
	    // inside select tag, there will multiple options - Dropdown
	    
//	    Select class has three methods
//	    Select by value
//	    Select  by index
//	    Select by visible text
	    
	    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select sourceDrp = new Select(source);
	    sourceDrp.selectByIndex(4);
	    
	    WebElement Campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select CampaigneDrp = new Select(Campaign);
	    CampaigneDrp.selectByValue("DEMO_MKTG_CAMP");
	    
	    
	    WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select IndustryDrp = new Select(Industry);
	    IndustryDrp.selectByVisibleText("Manufacturing");
	    
	    Thread.sleep(5000);
	    driver.close();
 
	    

	}

}
