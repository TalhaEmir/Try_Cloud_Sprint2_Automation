package com.Try_Cloud_Sprint2.Pages;

import com.Try_Cloud_Sprint2.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    public void isSelected(String optionName){
        for(WebElement element : options){
            if(element.getText().equalsIgnoreCase(optionName)){
                element.click()  ;
                return;
            }
        }
    }

    @FindBy(xpath="//input[@id='view13-input-folder']")
    public WebElement sendTextPart;


    @FindBy(css=".button.new")
    public WebElement plusButton;

    @FindBy(css = "#file_upload_start")
    public WebElement uploadFileButton;


    @FindBy(xpath = "//span[@class='icon icon-folder svg']")
    public WebElement newFolderButton;




    public void checkIfFileNameIsDisplayed(String name) {
        String dynamicXPath = "//span[@class='nametext']/span[@class='innernametext' and text()='" + name + "']";
        WebElement fileNameElement = Driver.getDriver().findElement(By.xpath(dynamicXPath));

        if (fileNameElement.isDisplayed()) {
            System.out.println(name + " element is displayed on the page.");
        } else {
            System.out.println(name + " element is not displayed on the page.");
        }
    }




    public void isDisplayed(String fileName) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[contains(., '" + fileName + "')]"));
        Assert.assertTrue("Element should be displayed: " + fileName, element.isDisplayed());
    }


    public void isNewFileDisplayed(String fileName) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[contains(., '" + fileName + "')]"));
        Assert.assertTrue("Element should be displayed: " + fileName, element.isDisplayed());
    }



}










