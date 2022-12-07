package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage1 extends Utility {

    By computerMenu = By.xpath("//a[@href='/computers']");

    public void clickOnComputer() {
        clickOnElement(computerMenu);
    }

    By desktopMenu = By.xpath("//h2[@class='title']//a");

    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }

    By productsListDisplay = By.xpath("//h2/a");
    By selectSortByNameZToA= By.xpath("//select[@id='products-orderby']");

    public String getOriginalProductDispalyList() {
        List<WebElement> products = driver.findElements(productsListDisplay);
        ArrayList<String> originalProductName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductName.add(e.getText());
        }
        System.out.println(originalProductName);
        return getTextFromElement(productsListDisplay);
    }

    public String getProductSortByZTOA() {
        selectByVisibleTextFromDropDown(selectSortByNameZToA, "Name: Z to A");
        List<WebElement> products = driver.findElements(productsListDisplay);
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }

        System.out.println(afterSortByZToAProductsName);

        return getTextFromElement(selectSortByNameZToA);
    }



    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }

    By verifyBuildYourOwn = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public String getVerifyBuildYourOwn() {
        return getTextFromElement(verifyBuildYourOwn);
    }

    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");

    public void selectProcessorByValue(String value) {
        selectByValueFromDropDown(selectProcessor, value);
    }

    By selectRam = By.xpath("//select[@id='product_attribute_2']");

    public void selectRamByValue(String value) {
        selectByValueFromDropDown(selectRam, value);
    }

    By selectHDD = By.xpath("//label[text()='400 GB [+$100.00]']");

    public void clickOnHDD400GB() {
        clickOnElement(selectHDD);
    }

    By selectOS = By.xpath("//label[text()='Vista Premium [+$60.00]']");

    public void clickOnOsVistaPremium() {
        clickOnElement(selectOS);
    }

    By selectSoftware = By.xpath("//input[@id='product_attribute_5_12']");

    public void clickOnSoftwareTotalCommander() {
        clickOnElement(selectOS);
    }

    By verifyTotal = By.xpath("//span[@id='price-value-1']");

    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotal);
    }

    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    By verifyCartMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");

    public String verifyCaryMessage() {
        return getTextFromElement(verifyCartMsg);
    }

    By closeMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    public void closeMessageBar() {
        clickOnElement(closeMsg);
    }

    By mouseHover = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHover);
    }

    //from close button
    By verifyShoppingCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");////a[@class='ico-cart']

    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");

    public void mouseHoverOnElementShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }

    By clickOnGoToCart = By.xpath("//button[@class='button-1 cart-button']");

    public void clickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }

    By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    By clearText = By.xpath("//input[@value='1']");

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(clearText);
        quantity.clear();
    }

    By sendTextToQuantity = By.xpath("//input[@value='1']");

    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }

    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickOnUpdateShoppingCart);
    }

    By verifyTotal1 = By.xpath("//tbody/tr[1]/td[6]/span[1]");

    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        clickOnElement(clickOnCheckbox);
    }

    By clickOnCheckout = By.xpath("//button[@id='checkout']");

    public void clickOnCheckOutButton() {
        clickOnElement(clickOnCheckout);
    }

    By VerifyTextWelcome, PleaseSignIn = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By clickOnCheckoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckoutAsGuest);
    }

    By sendTextToFirstName = By.id("BillingNewAddress_FirstName");

    public void sendTextToFirstNameField(String name) {
        sendTextToElement(sendTextToFirstName, name);
    }

    By sendTextToLastName = By.id("BillingNewAddress_LastName");

    public void sendTextToLastNameField(String lastName) {
        sendTextToElement(sendTextToLastName, lastName);
    }

    By sendTextToEmail = By.id("BillingNewAddress_Email");

    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmail, email);
    }

    By sendTextToCompany = By.id("BillingNewAddress_Company");

    public void sendTextToCompanyField(String company) {
        sendTextToElement(sendTextToCompany, company);
    }

    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }

    // Select country = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
    //        country.selectByVisibleText("United Kingdom

    By sendTextToCity = By.xpath("//input[@id='BillingNewAddress_City']");

    public void sendTextToCityField(String city) {
        sendTextToElement(sendTextToCity, city);
    }

    By sendTextToAddress1 = (By.cssSelector("#BillingNewAddress_Address1"));

    public void sendTextToAddressLine1(String address) {
        sendTextToElement(sendTextToAddress1, address);
    }

    By sendTextToAddress2 = (By.cssSelector("#BillingNewAddress_Address2"));

    public void sendTextToAddressLine2(String address) {
        sendTextToElement(sendTextToAddress2, address);
    }

    By sendTextToPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    public void sendTextToPostcode(String postcode) {
        sendTextToElement(sendTextToPostalCode, postcode);
    }

    By sendTextToPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    public void sendTextToPhoneNumberField(String number) {
        sendTextToElement(sendTextToPhoneNumber, number);
    }

    By clickOnContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }

    By clickOnNextDayAir = By.xpath("//input[@id='shippingoption_1']");

    public void clickOnNextDayAirButton() {
        clickOnElement(clickOnNextDayAir);
    }

    By clickOnContinueTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    public void clickOnContinueButtonAgain() {
        clickOnElement(clickOnContinueTab);
    }

    By clickOnCreditCard = By.xpath("//input[@id='paymentmethod_1']");

    public void clickOnCreditCardButton() {
        clickOnElement(clickOnCreditCard);
    }

    By continueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void selectClickOnContinue1() {
        clickOnElement(continueButton);
    }

    By clickOnMasterCard = By.xpath("//select[@id='CreditCardType']");

    public void selectMasterCardFromCreditCardDropdown(String value) {
        selectByValueFromDropDown(clickOnMasterCard, value);
    }

    By cardholdername = By.id("CardholderName");

    public void sendTextTOCardHolderName(String name) {
        sendTextToElement(cardholdername, name);
    }

    By cardNumber = By.id("CardNumber");

    public void sendTextTOCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }

    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }

    By cardCode = By.id("CardCode");

    public void sendTextToCardCode(String code) {
        sendTextToElement(cardCode, code);
    }

    By continueButton2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }

    By varifText1 = By.xpath("//li[@class='payment-method']/span[2]");

    public String getVerifyText1() {
        return getTextFromElement(varifText1);

    }

    By varifText2 = By.xpath("//li[@class='shipping-method']//span[2]");

    public String getVerifyText2() {
        return getTextFromElement(varifText2);

    }

    By varifText3 = By.xpath("//tr[@class='order-total']/td[2]/span/strong");

    public String getVerifyText3() {
        return getTextFromElement(varifText3);

    }

    By conform = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");

    public void clickOnConformButton() {
        clickOnElement(conform);
    }

    By varifText4 = By.xpath("//div[@class='page-title']/h1");

    public String getVerifyText4() {
        return getTextFromElement(varifText4);

    }

    By varifText5 = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String getVerifyText5() {
        return getTextFromElement(varifText5);

    }

    By continueButton3 = By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button");

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }

    By varifText6 = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String getVerifyText6() {
        return getTextFromElement(varifText6);

    }

}
