package org.testprallel;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunIretryClass implements IRetryAnalyzer {
	int max=5,min=0;
	public boolean retry(ITestResult a) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
