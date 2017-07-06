package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigProperties;


/**
 * Created by Tereshko on 7/05/2017.
 */

public class SignIn extends Page{

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public  WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement linkSignIn;

    @FindBy(css = "span.message-title")
    public WebElement errorIncorrectUserName;



    public SignIn(WebDriver webDriver) {
        super(webDriver);
    }

    public void open() {
        webDriver.get("https://time.sc/signin");
    }

    public void fillEmail(String propertyEmail){
        type(email,propertyEmail);
    }

    public void fillPassword(String propertyPass){
        type(password, propertyPass);
    }

    public void clickSignIn(){
        linkSignIn.click();
    }

    public boolean isErrorPresent() {
        if (isElementPresent(errorIncorrectUserName)){
            return true;
        }else{
            return false;
        }

    }
}