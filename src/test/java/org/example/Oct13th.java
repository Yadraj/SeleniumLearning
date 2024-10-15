package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Oct13th {

    @Test
    public void testMethod01(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver  driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");

    }

    @Test
    public void testVerifyTite(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver  driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        driver.quit();

    }


}
