package automationPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 19/11/2017.
 */
public class MyAccountPage extends BasePage{
    @FindBy(css = ".info-account")
    WebElement accountInfo;

    @FindBy(css = ".account")
    WebElement accountName;

    public MyAccountPage() {
        PageFactory.initElements(driver,this);
    }

    public boolean isUserOnMyAccountPage() {
        return accountInfo.isDisplayed();
    }

    public String getAccountName() {
        return accountName.getText();
    }
}
