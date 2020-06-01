package org.testprallel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailed2 {
	@Test
	public void test1() {
		System.out.println("Java");
	}
	@Test(retryAnalyzer=RerunIretryClass.class)
	public void test2() {
		System.out.println("Selenium");
		Assert.assertTrue(false);
	}
	@Test(retryAnalyzer=RerunIretryClass.class)
	public void test3() {
		System.out.println("Python");
		Assert.assertTrue(false);
	}
		
}
