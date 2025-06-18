package com.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerner implements ITestListener{

	private static final Logger logger = LogManager.getLogger(MyListerner.class);			
	
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test execution failed");
		TakeScrenshot.takesScreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test execution skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		logger.info("Test case execution started" + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		logger.info("Test case execution finalized" + context.getName());
	}

}
