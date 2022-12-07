package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        try {
            for (WebElement options : menuList) {
                if (options.getText().equals(menu)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        }
    }

    By verifyComputer = By.xpath("//a[@href='/computers']");

    public String getVerifyComputer() {
        return getTextFromElement(verifyComputer);
    }

    By verifyElectronics = By.xpath("//a[@href='/electronics']");

    public String getVerifyElectronics() {
        return getTextFromElement(verifyElectronics);
    }

    By verifyApparel = By.xpath("//a[@href='/apparel']");
    //By verifyApparel = By.linkText("Apparel ");

    public String getVerifyApparel() {
        return getTextFromElement(verifyApparel);
    }
}
