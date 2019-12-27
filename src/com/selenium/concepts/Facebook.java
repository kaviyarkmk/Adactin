package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\workspace\\SeleniumProject\\src\\com\\browserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kaviyabluerose@gmail.com");
		//input[contains(@class,'inputtext')]
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("rkmk@1234");
		//input[@name='pass']
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kaviya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thangapandi");
		driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("kaviyajuin5@gmail.com");
		//(//input[contains(@class,'inputtext')])[5]
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
