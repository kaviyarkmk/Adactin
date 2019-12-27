package com.selenium.concepts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.BasePage;

public class DemoActions extends BasePage{

	public static void main(String[] args) throws Exception{
		BasePage.browseropen();
		BasePage.urllaunch("https:/google.com");
		
		Actions gmail= new Actions(driver);
		WebElement newtabclick= driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
		gmail.contextClick(newtabclick).perform();
		
		//Robot
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
