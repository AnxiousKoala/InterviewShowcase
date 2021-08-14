package com.ICCU.Pages;

public class JoinPage extends BasePage {
    static String expectedUrl = "https://www.iccu.com/become-a-member";
    static String expectedTitle = "Become a Member - ICCU - Idaho Central Credit Union";

    public JoinPage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
