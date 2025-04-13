package com.in28minutes.webdriver.basics.Login;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.Form.AbstractChromeWebDriverTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstWebAppTest extends AbstractChromeWebDriverTest {
	
	@Test
	public void testTitle() throws Exception {
		driver.get("http://localhost:8080/login");
		Thread.sleep(2000);//Add sleep to see the web page

		String actualTitle = driver.getTitle();
		String expectedTitle = "First Web Application";

		// Check the Title
		assertEquals(expectedTitle, actualTitle);
	}
	
}
