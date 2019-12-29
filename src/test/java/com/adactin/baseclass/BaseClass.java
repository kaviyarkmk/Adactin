package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import org.openqa.selenium.Alert;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty(("user.dir") + "\\Drivers\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			} else if (browsername.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty(("user dir") + "\\Drivers\\geckodriver.exe"));
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid Browser Name");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void dropdown(WebElement element, String option, String value) {
		Select s = new Select(element);
		try {
			if (option.contentEquals("index")) {
				s.selectByIndex(Integer.parseInt(value));
			} else if (option.equals("value")) {
				s.selectByValue(value);
			} else if (option.equals("text")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
	}
public static void getoptions(WebElement element) {
	Select s = new Select(element);
	List<WebElement>options = s.getOptions();
	for (WebElement webElement : options); 
		}
	public static void inputOnElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clearOnElement(WebElement element) {
		element.clear();
	}

	public static void driverquit(WebElement element) {
		driver.quit();
	}

	public static void isSelected(WebElement element) {
		if (element.isSelected()) {
			System.out.println("ELEMENT IS CHOOSEN ");
		}
	}

	public static void isDisplayed(WebElement element) {
		if (element.isDisplayed()) {
			System.out.println("ELEMENT IS VIEWABLE");
		}
	}

	public static void isEnabled(WebElement element) {
		
		if (element.isEnabled()) {
			System.out.println("ELEMENT IS EDITABLE");
		}
	}

	public static void Screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("User.dir")+"\\ScreenShot\\"+filename+".png");
		Files.copy(sourcefile, destfile);
		
	}

	public static void ScrollUp(Object element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.ScrollBy(0,-1000)");
	}

	public static void ScrollDown(Object element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.ScrollBy(0,1000)");
	}

	public static void iframe(WebElement elements) throws InterruptedException {
		elements.click();
		driver.switchTo().frame(elements);
		Thread.sleep(2000);
	}

	public static void Alertaccept(WebElement element) throws InterruptedException {
		element.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
	}

	public static void Alertdismiss(WebElement element) throws InterruptedException {
		element.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(2000);
	}

	public static void Alertsendkeys(WebElement element, WebElement element1) throws InterruptedException {
		element.click();
		Thread.sleep(2000);

		element1.click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Mahalakshmi");
		Thread.sleep(2000);
	}

	public static void robotclass() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public static void navigateTo(WebElement element) {
		driver.navigate().to("Url");
	}

	public static void navigateback(WebElement element) {
		driver.navigate().back();
	}

	public static void navigateforward(WebElement element) {
		driver.navigate().forward();
	}

	public static void navigaterefresh(WebElement element) {
		driver.navigate().refresh();
	}
	public static void actions(WebElement element, WebElement element1,WebElement source, WebElement target) {
    Actions ac = new Actions(driver);
	if (ac.contextClick(element).equals(true)) {
		ac.contextClick(element).build().perform();
		
	} else if (ac.doubleClick(element).equals(true)) {
		ac.doubleClick(element).build().perform();
	}else if (ac.dragAndDrop(source, target).equals(true)) {
		ac.dragAndDrop(source, target).build().perform();
	}else if (ac.moveToElement(target).equals(true)) {
		ac.moveToElement(target).build().perform();
	}else {
		System.out.println("INVALID ELEMENTS ARE PASSED");
	}}
	public static void browserclose(WebElement element) {
         driver.close();
	}
	public static void gettext(WebElement element) {
		element.getText();
	}
	public static void gettitle(String element) {
		driver.switchTo().window(element).getTitle();
		
	}
	public static void getcurrentUrl(String element) {
		driver.getCurrentUrl();
	}
	public static void getattribute(WebElement element) {
	 element.getAttribute("value");
	}
	public static void getattribute1(WebElement element) {
		element.getAttribute("Attribute_name");
	}
	
}