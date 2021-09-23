package com.tbm.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.constant.FrameworkConstant;
import com.qa.enums.ConfigProperties;
import com.qa.utils.PropertiesUtils;



public class BaseClass 
{
	WebDriver driver;
	protected BaseClass()
	{
		
	}
	
	 @BeforeMethod
	  public void beforeTest() throws Exception 
	  {
		 	System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromeDriverPath());
			driver = new ChromeDriver();
			driver.get(PropertiesUtils.get(ConfigProperties.URL));
	  }
	  

	  @AfterMethod
	  public void afterTest() 
	  {
		 driver.close();
	  }
	

}
