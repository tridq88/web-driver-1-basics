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

public class WebDriverBasicsLocatorsTest {
	WebDriver webDriver;
	
	@BeforeMethod
	public void before() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
	}
	
	@Test
	public void testTitle() throws Exception {
		webDriver.get("http://localhost:8080/login");
		Thread.sleep(2000);//Add sleep to see the webpage

		String actualTitle = webDriver.getTitle();
		String expectedTitle = "First Web Application";

		// Check the Title
		assertEquals(expectedTitle, actualTitle);
	}
	
	@Test
	public void testGetInfoName() throws Exception {
		webDriver.get("http://localhost:8080/login");
		WebElement nameElement = webDriver.findElement(By.id("name"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//text
		System.out.println(nameElement.getAttribute("value"));//empty
	}
	
	@Test
	public void testGetInfoPassword() throws Exception {
		webDriver.get("http://localhost:8080/login");
		WebElement nameElement = webDriver.findElement(By.id("password"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//password
		System.out.println(nameElement.getAttribute("value"));//empty
	}
	
	@Test
	public void testGetInfoSubmitButton() throws Exception {
		webDriver.get("http://localhost:8080/login");
		WebElement nameElement = webDriver.findElement(By.id("submit"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//submit
		System.out.println(nameElement.getAttribute("value"));
	}
	
	@AfterMethod
	public void after() {
		webDriver.quit();
	}
}
