package com.tbm.automation;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sample2 extends BaseClass
{
	
	  @Test
	  public void test1() 
	  {
		
		  driver.get("https://www.flipkart.com/");
		  driver.findElement(By.xpath("//span[text()='Allow Location']")).click();
	  }
	  

	  
}
