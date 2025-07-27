package com.utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyListerner implements ITestListener {
	private static final Logger logger = LogManager.getLogger(MyListerner.class);
	
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test case execution started." + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test case pass." + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test case failed." + result.getName());
		TakeScreenshots.takesScreenshots(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test case Skipped." + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		logger.info("Test suit execution started." + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		logger.info("Test suit execution Finish." + context.getName());
	}

}
