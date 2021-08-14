package com.ICCU.Pages;

public class EducationPage extends BasePage {
    static String expectedUrl = "https://iccu.everfi-next.net/";
    static String expectedTitle = "Idaho Central Credit Union | Idaho Central Credit Union";

    public EducationPage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }

    public String getExpectedTitle() {
        return expectedTitle;
    }
}
