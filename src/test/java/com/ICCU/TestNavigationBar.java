package com.ICCU;

import com.ICCU.Components.NavBar;
import com.ICCU.Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


/**
 * TODO: Implement parallel processing here.
 * Currently, these tests are executed in a synchronous fashion.
 * Consider implementing multithreading. (c3p0? Jenkins?)
 */
public class TestNavigationBar {
    public static WebDriver driver;
    public HomePage homePage;
    public CareersPage careersPage;
    public ContactPage contactPage;
    public EducationPage educationPage;
    public EspanolPage espanolPage;
    public JoinPage joinPage;
    public LocationsPage locationsPage;
    public RatesPage ratesPage;
    public NavBar navBar;
    public LandingPage landingPage;
    public AuthenticationPage authenticationPage;
    public BrowserHelper browserHelper;

    @Test
    public void canNavigateToCareersPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Careers on the navigation bar
        navBar.clickCareers();

        // Then I will be at the careers page
        Assertions.assertTrue(careersPage.IsAt());
    }

    @Test
    public void canNavigateToContactPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Contact on the navigation bar
        navBar.clickContact();

        // Then I will be at the contact page
        Assertions.assertTrue(contactPage.IsAt());
    }

    @Test
    public void canNavigateToEducationPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Education on the navigation bar
        navBar.clickEducation();

        //Wait for the new tab to finish loading content
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleIs(educationPage.getExpectedTitle()));

        // Then I will be at the education page
        Assertions.assertTrue(educationPage.IsAt());
    }

    @Test
    public void canNavigateToEspanolPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Espanol on the navigation bar
        navBar.clickEspanol();

        // Then I will be at the espanol page
        Assertions.assertTrue(espanolPage.IsAt());
    }

    @Test
    public void canNavigateToJoinPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Join on the navigation bar
        navBar.clickJoin();

        // Then I will be at the join page
        Assertions.assertTrue(joinPage.IsAt());
    }

    @Test
    public void canNavigateToLocationsPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Locations on the navigation bar
        navBar.clickLocations();

        // Then I will be at the locations page
        Assertions.assertTrue(locationsPage.IsAt());
    }

    @Test
    public void canNavigateToRatesPageFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can click Rates on the navigation bar
        navBar.clickRates();

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
        navBar.loginValidUser("admin", "123456789");

        // Then I will be at the logged in landing page
        Assertions.assertTrue(landingPage.IsAt());
    }

    @Test
    public void shouldRedirectToAuthenticationPageAfterInvalidLoginFromNavBar() {
        // Given I am at the home page
        homePage.GoTo();

        // I can input a username, password, and click the login button on the Navigation Bar
        navBar.loginInvalidUser("WrongUsername", "WrongPassword");

        // Then I will be at the logged in landing page
        Assertions.assertTrue(authenticationPage.IsAt());
    }

    @BeforeEach
    public void beforeEach() {
        // Reset to the homepage for each test
        driver.get("https://www.iccu.com");

        // Initialize Required Pages
        homePage = new HomePage(driver);
        careersPage = new CareersPage(driver);
        contactPage = new ContactPage(driver);
        educationPage = new EducationPage(driver);
        espanolPage = new EspanolPage(driver);
        joinPage = new JoinPage(driver);
        locationsPage = new LocationsPage(driver);
        ratesPage = new RatesPage(driver);
        landingPage = new LandingPage(driver);
        authenticationPage = new AuthenticationPage(driver);

        // Initialize Required Components
        navBar = new NavBar(driver);

        // Initialize any helpers
        browserHelper = new BrowserHelper(driver);
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
