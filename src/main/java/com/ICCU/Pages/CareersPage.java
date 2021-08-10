package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class CareersPage {
    static String expectedUrl = "https://www.iccu.com/careers";
    static String expectedTitle = "Careers - ICCU - Idaho Central Credit Union";

    WebDriver driver;

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
