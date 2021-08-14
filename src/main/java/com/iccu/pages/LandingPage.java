package com.iccu.pages;

public class LandingPage extends BasePage {
    static String expectedUrl = "https://www.iccu.com";
    static String expectedTitle = "Idaho Central Credit Union | Idaho's Premier Credit Union";

    public LandingPage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
