package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsAndActions extends Parent {
    public LocatorsAndActions() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id="truste-consent-button")
    private WebElement trust;

    @FindBy(xpath="//li[@class=\"ibm-masthead-item-signin\"]")
    private WebElement loginStep1;

    @FindBy(linkText="Log in")
    private WebElement loginStep2;

    @FindBy(id="username")
    private WebElement username;







    WebElement myElement;
    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "trust" : myElement =trust; break;
            case "loginStep1" : myElement =loginStep1; break;
            case "loginStep2" : myElement =loginStep2; break;
        }

        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value){

        switch (strElement)
        {
            case "username" : myElement =username; break;

        }
        sendKeysFunction(myElement,value);
    }
}
