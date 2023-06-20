package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AppTest 
{
	public WebDriver driver;
   
    @Test
    public void Basetest() throws InterruptedException
    {
    	ChromeOptions options = new ChromeOptions();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver114\\chromedriver.exe");
    	 driver= new ChromeDriver(options);
    	
    	driver.get("https://tickets.paytm.com/flights/");
    	Thread.sleep(10000);
    	driver.manage().window().maximize();
    }
}
