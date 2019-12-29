package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinfeature",
					glue = "com\\adactin\\stepdefinition",
					plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/reports.html",
							  "html:Report" },
					monochrome = true, 
					dryRun = false,
					strict = true
					//tags = {"@login,@SearchHotel,@Confirmation,@Booking"}
				)

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		String browsername = FileReaderManager.getInstance().getcrInstance().browsername();
		driver = BaseClass.browserLaunch(browsername);

	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}