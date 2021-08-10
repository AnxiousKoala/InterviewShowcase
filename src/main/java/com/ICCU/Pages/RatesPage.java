package com.ICCU.Pages;

import com.ICCU.Browser;

public class RatesPage {

    static String url = "https://www.iccu.com/rates";
    static String title = "Rates for Deposit, Loan, Business, and CD | Idaho Central Credit Union";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
