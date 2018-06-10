package com.it.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(name = "login")
    private WebElement login;

    @FindBy(name = "pass")
    private WebElement password;

    @FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
    private WebElement btnSubmit;


   protected void login(String name, String pass) {
        login.sendKeys(name);
        password.sendKeys(pass);
        btnSubmit.click();
    }










}
