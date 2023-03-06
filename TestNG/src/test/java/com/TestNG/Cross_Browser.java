package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Cross_Browser {
	
	@Test
	private void gecko() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\TestNG\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();

	}
	
	@Test
	private void chrome() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();

}
}
