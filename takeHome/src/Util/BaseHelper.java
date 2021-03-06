package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.lang.*;
import java.util.concurrent.TimeUnit;

public class BaseHelper {
    static protected WebDriver browser;

    @BeforeClass
    protected static void setupBrowser(){
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
        browser = new FirefoxDriver();

        //accounts for pages loading
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    protected static void tearDown(){
        //browser.close();
        browser.quit();
    }

    protected static void clickOn(String cssSelector){
        browser.findElement(By.cssSelector(cssSelector)).click();
    }

    protected static void goToWebPage(String url){
        browser.get(url);
    }

    protected static void scrollToElement(String elementSelector) throws Exception {
        WebElement element = browser.findElement(By.cssSelector(elementSelector));
        ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }

    protected static void editTextBox(String textBoxSelector, String text)
    {
        browser.findElement(By.cssSelector(textBoxSelector)).clear();
        browser.findElement(By.cssSelector(textBoxSelector)).sendKeys(text);
    }
}
