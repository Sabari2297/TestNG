package com.TestNG;

import org.testng.annotations.Test;

public class Time_Out {
	
	
	@Test(timeOut = 3000)
	private void ligIn() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println("User Login");
		


	}
	
	@Test(timeOut = 1000)
	private void logOut() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("User Logout");
		

	}

}
