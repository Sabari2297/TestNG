package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(retryAnalyzer = MyRetry.class)
	
	private void credentials() {
	
		Assert.assertEquals("Sabari","Nathan");

	}

}
