package com.Blazedemo.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Blazedemo.librarymethods.ReusableMethods;

public class BaseClass extends ReusableMethods {

	public WebDriver driver;

	@BeforeClass
	public void setupApplication() {

		Reporter.log("=====Browser Session Started=====", true);
		System.setProperty("webdriver.chrome.driver", "browser_servers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver();

		Reporter.log("=====Application Started=====", true);
	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);

	}

}