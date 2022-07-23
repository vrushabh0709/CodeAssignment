package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener{


	public void onTestStart(ITestResult result) {
		Logger.info("Testing is Starting...");

	}


	public void onTestSuccess(ITestResult result) {
		Logger.info("Test Case is Pass");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case execution failed.");
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		System.out.println("ScreenShot taken.");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped.");
	}


	public void onStart(ITestContext context) {
		System.out.println("Test case execution is Started.");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test case execution is finshed.");
	}



	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	
	}
	public void onTestFailedWithTimeout(ITestResult result) {
	}



}
