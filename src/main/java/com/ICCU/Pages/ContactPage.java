package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class ContactPage {
    static String url = "https://www.iccu.com/contact-us";
    static String title = "Contact Us Today - Idaho Central Credit Union";

    WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(url);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(title);
    }
}
