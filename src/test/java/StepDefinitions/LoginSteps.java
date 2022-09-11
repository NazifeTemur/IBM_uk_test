package StepDefinitions;

import Pages.LocatorsAndActions;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSteps {

    LocatorsAndActions la=new LocatorsAndActions();
    @Given("User navigate to website")
    public void userNavigateToWebsite() {
        GWD.getDriver().get("https://www.ibm.com/uk-en");
        GWD.getDriver().manage().window().maximize();
    }

    @When("User click on the login button")
    public void userClickOnTheLoginButton() {

//        WebElement frame= GWD.driver.findElement(By.id("trustarcNoticeFrame"));
//        GWD.driver.switchTo().frame(frame);
        la.findAndClick("trust");
        la.findAndClick("loginStep1");
        la.findAndClick("loginStep2");
        la.findAndSend("username","ibm_test");
    }
}
