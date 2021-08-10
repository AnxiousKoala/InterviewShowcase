package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class CareersPage {
    static String url = "https://www.iccu.com/careers";
    static String title = "Careers - ICCU - Idaho Central Credit Union";

    WebDriver driver;

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(url);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(title);
    }
}
