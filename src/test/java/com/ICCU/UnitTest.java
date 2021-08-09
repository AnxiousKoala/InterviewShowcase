package com.ICCU;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * TODO: Implement parallel processing here.
 * Currently, these tests are executed in a synchronous fashion.
 * Consider implementing multithreading. (c3p0? Jenkins?)
 */
public class UnitTest {

    @Test
    public void canGoToHomePage() {
        Pages.homePage().GoTo();
        Assertions.assertTrue(Pages.homePage().IsAt());
    }

    @Test
    public void canGoToAboutPage() {
        Pages.aboutPage().GoTo();
        Assertions.assertTrue(Pages.aboutPage().IsAt());
    }

    @AfterAll
    public static void cleanUp() {
        Browser.Close();
    }
}
