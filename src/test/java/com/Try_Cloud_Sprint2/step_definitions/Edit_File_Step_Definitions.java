package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.FilePage;
import com.Try_Cloud_Sprint2.Pages.LoginPage;
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


    @When("the user uploads a file from the configuration file")
    public void theUserUploadsAFileFromTheConfigurationFile() {
        filePage.optionButton.click();

        filePage.uploadButton.sendKeys("filePath");

    }

    @Then("the file  should be visible in the files list")
    public void theFileShouldBeVisibleInTheFilesList() {
    }
}
