package com.iccu.utils;

import com.iccu.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserHelper {

    public BrowserHelper() {

    }

    public boolean hasMultipleTabs() {
        return BasePage.driver.getWindowHandles().size() > 1;
    }

    public void switchTab() {
        //Store the ID of the original window
        String originalWindow = BasePage.driver.getWindowHandle();

        //Loop through until we find a new window handle
        for (String windowHandle : BasePage.driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                BasePage.driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void waitUntilElementIsVisible(String element, int duration) {
        new WebDriverWait(BasePage.driver, Duration.ofSeconds(duration)).until(ExpectedConditions.visibilityOfElementLocated(By.id(BasePage.selectors.getProperty(element))));
    }

    public void waitUntilPageTitleIs(String pageTitle, int duration) {
        new WebDriverWait(BasePage.driver, Duration.ofSeconds(duration)).until(ExpectedConditions.titleIs(pageTitle));
    }
}
