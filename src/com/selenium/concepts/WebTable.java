package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\workspace\\SeleniumProject\\src\\com\\browserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//get particular data
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		WebElement pData = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]"));
		System.out.println(pData.getText());
		
		//get row value
		WebElement row2 = driver.findElement(By.xpath("//table/tbody/tr[3]"));
		System.out.println(row2.getText());
		
		//get column value
		WebElement column = driver.findElement(By.xpath("//table/tbody/tr/td[1]"));
	    System.out.println(column.getText());
	}
	
	
}
