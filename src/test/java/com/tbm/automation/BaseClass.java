package com.tbm.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	WebDriver driver;
	 @BeforeMethod
	  public void beforeTest() 
	  {
		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
	  }
	  

	  @AfterMethod
	  public void afterTest() 
	  {
		  driver.close();
	  }

}
