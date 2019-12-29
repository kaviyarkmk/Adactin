package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	
	public static WebDriver driver;
 
	@FindBy(xpath=("//*[@id=\"radiobutton_0\"]"))
	private WebElement radio;
	@FindBy(xpath=("//*[@id=\"continue\"]"))
	private WebElement con;
	
	public ConfirmationPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getradiobtn() {
		return radio;
	}
	public WebElement getcontinue() {
		return con;
	}
}

