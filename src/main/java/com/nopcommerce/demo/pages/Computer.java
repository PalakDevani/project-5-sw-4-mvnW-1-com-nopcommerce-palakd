package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class Computer extends Utility {

    By computerMenu = By.xpath("//a[@href='/computers']");

    public void clickOnComputer() {
        clickOnElement(computerMenu);
    }

    By desktopMenu = By.xpath("//h2[@class='title']//a");

    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }

    By selectByValue = By.xpath("//select[@name='products-orderby']");

    public void getSelectByValue(String value) {
        selectByValueFromDropDown(selectByValue, value);
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
        clickOnElement(addToCart);
    }

    By verifyCartMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");

    public String verifyCaryMessage() {
        return getTextFromElement(verifyCartMsg);
    }

    By closeMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    public void closeMessageBar() {
        clickOnElement(addToCart);
    }

    By mouseHover = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHover);
    }
}
