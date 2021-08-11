package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
    static String expectedUrl = "https://myebranch.iccu.com/Authentication";
    static String expectedTitle = "| Idaho Central Credit Union";

    WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
