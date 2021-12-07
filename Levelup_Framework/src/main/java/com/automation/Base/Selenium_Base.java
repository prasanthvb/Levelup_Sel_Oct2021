package com.automation.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utility.ReadExcel;
import utility.ReadExcelData;

public class Selenium_Base {
	
	public WebDriver driver = null;
	String url = "http://leaftaps.com/opentaps/control/main";
	public String fileName =  "";
	
	@DataProvider(name = "LoginData")
	public String[][] dataProvider() throws IOException {
		String[][] exceldata = ReadExcelData.getData(fileName);
		return exceldata;
	}
	
	@BeforeMethod
	public void initBrowser(){

		System.setProperty("webdriver.chrome.driver", "D:/Levelup/driver/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(url);
	}
//	
//	//@Parameters({"url", "username", "password"})
//	@BeforeMethod
//	public void startAPP(){
//		initBrowser("http://leaftaps.com/opentaps/control/main");
//	}

	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
	
	

}
