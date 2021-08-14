package com.iccu.pages;

public class LocationsPage extends BasePage {
    static String expectedUrl = "https://www.iccu.com/branches-atms";
    static String expectedTitle = "Branch & ATM Locator | Idaho Central Credit Union | ICCU";

    public LocationsPage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
