package logins;

import helpers.BasicTestCases;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import pages.SignIn;
import utils.ConfigProperties;
import static org.junit.Assert.assertEquals;

/**
 * Created by Tereshko on 7/05/2017.
 */
public class LoginByEmailGoodUser extends BasicTestCases {

    private MainPage mainPage = PageFactory.initElements(getWebDriver(), MainPage.class);
    private SignIn signIn = PageFactory.initElements(getWebDriver(), SignIn.class);



    @Test
    public void loginAsBadUser() {
        mainPage.signIn.click();
        signIn.fillEmail(ConfigProperties.getProperty("good.email"));
        signIn.fillPassword(ConfigProperties.getProperty("good.pass"));
        mainPage.loginButton.click();
        mainPage.profileAvatar.click();
        assertEquals("Anton Tereshko", mainPage.returnLoginName());
    }

    @After
    public void quit(){
        driver.quit();
    }

}
