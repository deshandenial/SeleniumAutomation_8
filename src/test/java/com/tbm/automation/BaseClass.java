package com.tbm.automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.driver.Driver;



public class BaseClass 
{
	protected BaseClass()
	{
		
	}
	

	WebDriver driver;
	 @BeforeMethod
	  public void beforeTest() throws Exception 
	  {
		 Driver.initDriver();
	  }
	  

	  @AfterMethod
	  public void afterTest() 
	  {
		  Driver.tearDown();
	  }
	

}
