package com.iccu.pages;

public class AuthenticationPage extends BasePage {
    static String expectedUrl = "https://myebranch.iccu.com/Authentication";
    static String expectedTitle = "| Idaho Central Credit Union";

    public AuthenticationPage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
