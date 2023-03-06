package com.TestNG;

import org.testng.annotations.Test;

public class Exception_Test {
	
	
	@Test
	private void add() {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);

	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {
		
		int a = 100;
		int b = 0;
		
		System.out.println(a/b);
		
		System.out.println("TestNG");
	

	}

}
