package com.ICCU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    static WebDriver driver = new FirefoxDriver();

    public static void GoTo(String url) {
        driver.get(url);
    }

    public static String Title() {
        return driver.getTitle();
    }

    public static void Close() {
        driver.close();
    }
}
