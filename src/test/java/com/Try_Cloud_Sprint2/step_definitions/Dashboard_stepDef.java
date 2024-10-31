package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.Pages.Dashboard_Page;
import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
import com.Try_Cloud_Sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;



public class Dashboard_stepDef {
    LoginPage loginPage = new LoginPage();
    Dashboard_Page dashboardPage = new Dashboard_Page();



    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();




    }

    @Given("user can see all modules")
    public void userCanSeeAllModules() {
        List<WebElement> modules = new ArrayList<>();
        for (WebElement module : modules) {
            Assert.assertTrue(module.isDisplayed());
        }


    }


    @And("user can see username")
    public void userCanSeeUsername() {
    }



    @Then("User can click on Customize button and select any of the Widgets.")
    public void user_can_click_on_customize_button_and_select_any_of_the_widgets() {

    }

    @Then("User can click on Set Status button and select any of the Status options.")
    public void user_can_click_on_set_status_button_and_select_any_of_the_status_options() {

    }

}



