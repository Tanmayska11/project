package com.test.paytm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPage {
	
	private WebDriver driver;

    public FlightPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDate(String date) {
        driver.findElement(By.xpath("(//div[@class='fl-input-container _1SYQ'])[1]")).click();
        WebElement dateElement = driver.findElement(By.xpath("(//div[@class='_2JMZ'][normalize-space()='" + date + "'])[2]"));
        dateElement.click();
    }

    public void searchFlights() {
        driver.findElement(By.className("button")).click();
    }

}
