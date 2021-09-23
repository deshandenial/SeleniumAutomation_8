package com.tbm.automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sample1 extends BaseClass
{
		@Test
	  public void test1() 
	  {
		
		
		  driver.findElement(By.xpath("//span[text()='Get access to your Orders, Wishlist and Recommendations']/following::input")).sendKeys("deshancse@gmail.com");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		  driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd')]//span[1]")).click();
	  }
		
		@Test
		  public void test2() 
		  {
			
			  
			  driver.findElement(By.xpath("//span[text()='Get access to your Orders, Wishlist and Recommendations']/following::input")).sendKeys("deshancse@gmail.com");
			  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
			  driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd')]//span[1]")).click();
		  }
}
