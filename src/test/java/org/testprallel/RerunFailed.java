package org.testprallel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailed {
	@Test()
	public void test1() {
		System.out.println("java");
	}
	@Test
	public void test3() {
		System.out.println("salenium");
		Assert.assertTrue(false);
	}
	@Test
	public void test2() {
		
		System.out.println("python");
		Assert.assertTrue(false);
	}
}
