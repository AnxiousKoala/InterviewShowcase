package com.iccu.pages;

import com.iccu.components.NavBar;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

    public static WebDriver driver;
    public static NavBar navBar;

    public BasePage() {
        if (driver == null) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://www.iccu.com");
            driver.manage().window().maximize();

            navBar = new NavBar(driver);
        }
    }
}
