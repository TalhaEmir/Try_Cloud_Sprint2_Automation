package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.ContactGroupPage;
import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.utilities.BrowserUtils;
import com.Try_Cloud_Sprint2.utilities.ConfigurationReader;
import com.Try_Cloud_Sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ContactGroup_stepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(ContactGroup_stepDefinitions.class);
    LoginPage loginPage = new LoginPage();
    ContactGroupPage contactGroupPage = new ContactGroupPage();
    String GroupName = "Group 100";

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();
    }
    @Given("the user navigates to the Contacts module")
    public void the_user_navigates_to_the_contacts_module() {
        loginPage.clickMenuByText("Contacts");
    }

    @When("user can clicks on the link New group")
    public void user_can_clicks_on_the_link_new_group() {
        contactGroupPage.addGroup.click();
        contactGroupPage.enterGroupName.click();
    }

    @When("user can enters the group name {string}")
    public void user_can_enters_the_group_name(String expectedGroup) {
        contactGroupPage.enterGroupName.sendKeys(expectedGroup + Keys.ENTER);
    }

    @When("user can click on the link All contacts")
    public void user_can_click_on_the_link_all_contacts() {
        contactGroupPage.allContactsLink.click();

    }

    @When("User can see all the available groups name {string} through the group’s dropdown menu")
    public void user_can_see_all_the_available_groups_name_through_the_group_s_dropdown_menu(String expectedGroup) {
        contactGroupPage.inputGroup.click();
        //contactGroupPage.groupName.getText();
        BrowserUtils.sleep(2);
        String actualGroup = contactGroupPage.groupName.getText();
        String expectGroup = expectedGroup;
        Assert.assertEquals(actualGroup, expectGroup);
        BrowserUtils.sleep(2);
        contactGroupPage.groupName.click();

    }

    @Then("User can add a new property as {string}")
    public void user_can_add_a_new_property_as_anniversary(String property) {
        contactGroupPage.inputProperty.click();

        BrowserUtils.sleep(2);
        contactGroupPage.selectProperty(property);
    }



}
