package Tests;

import PageObjects.initialPage;
import org.testng.annotations.Test;

public class SearchTest extends initialPage {
    @Test
    public void searchTest(){
        browser.get(baseUrl);
    }
}