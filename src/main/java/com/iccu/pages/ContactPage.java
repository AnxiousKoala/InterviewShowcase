package com.iccu.pages;

public class ContactPage extends BasePage {
    static String expectedUrl = "https://www.iccu.com/contact-us";
    static String expectedTitle = "Contact Us Today - Idaho Central Credit Union";

    public ContactPage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
