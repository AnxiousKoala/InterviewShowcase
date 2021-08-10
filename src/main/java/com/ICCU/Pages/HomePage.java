package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    static String expectedUrl = "https://www.iccu.com";
    static String expectedTitle = "Idaho Central Credit Union | Idaho's Premier Credit Union";

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
