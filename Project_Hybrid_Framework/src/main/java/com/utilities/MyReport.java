package com.utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyReport {

	private static ExtentReports extent;
	
	public static ExtentReports getInstance() {
		if (extent == null) {
			String path = System.getProperty("user.dir") + "/target/ExtentReport.html";
			ExtentSparkReporter spark = new ExtentSparkReporter(path);
			spark.config().setDocumentTitle("Functional Testing");
			spark.config().setReportName("Test Execution Report");
			
			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Tester name", "Iranna");
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("OS", "Windows");
	}
		return extent;
}
}
