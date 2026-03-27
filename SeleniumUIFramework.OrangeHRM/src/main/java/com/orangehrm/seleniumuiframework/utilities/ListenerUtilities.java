package com.orangehrm.seleniumuiframework.utilities;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ListenerUtilities implements ITestListener {
	ExtentReports reports=ExtentReportUtility.getExtentInstance() ;
	ThreadLocal<ExtentTest> test=new ThreadLocal<ExtentTest>();
	ScreenShotUtilities sc = new ScreenShotUtilities();
	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest et=reports.createTest(result.getMethod().getMethodName());
		test.set(et);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test Status : Pass");
		Object obj =result.getInstance();
		BaseClass bc=(BaseClass)obj;
		WebDriver driver=bc.driver;
		
		try {
			test.get().addScreenCaptureFromPath(sc.CaptureScreenShotWebDriver(driver,result.getMethod().getMethodName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.get().fail("Test Status : Fail");
		test.get().fail(result.getThrowable());
		Object obj =result.getInstance();
		BaseClass bc=(BaseClass)obj;
		WebDriver driver=bc.driver;
		
		try {
			test.get().addScreenCaptureFromPath(sc.CaptureScreenShotWebDriver(driver,result.getMethod().getMethodName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
