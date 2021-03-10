package com.qa.sampletest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}

	
	@Test(retryAnalyzer = com.qa.listener.retryListener.class)
	public void test2() {
		Assert.assertTrue(false);
	}
}
