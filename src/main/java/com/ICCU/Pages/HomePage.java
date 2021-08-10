package com.ICCU.Pages;

import com.ICCU.Browser;

public class HomePage {

    static String url = "https://www.iccu.com";
    static String title = "Idaho Central Credit Union | Idaho's Premier Credit Union";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
