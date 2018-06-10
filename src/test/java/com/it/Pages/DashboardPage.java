package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage  extends  BasePage{
	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement userEmail;

	public String getUserEmail() {
		return  userEmail.getText();
	}

}
