package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.Dashboard_Page;
import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.utilities.BrowserUtils;
import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
import com.Try_Cloud_Sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class Dashboard_page_step_def {

    LoginPage loginPage = new LoginPage();
    Dashboard_Page dashboard_page = new Dashboard_Page();

    @Given("user logs in")
    public void userLogsIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(5);
        loginPage.login();

    }


    @Given("User is already logged in and can see all modules and Username")
    public void userIsAlreadyLoggedInAndCanSeeAllModulesAndUsername() {



    }


    @Then("User can click on Customize button and select any of the Widgets.")
    public void user_can_click_on_customize_button_and_select_any_of_the_widgets() {

    }

    @Then("User can click on Set Status button and select any of the Status options.")
    public void user_can_click_on_set_status_button_and_select_any_of_the_status_options() {

    }
}
