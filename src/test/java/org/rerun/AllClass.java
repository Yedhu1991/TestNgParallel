package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class AllClass implements IRetryAnalyzer,IAnnotationTransformer {
	int min=0,max=5;
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}


	public void transform(ITestAnnotation ta, Class testClass, Constructor testConstructor, Method testMethod) {
	IRetryAnalyzer ir = ta.getRetryAnalyzer();
	ta.setRetryAnalyzer(AllClass.class);
		
	}

	
}
