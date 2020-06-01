package org.testprallel;

import org.testng.annotations.Test;

public class ClassLevelExe2 {
	@Test
	public void test1() {
		System.out.println("sql");
		System.err.println(Thread.currentThread().getId());
		
	}
	@Test
	public void test2() {
		System.out.println("python");
		System.err.println(Thread.currentThread().getId());
		
	}
	

}
