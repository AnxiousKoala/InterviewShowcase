package com.ICCU.Components;

import com.ICCU.Pages.AuthenticationPage;
import com.ICCU.Pages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import com.ICCU.utils.BrowserHelper;

public class NavBar {

    WebDriver driver;
    BrowserHelper browserHelper;

    String careerID = "menu-item-7833";
    String contactID = "menu-item-361";
    String educationID = "menu-item-11140";
    String espanolID = "menu-item-3202";
    String joinID = "menu-item-10280";
    String locationsID = "menu-item-352";
    String ratesID = "menu-item-1024";

    By usernameBy = By.id("ebranch-login-username");
    By passwordBy = By.id("ebranch-login-password");
    By loginBy = By.id("ebranch-login-btn");

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

    public LandingPage loginValidUser(String userName, String password) {
        driver.findElement(usernameBy).sendKeys(userName);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(loginBy).click();
        return new LandingPage();
    }

    public AuthenticationPage loginInvalidUser(String userName, String password) {
        driver.findElement(usernameBy).sendKeys(userName);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(loginBy).click();
        return new AuthenticationPage();
    }
}
