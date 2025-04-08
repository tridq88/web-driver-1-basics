package com.in28minutes.webdriver.basics;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasicsLocatorsWithNamesTest {
	WebDriver webDriver;
	
	@BeforeMethod
	public void before() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
	}
	
	@Test
	public void testGetInfoName() throws Exception {
		webDriver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = webDriver.findElement(By.name("email"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//text
		System.out.println(nameElement.getAttribute("placeholder"));
	}
	
	@Test
	public void testGetInfoPassword() throws Exception {
		webDriver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = webDriver.findElement(By.name("password"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//password
		System.out.println(nameElement.getAttribute("placeholder"));
	}
	
	@Test
	public void testGetInfoRemember() throws Exception {
		webDriver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = webDriver.findElement(By.name("remember"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));
		System.out.println(nameElement.getAttribute("value"));
	}
	
	@AfterMethod
	public void after() {
		webDriver.quit();
	}
}
