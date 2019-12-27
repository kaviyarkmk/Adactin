package com.selenium.concepts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.BasePage;

public class AmazonTabOpen extends BasePage {

	public static void main(String[] args) throws Exception {
		
		BasePage.browseropen();
		BasePage.urllaunch("https://www.amazon.com/");
		//bestseller
		WebElement bestseller=driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		Actions tab1=new Actions(driver);
		tab1.contextClick(bestseller).perform();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		

		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Gift ideas
		Thread.sleep(3000);
		WebElement  giftideas=driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		Actions tab2=new Actions(driver);
		tab2.contextClick(giftideas).perform();
		
		Robot r2= new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		
		
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		
		//New Release
		Thread.sleep(3000);
		WebElement  NewRelease=driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		Actions tab3=new Actions(driver);
		tab3.contextClick(NewRelease).perform();
		
		Robot r3= new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);
		
	
		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);
		
		//Todays deal
		Thread.sleep(2000);
		WebElement  Todaysdeal=driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		Actions tab4=new Actions(driver);
		tab4.contextClick(Todaysdeal).perform();
		
		Robot r4= new Robot();
		r4.keyPress(KeyEvent.VK_DOWN);
		r4.keyRelease(KeyEvent.VK_DOWN);
		
		
		r4.keyPress(KeyEvent.VK_ENTER);
		r4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
			
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) 
		{
		 System.out.println(id);
		 String title = driver.switchTo().window(id).getTitle();
		 System.out.println(title);
		}
		
		String actualTitle="International Shopping: Shop special offers and deals that ship internationally";
		for(String id : allId) {
		
			if(driver.switchTo().window(id).getTitle().equals(actualTitle)) {
				break;
			}
		}
		
				
	}

}
