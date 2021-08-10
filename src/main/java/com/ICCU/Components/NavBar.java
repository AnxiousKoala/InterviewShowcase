package com.ICCU.Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import com.ICCU.BrowserHelper;

public class NavBar {

    static String careerID = "menu-item-7833";
    static String contactID = "menu-item-361";
    static String educationID = "menu-item-11140";
    static String espanolID = "menu-item-3202";
    static String joinID = "menu-item-10280";
    static String locationsID = "menu-item-352";
    static String ratesID = "menu-item-1024";

    WebDriver driver;
    BrowserHelper browserHelper;

    public NavBar(WebDriver driver) {
        this.driver = driver;
        browserHelper = new BrowserHelper(driver);

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("topMenu")));

        if (driver.findElements(By.id("topMenu")).size() == 0) {
            throw new IllegalStateException("Navigation bar not found.");
        }
    }

    public void clickCareers() {
        driver.findElement(By.id(careerID)).click();
    }

    public void clickContact() {
        driver.findElement(By.id(contactID)).click();
    }

    public void clickEducation() {
        driver.findElement(By.id(educationID)).click();

        // If clicking the link opened a new tab, switch to it
        if (browserHelper.hasMultipleTabs()) {
            browserHelper.switchTab();
        }
    }

    public void clickEspanol() {
        driver.findElement(By.id(espanolID)).click();
    }

    public void clickJoin() {
        driver.findElement(By.id(joinID)).click();
    }

    public void clickLocations() {
        driver.findElement(By.id(locationsID)).click();
    }

    public void clickRates() {
        driver.findElement(By.id(ratesID)).click();
    }
}
