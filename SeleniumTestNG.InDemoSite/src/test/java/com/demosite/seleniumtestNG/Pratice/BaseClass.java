package com.demosite.seleniumtestNG.Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver=null;
	@BeforeSuite
	public void beforesuite() {
		System.out.println("--Executing Before suite--");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("--Executing Before Test--");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
	    driver = new ChromeDriver(options); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("--Executing Before Class--");
	    driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("--Executing Before method--");
	}	
	@AfterMethod
	public void aftermethod() {
		System.out.println("--Execution of after class--");
	}	
	@AfterClass
	public void afterclass() {
		System.out.println("--Execution of after method--");
		driver.navigate().back();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@AfterTest
	public void aftertest() {
		System.out.println("--Execution of after test--");
//		driver.quit();
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("--Execution of after suite--");
	}
}
