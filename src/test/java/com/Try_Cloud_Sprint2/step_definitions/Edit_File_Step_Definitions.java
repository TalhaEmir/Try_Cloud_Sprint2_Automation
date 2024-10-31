package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.FilePage;
import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
import com.Try_Cloud_Sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @When("the user selects the {string} option")
    public void the_user_selects_the_option(String string) {
        filePage.optionsFinder(string);

    }
    @When("the user chooses a file named {string} to upload")
    public void the_user_chooses_a_file_named_to_upload(String string) {

    }
    @Then("the file named {string} should be visible in the files list")
    public void the_file_named_should_be_visible_in_the_files_list(String string) {

    }
}
