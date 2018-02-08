package automationPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 19/11/2017.
 */
public class HomePage extends BasePage {
    @FindBy(css = ".login")
    WebElement singInLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void selectSignIn() {
        singInLink.click();
    }
}
