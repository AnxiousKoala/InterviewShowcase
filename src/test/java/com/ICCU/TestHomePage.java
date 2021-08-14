package com.ICCU;

import com.ICCU.Pages.BasePage;
import com.ICCU.Pages.HomePage;
import org.junit.jupiter.api.*;


public class TestHomePage {
    public HomePage homePage;

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
