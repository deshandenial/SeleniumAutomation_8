package com.qa.driver;



import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.constant.FrameworkConstant;
import com.qa.enums.ConfigProperties;
import com.qa.utils.PropertiesUtils;



public final class Driver 
{
	private Driver()
	{

	}
	public static void initDriver() throws Exception
	{
		if(Objects.isNull(DriverManager.getDriver()))
		{
			
			System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromeDriverPath());
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertiesUtils.get(ConfigProperties.URL));
		}
	}
	public static void tearDown()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().close();
			DriverManager.unload();
		}
	}
}
