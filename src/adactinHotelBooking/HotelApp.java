package adactinHotelBooking;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.BasePage;

public class HotelApp extends BasePage{

public static void main(String[] arg) throws Exception {
	BasePage.browseropen();
	BasePage.urllaunch("https://adactin.com/HotelApp/");
	
	//Login
	WebElement element = driver.findElement(By.xpath("//input[@name='username']"));
	element.sendKeys("kaviyarkmk");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@1234");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	
	//-------------Search Hotel-------------//
	//select Location
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	Select lc=new Select(location);
	lc.selectByIndex(2);
	Thread.sleep(2000);
	
	//search Hotel
	WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select ht= new Select(hotels);
	ht.selectByValue("Hotel Hervey");
	Thread.sleep(2000);
	
	WebElement norooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select nr=new Select(norooms);
	nr.selectByValue("2");
	
	WebElement adultrooms = driver.findElement(By.xpath("//select[@name='adult_room']"));
	Select ar=new Select(adultrooms);
	ar.selectByValue("1");
	
		
	//Room type
	WebElement roomtype = driver.findElement(By.xpath("(//select[contains(@name,'room')])[1]"));
	Select rt= new Select(roomtype);
	rt.selectByIndex(4);
	Thread.sleep(2000);
	
	//child room
	WebElement childroom = driver.findElement(By.xpath("//select[contains(@name,'child')]"));
	Select cr = new Select(childroom);
	cr.selectByIndex(1);
	
	//Search Button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	
		
	//-------------selected hotel------------------//
	driver.findElement(By.xpath("(//input[contains(@name,'radio')])[1]")).click();
	driver.findElement(By.xpath("//input[contains(@name,'continue')]")).click();
	Thread.sleep(2000);
	
	//--------------Payment process  Book a hotel---------//
	//Billing details
	driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Kaviya");
	driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Thangapandi");
	driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("India");
	Thread.sleep(2000);
	
	//Card details
	driver.findElement(By.xpath("(//input[contains(@name,'num')])[2]")).sendKeys("0987 1234 6543 5678");
	WebElement creditcard = driver.findElement(By.xpath("(//select[contains(@name,'cc')])[1]"));
	Select cc=new Select(creditcard);
	cc.selectByIndex(2);
	Thread.sleep(2000);
	
	WebElement cmonth = driver.findElement(By.xpath("//select[contains(@name,'month')]"));
	Select cm= new Select(cmonth);
	cm.selectByIndex(9);
	Thread.sleep(2000);
	
	WebElement cyear = driver.findElement(By.xpath("//select[contains(@name,'year')]"));
	Select cy= new Select(cyear);
	cy.selectByValue("2022");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[contains(@name,'cvv')]")).sendKeys("023");
	driver.findElement(By.xpath("//input[contains(@name,'book')]")).click();
	
	//Screenshot
	Thread.sleep(6000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File srcfile=ts.getScreenshotAs(OutputType.FILE);
	File destFile=new File("C:/Java/workspace/SeleniumProject/src/screenshot/test.png");
	FileUtils.copyToDirectory(srcfile, destFile);
	
	//My Itinerary
	driver.findElement(By.xpath("//input[contains(@name,'itinerary')]")).click();
	
	
}
}
