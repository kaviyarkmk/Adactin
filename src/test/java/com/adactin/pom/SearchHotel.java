package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	
	@FindBy(xpath = ("//select[@name='location']"))
	private WebElement location;
	@FindBy(xpath = ("//select[@id=\"hotels\"]"))
	private WebElement hotel;
	@FindBy(xpath = ("//select[@id=\"room_type\"]"))
	private WebElement roomtype;
	@FindBy(xpath = ("//select[@id=\"room_nos\"]"))
	private WebElement roomno;
	@FindBy(xpath = ("//input[@id=\"datepick_in\"]"))
	private WebElement checkin;
	@FindBy(xpath = ("//input[@id=\"datepick_out\"]"))
	private WebElement checkout;
	@FindBy(xpath = ("//select[@id=\"adult_room\"]"))
	private WebElement adultroom;
	@FindBy(xpath = ("//select[@id=\"child_room\"]"))
	private WebElement childroom;
	@FindBy(xpath = ("//input[@id=\"Submit\"]"))
	private WebElement submit;

	public SearchHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement gethotel() {
		return hotel;
	}

	public WebElement getroomtype() {
		return roomtype;
	}

	public WebElement getroomno() {
		return roomno;
	}

	public WebElement getcheckin() {
		checkin.clear();
		return checkin;
	}

	public WebElement getcheckout() {
		checkout.clear();
		return checkout;
	}

	public WebElement getadultroom() {
		return adultroom;
	}

	public WebElement getchildroom() {
		return childroom;
	}

	public WebElement getsubmit() {
		return submit;
	}
}