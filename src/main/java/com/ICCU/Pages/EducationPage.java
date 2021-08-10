package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class EducationPage {
    static String url = "https://iccu.everfi-next.net/";
    static String expectedTitle = "Idaho Central Credit Union | Idaho Central Credit Union";

    WebDriver driver;

    public EducationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(url);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }

    public String getExpectedTitle() {
        return expectedTitle;
    }
}
