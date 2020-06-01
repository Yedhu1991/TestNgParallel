package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecutionClass {
	@Test
	public void test1() {
		System.out.println("Java");
	}
	@Test
	public void test2() {
		System.out.println("selenium");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("python");
		Assert.assertTrue(false);
	}
}
