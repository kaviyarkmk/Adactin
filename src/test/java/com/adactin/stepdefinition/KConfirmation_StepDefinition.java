package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.ConfirmationPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class KConfirmation_StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@When("^user click select radio button$")
	public void user_click_select_radio_button() throws Throwable {
		//ConfirmationPage cp = new ConfirmationPage(driver);
		clickOnElement(pom.getCp().getradiobtn());
	     
	}

	@Then("^user click continue button$")
	public void user_click_continue_button() throws Throwable {
		//ConfirmationPage cp = new ConfirmationPage(driver);
		clickOnElement(pom.getCp().getcontinue());
	}


}
