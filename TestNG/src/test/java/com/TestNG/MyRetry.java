package com.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
	
	int count =10;
	
	int limit = 0;

	@Override
	public boolean retry(ITestResult result) {
		
		if(limit<count) {
			
			limit++;
			
			return true;
		}
		
		return false;
	}

}
