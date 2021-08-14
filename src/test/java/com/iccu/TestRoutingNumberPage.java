package com.iccu;

import com.iccu.pages.BasePage;
import com.iccu.pages.RoutingNumberPage;
import com.iccu.utils.BrowserHelper;
import org.junit.jupiter.api.*;

public class TestRoutingNumberPage {
    // Pages
    public RoutingNumberPage routingNumberPage;

    // Utilities
    BrowserHelper browserHelper;

    @Test
    public void shouldDisplayCorrectRoutingNumber() {
        // Given I start on the RoutingNumber page

        // The correct routing number should be displayed
        Assertions.assertEquals(BasePage.config.getProperty("RoutingNumber"), routingNumberPage.getRoutingNumber());
    }

    @BeforeEach
    public void beforeEach() {
        routingNumberPage = new RoutingNumberPage();
        browserHelper = new BrowserHelper();
    }

    @BeforeAll
    public static void BeforeClass() {
        // Any initialization that should run before the whole suite
    }

    @AfterAll
    public static void cleanUp() {
        BasePage.driver.quit();
    }
}
