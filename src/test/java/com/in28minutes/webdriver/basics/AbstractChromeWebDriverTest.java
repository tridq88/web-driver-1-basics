package com.in28minutes.webdriver.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriverTest {

	protected WebDriver webDriver;

	public AbstractChromeWebDriverTest() {
		super();
	}

	@BeforeMethod
	public void before() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
	}

	@AfterMethod
	public void after() {
		webDriver.quit();
	}

}