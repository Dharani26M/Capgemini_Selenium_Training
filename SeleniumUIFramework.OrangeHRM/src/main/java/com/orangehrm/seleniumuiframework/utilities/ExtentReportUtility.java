package com.orangehrm.seleniumuiframework.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	public static ExtentReports extent;
	public static ExtentReports getExtentInstance() {
		if(extent==null) {
			ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/Tets_results.html");
			spark.config().setReportName("Orange HRM UI Automation Report");
			spark.config().setDocumentTitle("Test Results");
			extent =new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Automation Tester", "Dinoo");
			extent.setSystemInfo("UI_Automation_Framework", "Selenium+TestNG");
		}
		return extent;
	}

}
