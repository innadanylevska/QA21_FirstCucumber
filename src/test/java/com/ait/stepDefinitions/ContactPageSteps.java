package com.ait.stepDefinitions;

import com.ait.pages.ContactPage;
import com.ait.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ait.pages.BasePage.driver;

public class ContactPageSteps {
    @Given("User is logged")
    public void is_logged(){
        new ContactPage(driver).launchBrowser();
    }
    @When("User open PhoneBook ContactPage")
    public void open_BookPhonePage(){
        new ContactPage(driver).openURL();
    }
    @Then("User verifies Contact component is displayed")
    public void verifies_HomeComponent_is_displayed(){
        new ContactPage(driver).isHomeComponentPresent();
    }
    @And("User quites browser")
    public void quites_browser(){
        new ContactPage(driver).quit();
    }
}
