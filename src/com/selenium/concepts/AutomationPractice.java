package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AutomationPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\workspace\\SeleniumProject\\src\\com\\browserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		//email verification
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kaviyajuin5@gmail.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(4000);
		
		//Create account details
		//first name
		driver.findElement(By.xpath("(//input[contains(@name,'customer')])[1]")).sendKeys("kaviya");
		Thread.sleep(4000);
		
		//last name
		driver.findElement(By.xpath("(//input[contains(@name,'customer')])[2]")).sendKeys("thangapandi");
		Thread.sleep(4000);
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rkmk@1234");
		Thread.sleep(4000);
		
		//day
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s= new Select(day);
		s.selectByIndex(4);
		Thread.sleep(4000);
		
		//month
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select smonth= new Select(month);
		smonth.selectByIndex(5);
		Thread.sleep(3000);
		
		//year
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select syear= new Select(year);
		syear.selectByVisibleText("1996  ");
		Thread.sleep(3000);
		
		//Address
		//company detail
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("SPS");
		
	}
}

