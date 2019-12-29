package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ILogin_StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	
	@Given("^the user is loggedin the application$")
	public void the_user_is_loggedin_the_application() throws Throwable {
		System.out.println("user starts to login into the application");
	}

	@Then("^goes to landing page$")
	public void goes_to_landing_page() throws Throwable {
		System.out.println("user logged on");
	}

	@When("^user enter application url$")
	public void user_enter_application_url() throws Throwable {
		String url = FileReaderManager.getInstance().getcrInstance().getUrl();
		getUrl(url);
	}
	
	@And("^user enter \"([^\"]*)\" username$")
	public void user_enter_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputOnElement(pom.getLp().getUserName(), arg1); 
	}

	@And("^user enter \"([^\"]*)\" password$")
	public void user_enter_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputOnElement(pom.getLp().getpassword(), arg1);
	}

	@Then("^user verify the username in the homepage$")
	public void user_verify_the_username_in_the_homepage() throws Throwable {
		clickOnElement(pom.getLp().getloginbtn());

	}

}
