package com.orangehrm.seleniumuiframework.extentsreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class LearningExtentsReports {
	@Test
	public void practice() {
		ExtentReports report=new ExtentReports();
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/sample1.html");
		report.attachReporter(reporter);
		ExtentTest test=report.createTest("Sample Test");
		test.info("----Execution Test ----");
		test.pass("----Exceution passes----");
		test.fail("----Exceution failed----");
		report.flush();
	}
}
