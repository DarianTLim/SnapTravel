package Tests;

import PageObjects.firstHotelDetailsPage;
import PageObjects.searchResultsPage;
import PageObjects.firstHotelReservationPage;
import Util.BaseHelper;
import org.testng.annotations.Test;

public class BookingWorkflowTest extends BaseHelper {

    @Test
    public void searchTest() throws Exception {
        final String SEARCH_PAGE_URL = "https://www.snaptravel.com/search?encrypted_user_id=5xqebwRCiWusH08KS2yJKA";

        goToWebPage(SEARCH_PAGE_URL);
        //Added because the SEARCH URL suddenly was searching for Ballagio instead of Paris
        editTextBox(searchResultsPage.SEARCH_TEXT_BOX, "Paris");
        searchResultsPage.runSearch();
        searchResultsPage.goToHotelDetailsPage();
        firstHotelDetailsPage.reserveHotel();
        firstHotelReservationPage.fillAndSubmitGuestDetails();
        firstHotelReservationPage.fillAndSubmitCreditCardDetails();
    }
}