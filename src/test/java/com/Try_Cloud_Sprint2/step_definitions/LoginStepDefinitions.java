package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        loginPage.login();
    }


}
