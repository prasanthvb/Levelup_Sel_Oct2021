package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperty {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		
		properties.load(new FileInputStream("./config.properties"));
		
		String myvalue = properties.getProperty("Welcome");
		
		System.out.println("My Welcome value is ==== " + myvalue);
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:/Levelup/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	    
	    username.sendKeys(properties.getProperty("UserName"));
	    password.sendKeys(properties.getProperty("Password"));
	    login.click();
		
		
		
	}

}
