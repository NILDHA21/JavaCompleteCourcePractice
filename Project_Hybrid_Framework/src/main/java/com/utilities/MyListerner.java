package com.utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyListerner implements ITestListener{

	private static final Logger logger = LogManager.getLogger(MyListerner.class);			
	private static ExtentReports reports = MyReport.getInstance();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test execution started"+result.getName());
		test = reports.createTest("Test case execution");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test execution passed"+result.getName());
		test.log(Status.PASS, "Test execution passed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test execution failed"+result.getName());
		String ss = TakeScrenshot.takesScreenshot(result.getName());
		test.log(Status.FAIL, "Test execution failed"+result.getName());
		test.addScreenCaptureFromPath(ss);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test execution skipped"+result.getName());
		test.log(Status.SKIP, "Test execution skipped"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		logger.info("Test case execution started" + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		logger.info("Test case execution finalized" + context.getName());
		reports.flush();
	}

}
