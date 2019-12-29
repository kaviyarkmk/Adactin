package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookingPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class LBooking_StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {
		//BookingPage bp= new BookingPage(driver);
		inputOnElement(pom.getBp().getfirstname(),"Maha");
	}

	@And("^user enter lastname$")
	public void user_enter_lastname() throws Throwable {
		//BookingPage bp= new BookingPage(driver); 
		inputOnElement(pom.getBp().getlastname(),"Lakshmi");
	}

	@And("^user enter address$")
	public void user_enter_address() throws Throwable {
		//BookingPage bp= new BookingPage(driver);
		inputOnElement(pom.getBp().getaddress(), "adayar,chennai");
	}

	@And("^user enter creditcardno$")
	public void user_enter_creditcardno() throws Throwable {
	   // BookingPage bp= new BookingPage(driver);
	    inputOnElement(pom.getBp().getcreditcard(), "2345 5432 7654 8976");
	}

	@And("^user enter creditcardtype$")
	public void user_enter_creditcardtype() throws Throwable {
		//BookingPage bp= new BookingPage(driver);
		dropdown(pom.getBp().getcredittype(),"text","VISA");
	}

	@And("^user enter expmon of creditcard$")
	public void user_enter_expmon_of_creditcard() throws Throwable {
		//BookingPage bp= new BookingPage(driver);
		dropdown(pom.getBp().getexpmon(), "text","December" );
	}

	@And("^user enter expyear of creditcard$")
	public void user_enter_expyear_of_creditcard() throws Throwable {
		//BookingPage bp= new BookingPage(driver);
		dropdown(pom.getBp().getexpyear(), "text", "2020");
		
	}

	@And("^user enter cvv$")
	public void user_enter_cvv() throws Throwable {
		//BookingPage bp= new BookingPage(driver);
		inputOnElement(pom.getBp().getcvv(), "999");
	}

	@And("^user booknow button$")
	public void user_booKnow_button() throws Throwable {
		//BookingPage bp= new BookingPage(driver); 
		clickOnElement(pom.getBp().getbooknow());
		Thread.sleep(8000);
	}

	@Then("^user click logout button$")
	public void user_click_logout_button() throws Throwable {
		//BookingPage bp= new BookingPage(driver); 
		clickOnElement(pom.getBp().getlogout());
	}

	
	

}
