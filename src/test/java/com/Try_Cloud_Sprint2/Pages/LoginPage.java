package com.Try_Cloud_Sprint2.Pages;
import com.Try_Cloud_Sprint2.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //test
    //test1
    //test2

    //test 3
    //test 4

    //test5
    //test6

    @FindBy(id="user")
    public WebElement userName;


    @FindBy(id="password")
    public WebElement password;

    @FindBy(name = "submit-form")
    public WebElement loginButton;


    public void login() {
        userName.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
        // verification that we logged
    }
}
