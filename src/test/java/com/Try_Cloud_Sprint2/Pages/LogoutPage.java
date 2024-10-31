
package com.Try_Cloud_Sprint2.Pages;

import com.Try_Cloud_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "logout")
    public WebElement logoutButton;

    //@FindBy()             //I dont know how to locate the web element for step back button
    // or if we just verify it by comparing page title names
    //public WebElement step_back_button;

    public void logout(){
        this.logoutButton.click();
    }

}
