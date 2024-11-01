package com.Try_Cloud_Sprint2.Pages;

import com.Try_Cloud_Sprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactGroupPage {
    public ContactGroupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'New group')]")
    public WebElement addGroup;

    @FindBy(xpath = "//form[@class='action-input__form']//input[@type='text']")
    public WebElement enterGroupName;

    @FindBy(xpath = "//span[contains(.,'All cont')]")
    public WebElement allContactsLink;

@FindBy(xpath = "//input[@placeholder='Add contact in group']")
   public WebElement inputGroup;
@FindBy(xpath = "//div[@class='name-parts']/span[.='Group 100']")
    public WebElement groupName;


@FindBy(xpath = "//input[@placeholder='Choose property type']")
public WebElement inputProperty;

public void selectProperty(String propertyType){
    List<WebElement> options = Driver.getDriver().findElements(By.xpath("//li[@class='multiselect__element']"));
    for(WebElement option : options){
        System.out.println(option.getText());

        if(option.getText().contains(propertyType)){
            option.click();
            break;
        }
    }
}

    }

