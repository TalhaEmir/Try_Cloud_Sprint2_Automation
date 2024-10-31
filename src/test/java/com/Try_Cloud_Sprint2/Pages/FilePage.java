package com.Try_Cloud_Sprint2.Pages;

import com.Try_Cloud_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilePage {

    public FilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='button new']")
    public WebElement optionButton;


    @FindBy(xpath="//ul/li//*[@class='menuitem']")
    public List<WebElement> options;


    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement uploadButton;


        }





