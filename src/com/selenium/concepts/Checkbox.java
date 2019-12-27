package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.BasePage;

public class Checkbox extends BasePage {
	
public static void main(String[] args) {
	
	browseropen();
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	
	List<WebElement> Listofcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement color: Listofcheckbox) {
		
		if(color.isSelected()) {
			color.click();
		}
	}
}
}
