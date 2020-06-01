package org.fail;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("===========started==================="+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test Successed"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		//String path = result.getName();
		java.util.Date d=new java.util.Date();
		String path = d.toString();
		String dt = path.replaceAll(":", "-");
		TakesScreenshot tk=(TakesScreenshot)ExecutionClass.driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Yedhu\\eclipse-workspace\\TestNgParellal\\screenshot\\"+dt+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("the skipped testcases are====="+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
