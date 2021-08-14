package com.iccu.pages;

public class RatesPage extends BasePage {
    static String expectedUrl = "https://www.iccu.com/rates";
    static String expectedTitle = "Rates for Deposit, Loan, Business, and CD | Idaho Central Credit Union";

    public RatesPage() {
    }

    public void GoTo() {
        driver.get(expectedUrl);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(expectedTitle);
    }
}
