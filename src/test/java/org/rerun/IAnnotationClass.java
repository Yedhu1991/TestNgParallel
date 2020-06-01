
package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class IAnnotationClass implements IAnnotationTransformer {

	public void transform(ITestAnnotation it, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer tr = it.getRetryAnalyzer();
		it.setRetryAnalyzer(IRetryAnalyzerClass.class);
	}

}
