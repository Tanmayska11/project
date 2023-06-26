package com.test.paytm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengerDetailsPage {
	
	private WebDriver driver;

    public PassengerDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToNewWindow() {
        java.util.Set<String> handles = driver.getWindowHandles();
        java.util.Iterator<String> iterator = handles.iterator();
        iterator.next(); // Skip the first handle (main window)
        String newWindowHandle = iterator.next();
        driver.switchTo().window(newWindowHandle);
    }

    public void clickHereQR() {
        driver.switchTo().frame(0);
        driver.findElement(By.className("info")).click();
        driver.switchTo().defaultContent();
    }
    
    public void enterPassengerDetails(boolean checkboxValue, String firstName, String lastName ) {
    	
    	 driver.findElement(By.xpath("(//div[@class='_2OWI'])[2]")).click(); //checkbox
    	
    	// Select checkbox
    	if (checkboxValue) {
    		driver.findElement(By.xpath("//*[@id=\"traveller-add-form-adult\"]/div[1]/div/div[2]/div/div[1]/div/div[1]")).click();  //MR
    	}
    	
        
        // Enter first name
        driver.findElement(By.xpath("//div[@class='formFieldsContainer']//div[1]//div[1]//input[1]")).sendKeys(firstName);
        
        // Enter last name
        driver.findElement(By.xpath("(//input[@id='text-box'])[2]")).sendKeys(lastName);
        
    }


}
