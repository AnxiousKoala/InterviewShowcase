package com.ICCU;

public class EspanolPage {

    static String url = "https://www.iccu.com/espanol/";
    static String title = "Home - ICCU - Idaho Central Credit Union";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
