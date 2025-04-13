package com.in28minutes.webdriver.basics.Form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriverTest {

	protected WebDriver driver;

	public AbstractChromeWebDriverTest() {
		super();
	}

	@BeforeMethod
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}