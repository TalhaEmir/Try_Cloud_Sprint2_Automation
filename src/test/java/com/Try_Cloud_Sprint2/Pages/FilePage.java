package com.Try_Cloud_Sprint2.Pages;

import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
import com.Try_Cloud_Sprint2.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class FilePage {

    public FilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement optionButton;


    @FindBy(xpath = "//ul/li//*[@class='menuitem']")
    public List<WebElement> options;

    public void isSelected(String optionName) {
        for (WebElement element : options) {
            if (element.getText().equalsIgnoreCase(optionName)) {
                element.click();
                return;
            }
        }
    }

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement sendTextPart;


    @FindBy(css = ".button.new")
    public WebElement plusButton;

    @FindBy(css = "#file_upload_start")
    public WebElement uploadFileButton;


    @FindBy(xpath = "//span[text()='New folder']")
    public WebElement newFolderButton;


    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement enterButton;


    @FindBy(xpath = "//div[@class='thumbnail']")
    public List<WebElement> casesNames;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> nameSection;


    @FindBy(xpath = "//*[@id='filestable']/tfoot/tr/td[2]/span/span[1]")
    public WebElement totalNumbersOfFile;



    public void showUp(String name){
        for(WebElement element : nameSection){
            if(!element.isDisplayed()){
                System.out.println("file is deleted");

            }
        }
    }


    public void checkIfFileNameIsDisplayed(String name) {
        String dynamicXPath = "//span[@class='nametext']/span[@class='innernametext' and text()='" + name + "']";
        WebElement fileNameElement = Driver.getDriver().findElement(By.xpath(dynamicXPath));

        if (fileNameElement.isDisplayed()) {
            System.out.println(name + " element is displayed on the page.");
        } else {
            System.out.println(name + " element is not displayed on the page.");
        }
    }


    public void isComeUp(String fileName) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[contains(., '" + fileName + "')]"));
        Assert.assertTrue("Element should be displayed: " + fileName, element.isDisplayed());
    }


    public void isNewFileDisplayed(String fileName) {
        String dynamicXPath = "//span[contains(text(), '" + fileName + "')]";
        WebElement element = Driver.getDriver().findElement(By.xpath(dynamicXPath));
        Assert.assertTrue("Element should be displayed: " + fileName, element.isDisplayed());
    }


    public static void clickFile() {
        String dynamicXPath = "//span[contains(text(), '" + ConfigurationReader.getProperty("fileName") + "')]";
        WebElement element = Driver.getDriver().findElement(By.xpath(dynamicXPath));
        element.click();
    }


    public void clickMoreIconForFileName(String name) {
        WebElement fileNameElement = Driver.getDriver().findElement(By.xpath("//span[@class='nametext']/span[@class='innernametext' and text()='" + name + "']"));

        if (fileNameElement.isDisplayed()) {
            WebElement threeDotIcon = Driver.getDriver().findElement(By.xpath("//span[@class='nametext']/span[@class='innernametext' and text()='" + name + "']/ancestor::td//span[@class='icon icon-more']"));

            Assert.assertTrue("More icon should be displayed", threeDotIcon.isDisplayed());
            threeDotIcon.click();
        }
    }


    public void clickDeleteSection(String name) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[@class='nametext']"));
        if (element.isDisplayed()) {
            WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//span[@class='nametext']/span[@class='innernametext']/..//following::div//li//a[@data-action='Delete']"));
            Assert.assertTrue("Delete button should be displayed", deleteButton.isDisplayed());
            deleteButton.click();

        }

////span[@class='nametext']/span[@class='innernametext']
        //span[@class='innernametext']/ancestor::td//span[@class='icon icon-more']
//span[@class='innernametext']/../../div[@class='fileActionsMenu popovermenu bubble open menu'] - //a[@class='name']/following-sibling::div[@class='fileActionsMenu popovermenu bubble open menu']
    }

////tbody//span[@class='icon icon-more']
}










