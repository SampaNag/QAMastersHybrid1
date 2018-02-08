package automationPractice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 19/11/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/automationPractice/features/",
        tags = {"@validLogin,@feedbackMessage"},
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"})

public class RunTests {

}
