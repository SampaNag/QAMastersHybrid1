package automationPractice.pages;

import automationPractice.Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 19/11/2017.
 */
public class BasePage {
    public static WebDriver driver;
    //Create Constructor
    public BasePage(){
        PageFactory.initElements(driver, this);
    }
    //Getting currentUrl
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    //Getting title
    public String getTitle(){
        return driver.getTitle();
    }
}
