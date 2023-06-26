package com.test.paytm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
    
	private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver114\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

    @Test
    public void testCase() {
        HomePage homePage = new HomePage(driver);
        FlightPage flightPage = new FlightPage(driver);
        SelectedFlightPage selectedFlightPage = new SelectedFlightPage(driver);
        PassengerDetailsPage passengerDetailsPage = new PassengerDetailsPage(driver);

        homePage.open();
        homePage.scrollDown();
        homePage.clickFlightIcon();
        homePage.clickDepartureLocation("Delhi");
        homePage.clickDestinationLocation("Hyderabad");

        flightPage.selectDate("21");
        flightPage.searchFlights();

        String numberOfStops = selectedFlightPage.getNumberOfStops();
        String takeoffTime = selectedFlightPage.getTakeoffTime();
        String reachTime = selectedFlightPage.getReachTime();

        selectedFlightPage.selectFlight();

        passengerDetailsPage.switchToNewWindow();
        passengerDetailsPage.clickHereQR();
        passengerDetailsPage.enterPassengerDetails(true, "Tanmay", "Khairnar");

        
    }

    
}
