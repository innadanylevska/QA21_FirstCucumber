package com.ait.pages;

import io.cucumber.datatable.DataTable;
import io.netty.handler.codec.string.StringEncoder;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[placeholder='Email']")
    WebElement emailField;
    @FindBy(css = "[placeholder='Password']")
    WebElement passwordField;
    public LoginPage enterDate(String email, String password) {
        type(emailField,email);
        type(passwordField,password);
        return this;
    }
    @FindBy(name = "login")
    WebElement loginButton;
    public LoginPage clickOnLogginButton() {
        click(loginButton);
        return this;
    }
    @FindBy(xpath = "//button[contains(.,'Sign Out')]")
    WebElement signOutButton;
    public LoginPage isSignOutButtonDisplayed() {
        //junit bez test ng net assert
        //Assert.assert
        isElementDisplayed(signOutButton);
        return this;
    }

    public LoginPage enterWrongPassword(DataTable table) {
        List<Map<String,String>> dataTable = table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");

        enterDate(email,password);

        return this;
    }
}
