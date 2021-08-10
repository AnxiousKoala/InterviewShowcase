package com.ICCU;

import com.ICCU.Components.NavBar;
import com.ICCU.Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * TODO: Implement parallel processing here.
 * Currently, these tests are executed in a synchronous fashion.
 * Consider implementing multithreading. (c3p0? Jenkins?)
 */
public class TestHomePage {
    public static WebDriver driver;
    public HomePage homePage;
    public NavBar navBar;

    @Test
    public void canGoToHomePage() {
        // Given the browser is already open

        // I can navigate to ICCU's home page url
        homePage.GoTo();

        // Then the home page will load
        Assertions.assertTrue(homePage.IsAt());
    }

    @BeforeEach
    public void beforeEach() {
        driver.get("https://www.iccu.com");
        homePage = new HomePage(driver);
        navBar = new NavBar(driver);
    }

    @BeforeAll
    public static void BeforeClass() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @AfterAll
    public static void cleanUp() {
        driver.quit();
    }
}
