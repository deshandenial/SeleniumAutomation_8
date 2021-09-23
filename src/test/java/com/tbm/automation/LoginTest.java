package com.tbm.automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;





public class LoginTest extends BaseClass
{
	

	@Test
	public void test1()
	{
		
		driver.findElement(By.xpath("//a[@href='/signin']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("deshancse@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("deshan@123");
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).submit();
		
	}
	
	@Test
	public void test2()
	{
		
		driver.findElement(By.xpath("//a[@href='/signin']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("deshancse@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("deshan@123");
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).submit();
	}
	

}
