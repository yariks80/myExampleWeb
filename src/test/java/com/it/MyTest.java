package com.it;

import com.it.Pages.DashboardPage;
import com.it.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void testWeb()  {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.i.ua/");
         new LoginPage(driver).login("ittest2","337774a");
        String userEmail = new DashboardPage(driver).getUserEmail();
        Assert.assertEquals(userEmail.split("@")[0],"ittest2");
        driver.quit();
    }
}
