package com.ICCU.Pages;

public class CareersPage extends BasePage {
    static String expectedUrl = "https://www.iccu.com/careers";
    static String expectedTitle = "Careers - ICCU - Idaho Central Credit Union";

    public CareersPage() {

    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
