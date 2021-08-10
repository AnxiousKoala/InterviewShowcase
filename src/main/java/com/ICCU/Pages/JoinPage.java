package com.ICCU.Pages;

import com.ICCU.Browser;

public class JoinPage {

    static String url = "https://www.iccu.com/become-a-member";
    static String title = "Become a Member - ICCU - Idaho Central Credit Union";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
