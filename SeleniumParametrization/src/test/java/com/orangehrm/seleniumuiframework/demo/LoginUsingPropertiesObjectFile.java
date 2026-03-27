package com.orangehrm.seleniumuiframework.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingPropertiesObjectFile {
	WebDriver driver;
	@Test
	public void login() throws IOException {
		FileInputStream fis=new FileInputStream("./src/main/resources/Object.demorepository/Loginpage.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name(prop.getProperty("user").split(":")[1])).sendKeys("Admin");
		driver.findElement(By.name(prop.getProperty("pass").split(":")[1])).sendKeys("admin123");
		driver.findElement(By.cssSelector(prop.getProperty("loginbtn").split(":")[1])).click();
	}

}
