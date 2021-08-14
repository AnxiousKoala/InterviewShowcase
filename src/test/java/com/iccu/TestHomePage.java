package com.iccu;

import com.iccu.pages.BasePage;
import com.iccu.pages.HomePage;
import org.junit.jupiter.api.*;


public class TestHomePage {
    public HomePage homePage;

    @Test
    public void canGoToHomePage() {
        // Given the browser is already open

        // I can navigate to ICCU's home page url
        homePage.goTo("HomePage_URL");

        // Then the home page will load
        Assertions.assertTrue(homePage.isAt("HomePage_Title"));
    }

    @BeforeEach
    public void beforeEach() {
        homePage = new HomePage();
    }

    @BeforeAll
    public static void BeforeClass() {
    }

    @AfterAll
    public static void cleanUp() {
        BasePage.driver.quit();
    }
}
