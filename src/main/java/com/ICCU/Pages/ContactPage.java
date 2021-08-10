package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class ContactPage {
    static String expectedUrl = "https://www.iccu.com/contact-us";
    static String expectedTitle = "Contact Us Today - Idaho Central Credit Union";

    WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
