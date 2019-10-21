package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.basetest.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id = "username")
	private WebElement userNameTextBlock;

	@FindBy(id = "password")
	private WebElement passwordTextBlock;

	@FindBy(xpath = "//*[@name='login']")
	private WebElement loginButton;

	@FindBy(css = ".register")
	private WebElement registerLink;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage enterUserName(String userName) {
		wait.until(ExpectedConditions.visibilityOf(userNameTextBlock)).sendKeys(userName);
		return this;
	}

	public LoginPage enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(passwordTextBlock)).sendKeys(password);
		return this;
	}

	public LoginPage clickLoginButton() {
		wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
		return this;
	}

	public LoginPage clickRegisterLink() {
		wait.until(ExpectedConditions.visibilityOf(registerLink)).click();
		return this;
	}
}
