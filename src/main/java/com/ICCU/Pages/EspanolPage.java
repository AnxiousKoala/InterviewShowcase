package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class EspanolPage {
    static String url = "https://www.iccu.com/espanol/";
    static String title = "Home - ICCU - Idaho Central Credit Union";

    WebDriver driver;

    public EspanolPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(url);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(title);
    }
}
