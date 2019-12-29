package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SearchHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class JSearch_StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	
	@When("^user select location$")
	public void user_select_location() throws Throwable {
		
		//SearchHotel sh= new SearchHotel(driver);
		dropdown(pom.getSh().getLocation(),"text", "London");
	    
	}

	@And("^user select hotels$")
	public void user_select_hotels() throws Throwable {
		//SearchHotel sh= new SearchHotel(driver);
		dropdown(pom.getSh().gethotel(), "text", "Hotel Creek");
	}

	@And("^user select roomtype$")
	public void user_select_roomtype() throws Throwable {
		//SearchHotel sh= new SearchHotel(driver);
		dropdown(pom.getSh().getroomtype(), "text", "Super Deluxe");
	}

	@And("^user select roomno$")
	public void user_select_roomno() throws Throwable {
		//SearchHotel sh= new SearchHotel(driver);
		dropdown(pom.getSh().getroomno(), "text","4 - Four");
	}

	@And("^user select checkin date$")
	public void user_select_checkin_date() throws Throwable {
		//SearchHotel sh= new SearchHotel(driver);
		clickOnElement(pom.getSh().getcheckin());
		inputOnElement(pom.getSh().getcheckin(), "22/01/2020");
	}

	@And("^user select checkout date$")
	public void user_select_checkout_date() throws Throwable {
		//SearchHotel sh= new SearchHotel(driver);
		clickOnElement(pom.getSh().getcheckout());
		inputOnElement(pom.getSh().getcheckout(), "24/01/2020");
	}
	@And("^user select adultroom$")
	public void user_select_adultroom() throws Throwable {
		//SearchHotel sh= new SearchHotel(driver);
		dropdown(pom.getSh().getadultroom(), "text", "2 - Two");
	}

	@And("^user select childroom$")
	public void user_select_childroom() throws Throwable {
		//SearchHotel sh= new SearchHotel(driver);
		dropdown(pom.getSh().getchildroom(), "text", "2 - Two");
	}

	@Then("^user click submit button$")
	public void user_click_submit_button() throws Throwable {
		//SearchHotel sh= new SearchHotel(driver);
		clickOnElement(pom.getSh().getsubmit());
		
	}




}
