package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.basetest.BaseClass;

public class RegisterPage extends BaseClass {
	@FindBy(css = ".box.tabular")
	public WebElement registerForm;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
}
