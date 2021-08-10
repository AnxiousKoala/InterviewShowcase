package com.ICCU.Pages;

import com.ICCU.Browser;

public class EducationPage {

    static String url = "https://iccu.everfi-next.net/";
    static String title = "Idaho Central Credit Union | Idaho Central Credit Union";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
