package com.iccu.pages;

public class HomePage extends BasePage {
    static String expectedUrl = "https://www.iccu.com";
    static String expectedTitle = "Idaho Central Credit Union | Idaho's Premier Credit Union";

    public HomePage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
