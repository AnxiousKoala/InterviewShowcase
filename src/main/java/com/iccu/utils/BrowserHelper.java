package com.iccu.utils;

import org.openqa.selenium.WebDriver;

public class BrowserHelper {
    WebDriver driver;

    public BrowserHelper(WebDriver driver) {
        this.driver = driver;
    }

    public boolean hasMultipleTabs() {
        return driver.getWindowHandles().size() > 1;
    }

    public void switchTab() {
        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
