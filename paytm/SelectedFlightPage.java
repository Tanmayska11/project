package com.test.paytm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectedFlightPage {
	
	private WebDriver driver;
    private JavascriptExecutor js;

    public SelectedFlightPage(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    public String getNumberOfStops() {
        WebElement stop = driver.findElement(By.xpath("(//div[contains(text(),'Non Stop')])[16]"));
        return stop.getText();
    }

    public String getTakeoffTime() {
        WebElement takeoff = driver.findElement(By.xpath("//div[normalize-space()='18:50']"));
        return takeoff.getText();
    }

    public String getReachTime() {
        WebElement reach = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[22]/div[1]/div[5]/div[1]"));
        return reach.getText();
    }

    public void selectFlight() {
        driver.findElement(By.xpath("(//a[contains(text(),'Book')])[20]")).click();
    }

}
