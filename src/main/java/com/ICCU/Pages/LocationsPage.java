package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class LocationsPage {
    static String url = "https://www.iccu.com/branches-atms";
    static String title = "Branch & ATM Locator | Idaho Central Credit Union | ICCU";

    WebDriver driver;

    public LocationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(url);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(title);
    }
}
