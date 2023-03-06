package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Test {
	
	@Test
	private void gecko() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\TestNG\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");

	}
	
	@Test
	private void chrome() {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\TestNG\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");


	}

}
