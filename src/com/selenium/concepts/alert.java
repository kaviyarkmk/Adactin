package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import util.BasePage;

public class alert extends BasePage{
	

	public static void main(String[] args) throws Exception {
		BasePage.browseropen();
		BasePage.urllaunch("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		//Simple alert
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		//
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(3000);
		
		Alert deny=driver.switchTo().alert();
		deny.dismiss();
		
		//prompt
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		Alert text=driver.switchTo().alert();
		text.sendKeys("abcd");
		text.accept();
		
	}

}
