package PageObjects;

import Util.BaseHelper;

public class firstHotelDetailsPage extends BaseHelper {

    //CSS Selectors for Web Elements
    protected static final String RESERVE_HOTEL_BUTTON = "#rooms > div:nth-child(2) > div:nth-child(1) > div.src-hotel_cards-SnapTravelRate-___rate-desktop-styles__column-4___DvYnO > div.normalRate.src-hotel_cards-SnapTravelRate-___rate-desktop-styles__row-1___2oe1u > div:nth-child(3) > div";

    public static void reserveHotel() throws Exception{
        scrollToElement(RESERVE_HOTEL_BUTTON);
        clickOn(RESERVE_HOTEL_BUTTON);
    }
}

