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

	    //Enter Email
	     driver.findElement(By.xpath("//input[@class='fl-input']")).sendKeys("tanmay@gmail.com"); //email input

	  // Select baggage option
	    WebElement baggageDropdown = driver.findElement(By.xpath("(//div[@class='_1rL-'])[1]"));
	    baggageDropdown.click();
	    String baggageOptionLocator = String.format("//div[contains(text(),'%s')]", baggageOption);
	    driver.findElement(By.xpath(baggageOptionLocator)).click();
	    
	    // Select seat option
	   WebElement seatDropdown = driver.findElement(By.xpath("(//span[@class='_22d2 _2Mnp'])[2]"));
	    seatDropdown.click();
	    String seatOptionLocator = String.format("//div[contains(text(),'%s')]", seatOption);
	    driver.findElement(By.xpath(seatOptionLocator)).click();   

	 driver.findElement(By.xpath("(//button[@class='button button--block button--default _1JXX'])[1]")).click(); // click on proceed to play
        
    }


}
