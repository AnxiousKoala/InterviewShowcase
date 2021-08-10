package com.ICCU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    static WebDriver driver = new FirefoxDriver();

    public static void GoTo(String url) {
        driver.get(url);
    }

    public static String Title() {
        return driver.getTitle();
    }

    public static void ClickID(String ID) {
        driver.findElement(By.id(ID)).click();
    }

    public static void Close() {
        driver.close();
    }
}
