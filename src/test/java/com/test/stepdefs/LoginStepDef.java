package com.test.stepdefs;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.basetest.BaseClass;
import com.test.hooks.Hooks;
import com.test.pages.LandingPage;
import com.test.pages.LoginPage;
import com.test.pages.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef extends BaseClass {
	public RegisterPage registerPage=new RegisterPage();
	public LoginPage loginPage = new LoginPage();
	public LandingPage landingPage = new LandingPage();

	@When("^I click on register link$")
	public void i_click_on_register_link() throws Throwable {
		loginPage.clickRegisterLink();
		System.out.println("indide I click on register link-->"+Thread.currentThread().getName());
	}

	@Then("^I should see registration form displayed$")
	public void i_should_see_registration_form_displayed() throws Throwable {
		Assert.assertTrue("Registartion form not displayed",
				wait.until(ExpectedConditions.visibilityOf(registerPage.registerForm)).isDisplayed());
		System.out.println("indide I should see registration form displayed-->"+Thread.currentThread().getName());
	}

	@Given("^I am a Valid user$")
	public void i_am_a_Valid_user() throws Throwable {
		System.out.println("indide I am a Valid user-->"+Thread.currentThread().getName());
	}

	@When("^I login to application$")
	public void i_login_to_application() throws Throwable {
		System.out.println("indide I login to application-->"+Thread.currentThread().getName());
		loginPage.enterUserName("atulluta").enterPassword("ab00338092").clickLoginButton();
	}

	@Then("^I should see logout option$")
	public void i_should_see_logout_option() throws Throwable {
		System.out.println("indide I should see logout option-->"+Thread.currentThread().getName());
		Assert.assertTrue("Registartion form not displayed",
				wait.until(ExpectedConditions.visibilityOf(landingPage.logoutLink)).isDisplayed());
	}

	@When("^I navigate to registration page$")
	public void i_navigate_to_registration_page() throws Throwable {
		System.out.println("indide I navigate to registration page-->"+Thread.currentThread().getName());
		driver.navigate().to("https://www.redmine.org/account/register");
	}

	@Then("^I should see registration page displayed$")
	public void i_should_see_registration_page_displayed() throws Throwable {
		System.out.println("indide I should see registration page displayed-->"+Thread.currentThread().getName());
		Assert.assertTrue("Registartion page title mismatch",
				driver.getTitle().equals("Redmine"));
	}
}
