package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computer;
import com.nopcommerce.demo.pages.ComputerPage1;
import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {

    HomePage homePage = new HomePage();
    Computer computer = new Computer();
    ComputerPage1 computerPage1 = new ComputerPage1();
    Electronics electronics = new Electronics();

    @Test
    public void verifyUserShouldNavigateToComputer() {
        homePage.selectMenu("Computers");
        Assert.assertEquals(homePage.getVerifyComputer(), "Computers", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToElectronics() {
        homePage.selectMenu("Electronics");
        Assert.assertEquals(homePage.getVerifyElectronics(), "Electronics", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToApparel() {
        homePage.selectMenu("Apparel");
        Assert.assertEquals(homePage.getVerifyApparel(), "Apparel", "Error Message not displayed");

    }


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        computer.clickOnComputer();
        computer.clickOnDesktop();
        computer.getSelectByValue("6");
        computerPage1.getOriginalProductDispalyList();
        computerPage1.getProductSortByZTOA();
    }

}

