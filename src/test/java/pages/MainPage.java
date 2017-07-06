package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Tereshko on 7/05/2017.
 */

public class MainPage extends Page{

    @FindBy(css = "div.profile-block__enter")
    public WebElement signIn;

    @FindBy(css = "div.profile-block__avatar-wrap")
    public WebElement profileAvatar;

    @FindBy(css = "div.profile-block__name")
    public WebElement loginName;

    @FindBy (xpath = "//button[@type='submit']")
     public WebElement loginButton;


    public MainPage (WebDriver webDriver) {
        super(webDriver);
    }

    public void clickSignIn() {
        signIn.click();
    }

    public void clickProfileAvatar(){
        profileAvatar.click();
    }

    public String returnLoginName(){
        return loginName.getText();
    }


}