package com.it.Tests;

import com.it.Pages.DashboardPage;
import com.it.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void testWeb()  {
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getUserEmail().split("@")[0],validUser.getLogin());

    }
}
