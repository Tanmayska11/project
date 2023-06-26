package com.test.paytm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	 private WebDriver driver;
	    private JavascriptExecutor js;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        js = (JavascriptExecutor) driver;
	    }

	    public void open() {
	        driver.manage().window().maximize();
	        driver.get("https://paytm.com");
	    }

	    public void scrollDown() {
	        js.executeScript("window.scroll(0,1000)");
	    }

	    public void clickFlightIcon() {
	        WebElement flight = driver.findElement(By.xpath("//*[@id=\"app\"]/section[4]/div/div/div/div[2]"));
	        flight.click();
	    }

	    public void clickDepartureLocation(String location) {
	        WebElement from = driver.findElement(By.id("text-box"));
	        from.click();
	        WebElement fromOption = driver.findElement(By.xpath("//span[normalize-space()='" + location + ",']"));
	        fromOption.click();
	    }

	    public void clickDestinationLocation(String location) {
	        WebElement to = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[4]/div[1]/div[1]/input"));
	        to.click();
	        WebElement toOption = driver.findElement(By.xpath("//span[normalize-space()='" + location + ",']"));
	        toOption.click();
	    }


}
