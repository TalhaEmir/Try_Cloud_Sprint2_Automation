package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
import com.Try_Cloud_Sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Edit_File_Step_Definitions {

    LoginPage loginPage= new LoginPage();
    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();

    }

    @And("the user navigates to the Files module")
    public void theUserNavigatesToTheFilesModule() {
    }
}
