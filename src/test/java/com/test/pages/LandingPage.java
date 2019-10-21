package com.test.pages;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.test.basetest.BaseClass;

public class LandingPage extends BaseClass{
@FindBy(css=".logout")
public WebElement logoutLink;

public LandingPage()
{
	PageFactory.initElements(driver, this);
}
}
