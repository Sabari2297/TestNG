package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

public class Parameterized_Test extends BaseClass {
	
	@BeforeMethod
	
	private void setUp() throws InterruptedException {
	
		initiateBrowser ("chrome");
		   
		getUrl("https://www.facebook.com/");

	}

	@Test
	@Parameters({"userName","password"})
	private void credentials(String userName , String passWord) {
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='email']"));
		phoneNumber.sendKeys(userName);
		phoneNumber.sendKeys(Keys.ENTER);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(passWord);
		pass.sendKeys(Keys.ENTER);

	}
	
}

