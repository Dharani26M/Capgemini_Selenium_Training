package com.saucelags.seleniumuiframework.pomutilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClassForSauce {  
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		opt.addArguments("--headless");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
	    driver.get("https://www.saucedemo.com/");
	}

}
