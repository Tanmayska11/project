package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCases extends AppTest {
	
	@Test
	public void testCases() throws InterruptedException {
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//label[@for='oneWay']")).click(); // oneway trip
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//label[@for='roundTrip']")).click(); // round trip
		
		
		driver.findElement(By.xpath("(//input[@id='text-box'])[1]")).click(); // 	
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Delhi,']")).click(); // from
		
		driver.findElement(By.xpath("(//input[@id='text-box'])[2]")).click(); // 
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Hyderabad,']")).click(); // to
		
		driver.findElement(By.xpath("//input[@name='Departure-Date']")).click(); // 
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(text(),'21')])[2]")).click(); // select departure date
		
		//driver.findElement(By.xpath("(//input[@name='Return-Date']")).click();// 
		//driver.findElement(By.xpath("((//div[contains(text(),'21')])[1]")).click(); // select return date
		
		driver.findElement(By.xpath("(//input[@id='text-box'])[3]")).click(); // select travelers and class
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='economy']")).click(); // select economy
		
		driver.findElement(By.cssSelector("button[tabindex='0']")).click(); // click search btn
		
		Thread.sleep(5000);
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Book')])[15]")).click(); // select flight
		System.out.println("login is required...........");
		driver.close();
		
	}

}
