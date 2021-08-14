package com.iccu.components;

import com.iccu.pages.AuthenticationPage;
import com.iccu.pages.BasePage;
import com.iccu.pages.LandingPage;


public class NavBar extends BasePage {

    public NavBar() {
        // Wait for NavBar to load
        browserHelper.waitUntilElementIsVisible("NavBar_ID",10);

        // Verify NavBar exists
        if (findElements("NavBar_ID").size() == 0) {
            throw new IllegalStateException("Navigation bar not found.");
        }
    }

    public LandingPage loginValidUser() {
        enterText("NavBar_Username_ID", config.getProperty("ValidUsername"));
        enterText("NavBar_Password_ID", config.getProperty("ValidPassword"));
        clickElement("NavBar_LoginBtn_ID");
        return new LandingPage();
    }

    public AuthenticationPage loginInvalidUser() {
        enterText("NavBar_Username_ID", config.getProperty("InvalidUsername"));
        enterText("NavBar_Password_ID", config.getProperty("InvalidPassword"));
        clickElement("NavBar_LoginBtn_ID");
        return new AuthenticationPage();
    }
}
