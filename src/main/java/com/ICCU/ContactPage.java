package com.ICCU;

public class ContactPage {

    static String url = "https://www.iccu.com/contact-us";
    static String title = "Contact Us Today - Idaho Central Credit Union";

    public void GoTo() {
        Browser.GoTo(url);
    }

    public boolean IsAt() {
        return Browser.Title().equals(title);
    }
}
