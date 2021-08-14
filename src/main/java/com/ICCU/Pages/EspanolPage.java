package com.ICCU.Pages;

public class EspanolPage extends BasePage {
    static String expectedUrl = "https://www.iccu.com/espanol/";
    static String expectedTitle = "Home - ICCU - Idaho Central Credit Union";

    public EspanolPage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
