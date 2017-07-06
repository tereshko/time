package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Tereshko on 7/05/2017.
 */
public abstract class Page {
    protected WebDriver webDriver;

    public Page(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    protected void type (WebElement webElement, String text){
        webElement.clear();
        webElement.sendKeys(text);
    }

//    public abstract void open();

    public boolean isElementPresent(WebElement element){
        try {
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
