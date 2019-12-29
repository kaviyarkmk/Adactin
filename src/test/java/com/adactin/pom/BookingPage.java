package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	public static WebDriver driver;

	@FindBy(xpath = ("//*[@id=\"first_name\"]"))
	private WebElement firstname;
	@FindBy(xpath = ("//*[@id=\"last_name\"]"))
	private WebElement lastname;
	@FindBy(xpath = ("//*[@id=\"address\"]"))
	private WebElement address;
	@FindBy(xpath = ("//*[@id=\"cc_num\"]"))
	private WebElement creditcard;
	@FindBy(xpath = ("//*[@id=\"cc_type\"]"))
	private WebElement credittype;
	@FindBy(xpath = ("//*[@id=\"cc_exp_month\"]"))
	private WebElement expmon;
	@FindBy(xpath = ("//*[@id=\"cc_exp_year\"]"))
	private WebElement expyear;
	@FindBy(xpath = ("//*[@id=\"cc_cvv\"]"))
	private WebElement cvv;
	@FindBy(xpath = ("//*[@id=\"book_now\"]"))
	private WebElement booknow;
	@FindBy(xpath = ("//*[@id=\"logout\"]"))
	private WebElement logout;

	public BookingPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getfirstname() {
		return firstname;
	}

	public WebElement getlastname() {
		return lastname;
	}

	public WebElement getaddress() {
		return address;
	}

	public WebElement getcreditcard() {
		return creditcard;
	}

	public WebElement getcredittype() {
		return credittype;
	}

	public WebElement getexpmon() {
		return expmon;
	}

	public WebElement getexpyear() {
		return expyear;
	}
	
    public WebElement getcvv() {
    	return cvv;
    }
    public WebElement getbooknow() {
    	return booknow;
    }
    public WebElement getlogout() {
    	return logout;
    }
}
