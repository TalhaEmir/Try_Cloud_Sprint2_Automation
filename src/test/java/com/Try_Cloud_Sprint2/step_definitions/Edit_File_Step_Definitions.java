package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.FilePage;
import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.utilities.BrowserUtils;
import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
import com.Try_Cloud_Sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Edit_File_Step_Definitions {

    LoginPage loginPage= new LoginPage();
    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();

    }

    @And("the user navigates to the Files module")
    public void theUserNavigatesToTheFilesModule() {
        loginPage.clickMenuByText("Files");
    }
    FilePage filePage= new FilePage();


    @When("the user clicks on the option button")
    public void theUserClicksOnTheOptionButton() {
        loginPage.clickMenuByText("Files");
    }


    @And("the user uploads a <{string}>")
    public void theUserUploadsA(String fileName) {
        BrowserUtils.sleep(5);
        filePage.uploadFileButton.sendKeys(System.getProperty("user.dir") + "src/test/resources/UploadedFiles/"+fileName);
        BrowserUtils.sleep(2);
    }


    @Then("the file <{string}> should be visible in the files list")
    public void theFileShouldBeVisibleInTheFilesList(String fileName) {
        BrowserUtils.sleep(5);
        filePage.checkIfFileNameIsDisplayed(fileName);


    }


    @And("the user clicks on the New folder button")
    public void theUserClicksOnTheNewFolderButton() {
        filePage.newFolderButton.click();

    }


    @And("the user enters the folder name as <{string}>")
    public void theUserEntersTheFolderNameAs(String fileName) {
        BrowserUtils.sleep(5);
        filePage.sendTextPart.sendKeys(fileName);
        BrowserUtils.sleep(2);
    }

    @Then("a folder named <{string}> should be visible in the files list")
    public void aFolderNamedShouldBeVisibleInTheFilesList(String arg0) {
        BrowserUtils.sleep(5);
        filePage.checkIfFileNameIsDisplayed(arg0);
    }
}
