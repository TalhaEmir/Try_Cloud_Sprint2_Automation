package com.Try_Cloud_Sprint2.Pages;

import com.Try_Cloud_Sprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Page{

public Dashboard_Page(){
    PageFactory.initElements(Driver.getDriver(),this);
}

 @FindBy(xpath = "//ul[@id='appmenu']/li")
    public WebElement dashboardLink;








}
