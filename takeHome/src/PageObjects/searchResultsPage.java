package PageObjects;

import Util.BaseHelper;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class searchResultsPage extends BaseHelper {

    //CSS Selectors for Web Elements
    protected static String SEARCH_BUTTON = "#root > div:nth-child(1) > div > div:nth-child(2) > div.src-omnisearch-OmnisearchContainer-___OmnisearchContainer__root-container___22jXm > div.ui.grid.container.desktop > div.sixteen.wide.column.search-container__action";
    protected static String FIRST_HOTEL_BOX = "#root > div.src-components-hotels_components-styles-___hotels_screen_desktop_styles__hotels-screen-container___tuG3z > div.st-row.src-components-hotels_components-styles-___hotels_screen_desktop_styles__container___2Z89o > div.st-col-11 > div > div:nth-child(1) > div > div.src-components-hotels_components-styles-___hotels_list_item_desktop_component_styles__hotel-info-wrapper___tEmZK > span";
    protected static String SEARCH_TEXT_BOX = "#root > div:nth-child(1) > div > div:nth-child(2) > div.src-omnisearch-OmnisearchContainer-___OmnisearchContainer__root-container___22jXm > div.ui.grid.container.desktop > div.row.omnisearchfield__container > div > div > input";

    public static void editSearchCriteria(String searchCriteria)
    {
        browser.findElement(By.cssSelector(SEARCH_TEXT_BOX)).clear();
        browser.findElement(By.cssSelector(SEARCH_TEXT_BOX)).sendKeys(searchCriteria);
    }

    public static void runSearch() {
        clickOn(SEARCH_BUTTON);
    }

    public static void goToHotelDetailsPage() {
        clickOn(FIRST_HOTEL_BOX);

        //switches to new tab
        ArrayList<String> tabs = new ArrayList<String> (browser.getWindowHandles());
        browser.switchTo().window(tabs.get(1));
    }
}

