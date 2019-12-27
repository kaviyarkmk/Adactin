package util;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
public static WebDriver driver;

//--------------Browser open-------------//
public static void browseropen() 
	{
	System.setProperty("webdriver.chrome.driver", "./src/com/browserDriver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}

//----------- url pass-----------------//
public static void urllaunch(String url) 
{
	driver.get(url);

}

//-------------alert---------------//
	//Accept
public static void allow() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

	//Dismiss
public static void deny() {
	Alert deny = driver.switchTo().alert();
	deny.dismiss();
	

}

//-------------Screenshot------//

public static void takeSS() {
	
}

//----Robot-----------------//
public static void movedown() throws Exception {
Robot r= new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

}


}





	
	


