package logins;

import helpers.BasicTestCases;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import pages.SignIn;
import utils.ConfigProperties;

import static org.junit.Assert.assertTrue;

/**
 * Created by Tereshko on 7/05/2017.
 */
public class LoginWrongUser extends BasicTestCases {

    private MainPage mainPage = PageFactory.initElements(getWebDriver(), MainPage.class);
    private SignIn signIn = PageFactory.initElements(getWebDriver(), SignIn.class);



    @Test
    public void loginAsBadUser() {
        mainPage.clickSignIn();
        signIn.fillEmail(ConfigProperties.getProperty("bad.pass"));
        signIn.fillPassword(ConfigProperties.getProperty("bad.pass"));
        signIn.clickSignIn();
        assertTrue("Error: error about wrong user doesn't present", signIn.isErrorPresent());
    }

    @After
    public void quit(){
        driver.quit();
    }

}