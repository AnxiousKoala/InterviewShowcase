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
        PageHolder.homePage().GoTo();
        Assertions.assertTrue(PageHolder.homePage().IsAt());
    }

    @Test
    public void canGoToAboutPage() {
        PageHolder.aboutPage().GoTo();
        Assertions.assertTrue(PageHolder.aboutPage().IsAt());
    }

    @Test
    public void canNavigateToCareersPageFromNavBar() {
        PageHolder.homePage().GoTo();
        ComponentHolder.navBar().clickCareers();
        Assertions.assertTrue(PageHolder.careersPage().IsAt());
    }

    @Test
    public void canNavigateToContactPageFromNavBar() {
        PageHolder.homePage().GoTo();
        ComponentHolder.navBar().clickContact();
        Assertions.assertTrue(PageHolder.contactPage().IsAt());
    }

    @Test
    public void canNavigateToEducationPageFromNavBar() {
        PageHolder.homePage().GoTo();
        ComponentHolder.navBar().clickEducation();
        Assertions.assertTrue(PageHolder.educationPage().IsAt());
    }

    @Test
    public void canNavigateToEspanolPageFromNavBar() {
        PageHolder.homePage().GoTo();
        ComponentHolder.navBar().clickEspanol();
        Assertions.assertTrue(PageHolder.espanolPage().IsAt());
    }

    @Test
    public void canNavigateToJoinPageFromNavBar() {
        PageHolder.homePage().GoTo();
        ComponentHolder.navBar().clickJoin();
        Assertions.assertTrue(PageHolder.joinPage().IsAt());
    }

    @Test
    public void canNavigateToLocationPageFromNavBar() {
        PageHolder.homePage().GoTo();
        ComponentHolder.navBar().clickLocation();
        Assertions.assertTrue(PageHolder.locationsPage().IsAt());
    }

    @Test
    public void canNavigateToRatesPageFromNavBar() {
        PageHolder.homePage().GoTo();
        ComponentHolder.navBar().clickRates();
        Assertions.assertTrue(PageHolder.ratesPage().IsAt());
    }

    @AfterAll
    public static void cleanUp() {
        Browser.Close();
    }
}
