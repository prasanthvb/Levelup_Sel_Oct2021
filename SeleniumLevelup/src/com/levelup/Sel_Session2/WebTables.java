package com.levelup.Sel_Session2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Levelup/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		// Get the Table 
		WebElement webTable = driver.findElement(By.id("table_id"));
		
		// Getting the table Rows
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		
		//find the size of rows
		System.out.println("Number of rows : " + tableRows.size());
		
		// Find the first row
		WebElement webFirstRow = tableRows.get(0);
		
		// get all the columns in row 1
		List<WebElement> tablecolumns = webFirstRow.findElements(By.tagName("th"));
		
		//find the size of columns
		System.out.println("Number of columns : " + tablecolumns.size());
		
		
		// Getting all the values in the table
		for (WebElement rowElements : tableRows) {
			String text = rowElements.getText();
			System.out.println(text);
		}
		
		// Getting a specific column value
		for (int i = 1; i < tableRows.size(); i++) {
			WebElement individualRow = tableRows.get(i);
			List<WebElement> findIndColumn = individualRow.findElements(By.tagName("td"));
			String text = findIndColumn.get(1).getText();
			System.out.println(text);
		}
		
		driver.quit();
		
	}

}
