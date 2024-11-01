package com.Try_Cloud_Sprint2.Pages;

import com.Try_Cloud_Sprint2.utilities.BrowserUtils;
import com.Try_Cloud_Sprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickMenuByText(String text) {
        String locator = "(//a[contains(.,'" + text + "')])[1]";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }


}
