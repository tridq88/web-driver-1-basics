package com.in28minutes.webdriver.basics;

import static org.testng.AssertJUnit.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithTagTest extends AbstractChromeWebDriverTest {
	@Test
	public void testGetDetailLoginButton() throws Exception {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement linkElement = driver.findElement(By.tagName("a"));
		System.out.println(linkElement.getTagName());//login
		System.out.println(linkElement.getAttribute("class"));//btn btn-lg btn-success btn-block
		System.out.println(linkElement.getAttribute("href"));//http://localhost:8080/pages/index.html
	}
	
	@Test
	public void testGetDetailInputTags_returnFirstElement() throws Exception {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement linkElement = driver.findElement(By.tagName("input"));
		System.out.println(linkElement.getTagName());//input
		System.out.println(linkElement.getAttribute("class"));//form-control
		System.out.println(linkElement.getAttribute("href"));//null
		System.out.println(linkElement.getAttribute("placeholder"));//E-mail
	}
	
	@Test
	public void testGetDetailInputTags_returnAllElements() throws Exception {
		driver.get("http://localhost:8080/pages/login.html");
		List<WebElement> elements = driver.findElements(By.tagName("input"));

		for(WebElement element:elements) {
			  System.out.println(element.getAttribute("class"));
			  System.out.println(element.getAttribute("placeholder"));
		}
	}
	
	@Test
	public void testGetDetailInputTags_returnAllElements_Login() throws Exception {
		driver.get("http://localhost:8080/login");
		List<WebElement> elements = driver.findElements(By.tagName("input"));

		for(WebElement element:elements) {
			  System.out.println(element.getAttribute("type"));
			  System.out.println(element.getAttribute("name"));
		}
	}
}
