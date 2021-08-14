package com.iccu;

import com.iccu.pages.*;
import com.iccu.utils.BrowserHelper;
import org.junit.jupiter.api.*;


public class TestNavigationBar {
    // Pages
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

    // Utilities
    BrowserHelper browserHelper;

    @Test
    public void canNavigateToCareersPageFromNavBar() {
        // Given I am at the home page

        // I can click Careers on the navigation bar
        BasePage.navBar.clickElement("NavBar_Careers_ID");

        // Then I will be at the careers page
        Assertions.assertTrue(careersPage.IsAt("CareersPage_Title"));
    }

    @Test
    public void canNavigateToContactPageFromNavBar() {
        // Given I am at the home page

        // I can click Contact on the navigation bar
        BasePage.navBar.clickElement("NavBar_Contact_ID");

        // Then I will be at the contact page
        Assertions.assertTrue(contactPage.IsAt("ContactPage_Title"));
    }

    @Test
    public void canNavigateToEducationPageFromNavBar() {
        // Given I am at the home page

        // I can click Education on the navigation bar
        BasePage.navBar.clickElement("NavBar_Education_ID");

        // If clicking the link opened a new tab, switch to it
        if (browserHelper.hasMultipleTabs()) {
            browserHelper.switchTab();
        }

        // Wait for the new tab to finish loading content
        browserHelper.waitUntilPageTitleIs(BasePage.config.getProperty("EducationPage_Title"),10);

        // Then I will be at the education page
        Assertions.assertTrue(educationPage.IsAt("EducationPage_Title"));
    }

    @Test
    public void canNavigateToEspanolPageFromNavBar() {
        // Given I am at the home page

        // I can click Espanol on the navigation bar
        BasePage.navBar.clickElement("NavBar_Espanol_ID");

        // Then I will be at the Espanol page
        Assertions.assertTrue(espanolPage.IsAt("EspanolPage_Title"));
    }

    @Test
    public void canNavigateToJoinPageFromNavBar() {
        // Given I am at the home page

        // I can click Join on the navigation bar
        BasePage.navBar.clickElement("NavBar_Join_ID");

        // Then I will be at the join page
        Assertions.assertTrue(joinPage.IsAt("JoinPage_Title"));
    }

    @Test
    public void canNavigateToLocationsPageFromNavBar() {
        // Given I am at the home page

        // I can click Locations on the navigation bar
        BasePage.navBar.clickElement("NavBar_Locations_ID");

        // Then I will be at the locations page
        Assertions.assertTrue(locationsPage.IsAt("LocationsPage_Title"));
    }

    @Test
    public void canNavigateToRatesPageFromNavBar() {
        // Given I am at the home page

        // I can click Rates on the navigation bar
        BasePage.navBar.clickElement("NavBar_Rates_ID");

        // Then I will be at the locations page
        Assertions.assertTrue(ratesPage.IsAt("RatesPage_Title"));
    }

    @Test
    public void canLoginAsValidUserFromNavBar() {
        // THIS TEST IS JUST PROOF OF CONCEPT AND WILL ALWAYS FAIL.
        // Obviously...These are not valid credentials

        // Given I am at the home page

        // I can input a username, password, and click the login button on the Navigation Bar
        BasePage.navBar.loginValidUser();

        // Then I will be at the logged in landing page
        Assertions.assertTrue(landingPage.IsAt("LandingPage_Title"));
    }

    @Test
    public void shouldRedirectToAuthenticationPageAfterInvalidLoginFromNavBar() {
        // Given I am at the home page

        // I can input a username, password, and click the login button on the Navigation Bar
        BasePage.navBar.loginInvalidUser();

        // Then I will be at the logged in landing page
        Assertions.assertTrue(authenticationPage.IsAt("AuthenticationPage_Title"));
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

        browserHelper = new BrowserHelper();

        // Start each test from the homepage
        homePage.GoTo("HomePage_URL");
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
