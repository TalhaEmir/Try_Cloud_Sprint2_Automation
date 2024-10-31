
package com.Try_Cloud_Sprint2.Pages;

import com.Try_Cloud_Sprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[2]/div[4]/div[1]/div[1]/img[1]")
    public WebElement logoutHeader;

    public void logoutHeader(){
        this.logoutHeader.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    public WebElement logoutButton;



    public void logout(){
        this.logoutButton.click();
    }



}
