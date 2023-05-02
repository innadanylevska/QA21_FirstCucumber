package com.ait.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

        //init metods and elements in others pages
        PageFactory.initElements(driver,this);
    }

    public void launchBrowser(){
        //min red errers will be
        System.err.close();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);

    }
    public void openURL(){

        driver.get("https://telranedu.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }


    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }
    public void quit() {
        driver.quit();
    }

    public boolean isAlertAppears(){


        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.alertIsPresent());

        if (alert == null) {
            //CONFIRM RETURN DISSMIS
            ////Store the alert text in a variable
            //String text = alert.getText();
            return false;
        } else {
            driver.switchTo().alert();// ПРОМПТ INTEAD //Type your message//alert.sendKeys("Selenium");
            alert.accept();
            return true;
        }
    }

}
