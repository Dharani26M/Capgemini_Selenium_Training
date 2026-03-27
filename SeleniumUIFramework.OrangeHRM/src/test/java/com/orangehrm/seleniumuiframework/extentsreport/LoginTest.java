package com.orangehrm.seleniumuiframework.extentsreport;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumuiframework.object_repo.LoginPage;

public class LoginTest {
	@Test
	public void login() throws IOException {

		// Extent Report setup
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/login_report.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(spark);

		ExtentTest test = reports.createTest("Login Test");

		// Load properties file
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonResources/common.properties");
		Properties prop = new Properties();
		prop.load(fis);

		// Browser setup
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		LoginPage lp = new LoginPage(driver);
		test.info("Browser launched");

		// Open URL
		driver.get(prop.getProperty("url"));
		test.info("Navigated to URL");

		// Login actions
		lp.setUsername(prop.getProperty("username"));
		test.pass("Entered Username");

		lp.setPassword(prop.getProperty("password"));
		test.pass("Entered Password");

		lp.ClickLoginBtn();
		test.pass("Clicked Login Button");

		// Simple validation
		if (driver.getCurrentUrl().contains("dashboard")) {
			test.pass("Login Successful");
		} else {
			test.fail("Login Failed");
		}

		// close
		driver.quit();
		reports.flush();

	}

}
