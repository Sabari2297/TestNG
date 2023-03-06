package com.TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

public class SimpleAnnotation extends BaseClass{
	
	@BeforeSuite
	private void setUp() throws InterruptedException {
		
		initiateBrowser("gecko");
		   
		getUrl("https://www.amazon.in/");
	}
	
	@BeforeTest
	private void signIn() {
		
		//driver.findElement(By.id("//span[@id='nav-link-accountList-nav-line-1']")).click();
		
		System.out.println("Click Signin Button");

	}
	
	@BeforeClass
	private void detailes() {
		
		//WebElement userName = driver.findElement(By.id("//input[@id='ap_email']"));
		//userName.sendKeys("");
		//userName.sendKeys(Keys.ENTER);
		
		//WebElement passWord = driver.findElement(By.id("//input[@id='ap_password']"));
		//passWord.sendKeys("");
	}
	
	@BeforeMethod
	private void titles() {
	
		getTitle();
	}
	
	@Test(priority = 2,invocationCount = 2)
	private void watch(){
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();

	}
	@Test(enabled = false)
	private void lapTop() {
	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();

	}
	
	@Test(priority = 1)
	private void mobile() {
		

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();


	}
	@Test(priority = -1,invocationCount = 2)
	private void shoes() {
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();


	}
	
	@AfterMethod
	private void itsAfterMethod(){
		getTitle();
	}
	
	@AfterClass
	private void signOut() {
		
		System.out.println("signOut");

	}
	
	@AfterTest
	private void deleteAllCookies() {
	
		driver.manage().deleteAllCookies();

	}
	
	@AfterSuite
	private void closeTheProgram() {
	
		closeBrowser();

	}
	

}
