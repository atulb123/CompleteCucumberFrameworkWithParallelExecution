package com.test.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void launchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redmine.org/login");
        wait=new WebDriverWait(driver, 15);
    }
}
