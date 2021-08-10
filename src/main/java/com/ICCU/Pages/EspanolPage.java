package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class EspanolPage {
    static String expectedUrl = "https://www.iccu.com/espanol/";
    static String expectedTitle = "Home - ICCU - Idaho Central Credit Union";

    WebDriver driver;

    public EspanolPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
