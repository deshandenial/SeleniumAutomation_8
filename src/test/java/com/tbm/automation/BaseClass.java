package com.tbm.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.util.concurrent.Uninterruptibles;




public class BaseClass 
{
	WebDriver driver;
	protected BaseClass()
	{
		
	}
	
	 @BeforeMethod
	  public void beforeTest() throws Exception 
	  {
		 	System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://letcode.in/");
			driver.manage().window().maximize();
			Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	  }
	  

	  @AfterMethod
	  public void afterTest() 
	  {
		 driver.close();
	  }
	

}
