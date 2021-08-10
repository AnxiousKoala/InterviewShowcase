package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class JoinPage {
    static String expectedUrl = "https://www.iccu.com/become-a-member";
    static String expectedTitle = "Become a Member - ICCU - Idaho Central Credit Union";

    WebDriver driver;

    public JoinPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
