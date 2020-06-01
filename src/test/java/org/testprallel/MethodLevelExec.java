package org.testprallel;

import org.testng.annotations.Test;

public class MethodLevelExec {
	@Test
	public void test1() {
		System.out.println("java");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test2() {
		System.out.println("selenium");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println("python");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println("sql");
		System.out.println(Thread.currentThread().getId());
	}
}
