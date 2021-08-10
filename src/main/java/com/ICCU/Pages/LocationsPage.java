package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class LocationsPage {
    static String expectedUrl = "https://www.iccu.com/branches-atms";
    static String expectedTitle = "Branch & ATM Locator | Idaho Central Credit Union | ICCU";

    WebDriver driver;

    public LocationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
