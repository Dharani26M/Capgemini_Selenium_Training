package com.orangehrm.seleniumuiframework.demo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderOrangeHrm {
	@DataProvider(name = "LoginData")
	Object[][]getcrendtial(){
		return new Object[][] {
			{"Admin","admin123"}
		};
	}
	@Test(dataProvider = "LoginData")
	public void login(String key,String value) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(key);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(value,Keys.ENTER);
		driver.quit();
	}
}
