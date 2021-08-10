package com.ICCU.Pages;

import com.ICCU.Browser;

public class LocationsPage {

    static String url = "https://www.iccu.com/branches-atms";
    static String title = "Branch & ATM Locator | Idaho Central Credit Union | ICCU";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
