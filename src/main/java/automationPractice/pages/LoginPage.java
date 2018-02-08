package automationPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 19/11/2017.
 */
public class LoginPage extends BasePage {
    @FindBy(css = "input[id='email']")
    WebElement emailField;

    @FindBy(css = "input[id='passwd']")
    WebElement passwordField;

    @FindBy(css = "#SubmitLogin")
    WebElement signInButton;

    @FindBy(css = "form[id='login_form']")
    WebElement loginForm;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isUserOnLoginPage() {

        return loginForm.isDisplayed();
    }

    public void enterCredentials(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);

    }

    public void clickSignIn() {
        //@TODO scroll to the element and click
        signInButton.click();
    }

}
