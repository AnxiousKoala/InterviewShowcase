package com.ICCU.Pages;

import com.ICCU.Browser;

public class AboutPage {

    static String url = "https://www.iccu.com/about";
    static String title = "About Us - Idaho Central Credit Union";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
