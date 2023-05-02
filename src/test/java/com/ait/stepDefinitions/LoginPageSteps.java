package com.ait.stepDefinitions;

import com.ait.pages.HomePage;
import com.ait.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.devtools.v85.log.Log;

import static com.ait.pages.BasePage.driver;

public class LoginPageSteps {
    @And("User clicks on Login link")
    public void click_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters valid data")
    public void enters_valid_data(){
        new LoginPage(driver).enterDate("innassik@gmail.com","1234!NNa");
    }

    @And("User clicks on Loggin Button")
    public void click_on_Loggin_Button(){
        new LoginPage(driver).clickOnLogginButton();
    }
    @Then("User Verifies SignOut buttom is disolayed")
    public void verify_SignOut_buttom_is_disolayed(){
        new LoginPage(driver).isSignOutButtonDisplayed();
    }
    @And("User enters valid a valid email and wrong password")
    public void enters_valid_a_wrong_password(DataTable table){//iz LoginPage i login.features
        new LoginPage(driver).enterWrongPassword(table);
    }

    @Then("User Verifies Alert is appears")
    public void verify_Alert_appears(){
        new LoginPage(driver).pause(2000);
        new LoginPage(driver).isAlertAppears();
    }
}
