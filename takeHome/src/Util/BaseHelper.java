package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.lang.*;

public class BaseHelper {
    static protected WebDriver browser;

    @BeforeClass
    public static void setupBrowser(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        browser = new ChromeDriver();
    }

    @AfterClass(alwaysRun = true)
    public static void tearDown(){
        browser.close();
    }
}
