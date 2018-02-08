package automationPractice.StepDefinitions;

import automationPractice.Utils.BrowserFactory;
import automationPractice.pages.HomePage;
import automationPractice.pages.LoginPage;
import automationPractice.pages.MyAccountPage;
import automationPractice.pages.RegistrationPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 19/11/2017.
 */
public class LoginSteps {

    @Before
    public void setUp(){
        BrowserFactory.startBrowser();
    }

    @After
    public void cleanUp(){
        BrowserFactory.stopBrowser();
    }

    public LoginPage loginPage;
    public HomePage homePage;
    public RegistrationPage registrationPage;
    public MyAccountPage myAccountPage;

    @Given("^User is on the home page$")
    public void verifyUserIsOnHomePage() {
        homePage = new HomePage();
        Assert.assertTrue(homePage.getTitle().equals("My Store"));
    }

    @When("^User selects SignIn link$")
    public void selctSignInLink() {
        homePage.selectSignIn();
    }

    @Then("^User should be on the login page$")
    public void verifyUserIsOnLoginpage() {
        loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isUserOnLoginPage());
    }

    @When("^User enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterLoginCredentials(String email, String password) {
        loginPage.enterCredentials(email, password);
       }

    @And("^User selects SignIn$")
    public void selectSignIn() {
        loginPage.clickSignIn();
    }

    @Then("^User should be login successfully$")
    public void isUserLoggedIn() {
        myAccountPage = new MyAccountPage();
        Assert.assertTrue(myAccountPage.isUserOnMyAccountPage());
    }



    @And("^User should see his name as \"([^\"]*)\"$")
    public void user_should_see_his_name_as_something(String userName) {
        String accountName = myAccountPage.getAccountName();
        Assert.assertEquals(userName, accountName );
    }

//    @Then("^User should see feedback message as \"([^\"]*)\"$")
//    public void verifyFeedbackMessage(String message) {
//        Assert.assertEquals(message,driver.findElement(By.cssSelector("div.alert.alert-danger ol li")).getText());
//    }
}
