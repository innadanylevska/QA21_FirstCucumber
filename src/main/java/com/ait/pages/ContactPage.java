package com.ait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div:nth-child(2)>div>div")
    WebElement contactComponent;

    public ContactPage isContactComponentPresent() {
        isElementDisplayed(contactComponent);
        return this;
    }
    @FindBy(xpath = "//a[contains(.,'CONTACTS')]")
    WebElement contactLink;
    public ContactPage clickOnLoginLink() {
        click(contactLink);
        return new ContactPage(driver);
    }
}
