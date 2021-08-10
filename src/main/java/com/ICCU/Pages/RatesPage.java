package com.ICCU.Pages;

import org.openqa.selenium.WebDriver;

public class RatesPage {
    static String url = "https://www.iccu.com/rates";
    static String title = "Rates for Deposit, Loan, Business, and CD | Idaho Central Credit Union";

    WebDriver driver;

    public RatesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoTo() {
        driver.get(url);
    }

    public boolean IsAt() {
        return driver.getTitle().equals(title);
    }
}
