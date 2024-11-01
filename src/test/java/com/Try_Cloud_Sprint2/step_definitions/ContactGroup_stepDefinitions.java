package com.Try_Cloud_Sprint2.step_definitions;

import com.Try_Cloud_Sprint2.Pages.ContactGroupPage;
import com.Try_Cloud_Sprint2.Pages.LoginPage;
import com.Try_Cloud_Sprint2.utilities.BrowserUtils;
import com.Try_Cloud_Sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @Given("User can create a new group under Contacts Module")
    public void user_can_create_a_new_group_under_contacts_module() {
        loginPage.clickMenuByText("Contacts");
        contactGroupPage.addGroup.click();
        contactGroupPage.enterGroupName.click();
        contactGroupPage.enterGroupName.sendKeys(GroupName + Keys.ENTER);
    }

    @Given("User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu")
    public void user_can_see_all_the_available_groups_name_through_the_group_s_dropdown_menu_existing_in_the_contact_s_own_info_menu() {
        contactGroupPage.allContactsLink.click();
        contactGroupPage.inputGroup.click();
        //contactGroupPage.groupName.getText();
        String actualGroup = contactGroupPage.groupName.getText();
        String expectGroup = GroupName;
        Assert.assertEquals(actualGroup, expectGroup);
        BrowserUtils.sleep(2);
        contactGroupPage.groupName.click();
    }

    @Then("User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.")
    public void user_can_add_a_new_property_as_anniversary_to_the_contact_s_info_page_from_the_add_new_property_dropdown_menu() {
contactGroupPage.inputProperty.click();
        BrowserUtils.sleep(2);
contactGroupPage.selectProperty("Annive");

    }
}
