package com.ICCU;

public class CareersPage {

    static String url = "https://www.iccu.com/careers";
    static String title = "Careers - ICCU - Idaho Central Credit Union";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
