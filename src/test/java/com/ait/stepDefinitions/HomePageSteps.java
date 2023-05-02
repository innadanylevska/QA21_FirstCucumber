package com.ait.stepDefinitions;

import com.ait.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.no.Gitt;

import static com.ait.pages.BasePage.driver;

public class HomePageSteps {
    @Given("User launches Chrome Browser")
    public void launches_Chrome_Browser(){
        new HomePage(driver).launchBrowser();
    }
    @When("User open PhoneBook HomePage")
    public void open_BookPhonePage(){
        new HomePage(driver).openURL();
    }
    @Then("User verifies Home component is displayed")
    public void verifies_HomeComponent_is_displayed(){
        new HomePage(driver).isHomeComponentPresent();
    }
    @And("User quites browser")
    public void quites_browser(){
        new HomePage(driver).quit();
    }

}
