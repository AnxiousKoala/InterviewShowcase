package com.ICCU;

import com.ICCU.Pages.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestNavigationBar {
    public HomePage homePage;
    public CareersPage careersPage;
    public ContactPage contactPage;
    public EducationPage educationPage;
    public EspanolPage espanolPage;
    public JoinPage joinPage;
    public LocationsPage locationsPage;
    public RatesPage ratesPage;
    public LandingPage landingPage;
    public AuthenticationPage authenticationPage;

    @Test
    public void canNavigateToCareersPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Careers on the navigation bar
        BasePage.navBar.clickCareers();

        // Then I will be at the careers page
        Assertions.assertTrue(careersPage.IsAt());
    }

    @Test
    public void canNavigateToContactPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Contact on the navigation bar
        BasePage.navBar.clickContact();

        // Then I will be at the contact page
        Assertions.assertTrue(contactPage.IsAt());
    }

    @Test
    public void canNavigateToEducationPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Education on the navigation bar
        BasePage.navBar.clickEducation();

        //Wait for the new tab to finish loading content
        new WebDriverWait(BasePage.driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleIs(educationPage.getExpectedTitle()));

        // Then I will be at the education page
        Assertions.assertTrue(educationPage.IsAt());
    }

    @Test
    public void canNavigateToEspanolPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Espanol on the navigation bar
        BasePage.navBar.clickEspanol();

        // Then I will be at the espanol page
        Assertions.assertTrue(espanolPage.IsAt());
    }

    @Test
    public void canNavigateToJoinPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Join on the navigation bar
        BasePage.navBar.clickJoin();

        // Then I will be at the join page
        Assertions.assertTrue(joinPage.IsAt());
    }

    @Test
    public void canNavigateToLocationsPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Locations on the navigation bar
        BasePage.navBar.clickLocations();

        // Then I will be at the locations page
        Assertions.assertTrue(locationsPage.IsAt());
    }

    @Test
    public void canNavigateToRatesPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Rates on the navigation bar
        BasePage.navBar.clickRates();

        // Then I will be at the locations page
        Assertions.assertTrue(ratesPage.IsAt());
    }

    @Test
    public void canLoginAsValidUserFromNavBar() {
        // THIS TEST IS JUST PROOF OF CONCEPT AND WILL ALWAYS FAIL.
        // Obviously...These are not valid credentials

        // Given I am at the home page
        homePage.GoTo();

        // I can input a username, password, and click the login button on the Navigation Bar
        BasePage.navBar.loginValidUser("admin", "123456789");

        // Then I will be at the logged in landing page
        Assertions.assertTrue(landingPage.IsAt());
    }

    @Test
    public void shouldRedirectToAuthenticationPageAfterInvalidLoginFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can input a username, password, and click the login button on the Navigation Bar
        BasePage.navBar.loginInvalidUser("WrongUsername", "WrongPassword");

        // Then I will be at the logged in landing page
        Assertions.assertTrue(authenticationPage.IsAt());
    }

    @BeforeEach
    public void beforeEach() {
        homePage = new HomePage();
        careersPage = new CareersPage();
        contactPage = new ContactPage();
        educationPage = new EducationPage();
        espanolPage = new EspanolPage();
        joinPage = new JoinPage();
        locationsPage = new LocationsPage();
        ratesPage = new RatesPage();
        landingPage = new LandingPage();
        authenticationPage = new AuthenticationPage();
    }

    @BeforeAll
    public static void BeforeClass() {

    }

    @AfterAll
    public static void cleanUp() {
        BasePage.driver.quit();
    }
}
