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

    @Test
    public void canNavigateToCareersPageFromNavBar() {
        Pages.homePage().GoTo();
        Components.navBar().clickCareers();
        Assertions.assertTrue(Pages.careersPage().IsAt());
    }

    @Test
    public void canNavigateToContactPageFromNavBar() {
        Pages.homePage().GoTo();
        Components.navBar().clickContact();
        Assertions.assertTrue(Pages.contactPage().IsAt());
    }

    @Test
    public void canNavigateToEducationPageFromNavBar() {
        Pages.homePage().GoTo();
        Components.navBar().clickEducation();
        Assertions.assertTrue(Pages.educationPage().IsAt());
    }

    @Test
    public void canNavigateToEspanolPageFromNavBar() {
        Pages.homePage().GoTo();
        Components.navBar().clickEspanol();
        Assertions.assertTrue(Pages.espanolPage().IsAt());
    }

    @Test
    public void canNavigateToJoinPageFromNavBar() {
        Pages.homePage().GoTo();
        Components.navBar().clickJoin();
        Assertions.assertTrue(Pages.joinPage().IsAt());
    }

    @Test
    public void canNavigateToLocationPageFromNavBar() {
        Pages.homePage().GoTo();
        Components.navBar().clickLocation();
        Assertions.assertTrue(Pages.locationsPage().IsAt());
    }

    @Test
    public void canNavigateToRatesPageFromNavBar() {
        Pages.homePage().GoTo();
        Components.navBar().clickRates();
        Assertions.assertTrue(Pages.ratesPage().IsAt());
    }

    @AfterAll
    public static void cleanUp() {
        Browser.Close();
    }
}
