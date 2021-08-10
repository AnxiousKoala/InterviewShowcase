package com.ICCU;

public class NavBar {

    static String careerID = "menu-item-7833";
    static String contactID = "menu-item-361";
    static String educationID = "menu-item-11140";
    static String espanolID = "menu-item-3202";
    static String joinID = "menu-item-10280";
    static String locationID = "menu-item-352";
    static String ratesID = "menu-item-1024";

    public void clickCareers() {
        Browser.ClickID(careerID);
    }

    public void clickContact() {
        Browser.ClickID(contactID);
    }

    public void clickEducation() {
        Browser.ClickID(educationID);
    }

    public void clickEspanol() {
        Browser.ClickID(espanolID);
    }

    public void clickJoin() {
        Browser.ClickID(joinID);
    }

    public void clickLocation() {
        Browser.ClickID(locationID);
    }

    public void clickRates() {
        Browser.ClickID(ratesID);
    }
}
