package PageObjects;

import Util.BaseHelper;

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
    public  static final String NAME_ON_CC_TEXT_BOX = "##billing-name";
    public  static final String BILLING_ADDRESS_TEXT_BOX = "#billing-address";
    public  static final String SUBMIT_PAYMENT_BUTTON = "#submit-payment";

    public static void fillAndSubmitGuestDetails(){

        editTextBox();
        editTextBox();
        editTextBox();
        editTextBox();

        clickOn(NEXT_TO_PAYMENT_BUTTON);
    }

    public static void fillAndSubmitCreditCardDetails() throws Exception{
        scrollToElement(CREDIT_CARD_TEXT_BOX);

        editTextBox();
        editTextBox();
        editTextBox();
        editTextBox();
        editTextBox();

        //Send Keystrokes for down and enter to complete autofill of address related details

        clickOn(SUBMIT_PAYMENT_BUTTON);
    }
}

