package org.testprallel;

import org.testng.annotations.Test;

public class GroupingTestCase {
	@Test(groups="Regresion")
	public void test1() {
		System.out.println("java");
	}
	@Test(groups="Smoke")
	public void test3() {
		System.out.println("selenium");
	}
	@Test(groups="Regresion")
	public void test2() {
		System.out.println("python");
	}
	

}
