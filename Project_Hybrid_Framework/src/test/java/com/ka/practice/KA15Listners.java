package com.ka.practice;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class KA15Listners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Executing before Test Case");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Executing after Test Case success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Executing after Test Case failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Executing after Test Case skip");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Executing before all Test Case");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Executing after all Test Case");
	}
	
}
