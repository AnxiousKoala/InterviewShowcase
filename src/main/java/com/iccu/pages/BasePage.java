package com.iccu.pages;

import com.iccu.components.NavBar;
import com.iccu.utils.BrowserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BasePage {

    public static WebDriver driver;
    public static BrowserHelper browserHelper;
    public static NavBar navBar;

    public static Properties config = new Properties();
    public static Properties selectors = new Properties();

    public static FileInputStream fis;

    public BasePage() {
        if (driver == null) {

            try {
                // Take reference to the file
                fis = new FileInputStream(System.getProperty("user.dir")
                        + "\\src\\main\\java\\com\\iccu\\properties\\config.properties");
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                // Load the config.properties file
                config.load(fis);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // Take reference to the selectors.properties file
            try {
                fis = new FileInputStream(System.getProperty("user.dir")
                        + "\\src\\main\\java\\com\\iccu\\properties\\selectors.properties");
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // Load the selectors.properties file
            try {
                selectors.load(fis);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // Verify if the browser is chrome or FF
            if (config.getProperty("Browser").equals("chrome")) {
                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (config.getProperty("Browser").equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }

            driver.get(config.getProperty("HomePage_URL"));
            driver.manage().window().maximize();
            browserHelper = new BrowserHelper();
            navBar = new NavBar();
        }
    }

    public void clickElement(String element) {
        if (element.contains("_XP")) {
            driver.findElement(By.xpath(selectors.getProperty(element))).click();
        } else if (element.contains("_ID")) {
            driver.findElement(By.id(selectors.getProperty(element))).click();
        } else if (element.contains("_NAME")) {
            driver.findElement(By.name(selectors.getProperty(element))).click();
        } else if (element.contains("_CLASS")) {
            driver.findElement(By.className(selectors.getProperty(element))).click();
        }
    }

    public void enterText(String element, String value) {
        if (element.contains("_XP")) {
            driver.findElement(By.xpath(selectors.getProperty(element))).sendKeys(value);
        } else if (element.contains("_ID")) {
            driver.findElement(By.id(selectors.getProperty(element))).sendKeys(value);
        } else if (element.contains("_NAME")) {
            driver.findElement(By.name(selectors.getProperty(element))).sendKeys(value);
        } else if (element.contains("_CLASS")) {
            driver.findElement(By.className(selectors.getProperty(element))).sendKeys(value);
        }
    }

    public List<WebElement> findElements(String element) {
        if (element.contains("_XP")) {
            return driver.findElements(By.xpath(selectors.getProperty(element)));
        } else if (element.contains("_ID")) {
            return driver.findElements(By.id(selectors.getProperty(element)));
        } else if (element.contains("_NAME")) {
            return driver.findElements(By.name(selectors.getProperty(element)));
        } else if (element.contains("_CLASS")) {
            return driver.findElements(By.className(selectors.getProperty(element)));
        }
        return new ArrayList<>();
    }

    public void GoTo(String url) {
        driver.get(config.getProperty(url));
    }

    public boolean IsAt(String title) {
        return driver.getTitle().equals(config.getProperty(title));
    }
}
