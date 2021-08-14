package com.iccu.pages;

import org.openqa.selenium.TimeoutException;

public class RoutingNumberPage extends BasePage {

    public RoutingNumberPage() {
        driver.get(config.getProperty("RoutingNumberPage_URL"));

        // Wait for RoutingNumberPage to load
        try {
            browserHelper.waitUntilElementIsVisible("RoutingNumberPage_RoutingNumber_CSS",10);
        } catch (TimeoutException ex) {
            //TODO: Handle Exception
        }
    }

    public void goTo(String url) {
        driver.get(config.getProperty(url));
    }

    public String getRoutingNumber() {
        return findElement("RoutingNumberPage_RoutingNumber_CSS").getText();
    }
}
