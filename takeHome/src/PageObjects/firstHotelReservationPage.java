package PageObjects;

import Util.BaseHelper;
import org.openqa.selenium.*;

public class firstHotelReservationPage extends BaseHelper {

    //CSS Selectors for Web Elements
    public  static final String FIRST_NAME_TEXT_BOX = "#first-name";
    public  static final String LAST_NAME_TEXT_BOX = "#last-name";
    public  static final String EMAIL_TEXT_BOX = "#email";
    public  static final String PHONE_NUMBER_TEXT_BOX = "#phone-number";
    public  static final String NEXT_TO_PAYMENT_BUTTON = "#btn-next-to-payment";

    public  static final String CREDIT_CARD_TEXT_BOX = "#pan";
    public  static final String EXPIRY_DATE_TEXT_BOX = "#expiry-year";
    public  static final String CVV_TEXT_BOX = "#cvv";
    public  static final String NAME_ON_CC_TEXT_BOX = "#billing-name";
    public  static final String BILLING_ADDRESS_TEXT_BOX = "#billing-address";
    public  static final String CITY_TEXT_BOX = "#city";
    public  static final String ZIP_TEXT_BOX = "#zip";
    public  static final String SUBMIT_PAYMENT_BUTTON = "#submit-payment";

    public static void fillAndSubmitGuestDetails(){

        editTextBox(FIRST_NAME_TEXT_BOX, "Darian");
        editTextBox(LAST_NAME_TEXT_BOX, "Lim");
        editTextBox(EMAIL_TEXT_BOX, "test@snaptravel.com");
        editTextBox(PHONE_NUMBER_TEXT_BOX, "4165232315");

        clickOn(NEXT_TO_PAYMENT_BUTTON);
    }

    public static void fillAndSubmitCreditCardDetails(){

        browser.switchTo().frame(browser.findElement(By.id("iframe")));
        editTextBox(CREDIT_CARD_TEXT_BOX, "4111 1111 111 1111");
        browser.switchTo().defaultContent();
        editTextBox(EXPIRY_DATE_TEXT_BOX, "1122");
        editTextBox(NAME_ON_CC_TEXT_BOX, "Darian Lim");
        editTextBox(CVV_TEXT_BOX, "123");
        editTextBox(BILLING_ADDRESS_TEXT_BOX, "3");

        clickOn(NAME_ON_CC_TEXT_BOX);

        editTextBox(CITY_TEXT_BOX, "knoxville");
        editTextBox(ZIP_TEXT_BOX, "37902");

        clickOn(SUBMIT_PAYMENT_BUTTON);
        System.out.println("Successfully Submitted Details for Booking");
    }
}

