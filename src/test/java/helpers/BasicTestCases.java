package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tereshko on 7/05/2017.
 */
public class BasicTestCases {

    protected static WebDriver driver;

    protected WebDriver getWebDriver(){
        if (driver == null){
            ChromeOptions option = new ChromeOptions();
            option.addArguments("start-maximized");
            driver = new ChromeDriver(option);
            driver.get("https://time.sc/");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver;
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}
