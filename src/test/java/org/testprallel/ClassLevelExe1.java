package org.testprallel;

import org.testng.annotations.Test;

public class ClassLevelExe1 {
	@Test
	public void test1() {
		System.out.println("java");
		System.err.println(Thread.currentThread().getId());
	}
	@Test
	public void test2() {
		System.out.println("selenium");
		System.err.println(Thread.currentThread().getId());
		
	}

}
