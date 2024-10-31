

package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.BasePage;
import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.Pages.LogoutPage;
import com.Try_Cloud_Sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_Step_Definitions extends BasePage {
    LogoutPage logoutPage = new LogoutPage();
    LoginPage loginPage = new LoginPage();

    @When("User clicks logout button")
    public void user_clicks_logout_button() {
        logoutPage.logoutButton.click();
    }
    @Then("User should be logged out and redirected to login page")
    public void user_should_be_logged_out_and_redirected_to_login_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Trycloud QA";

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }

    @And("User cannot return to homepage by clicking step back button after logout")
    public void userCannotReturnToHomepageByClickingStepBackButtonAfterLogout() {

        //loginPage.stepBackButton.click();
        //Driver.navigate().back;

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Trycloud QA";

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }
}