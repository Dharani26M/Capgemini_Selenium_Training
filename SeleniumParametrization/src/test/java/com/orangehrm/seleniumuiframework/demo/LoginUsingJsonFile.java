package com.orangehrm.seleniumuiframework.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginUsingJsonFile {

	WebDriver driver;

    @Test
    public void login() throws IOException{

    	String data = new String(Files.readAllBytes(Paths.get("./src/main/resources/Object.demorepository/loginpage.json")))	;
    	JSONObject obj = new JSONObject(data);
    	JSONObject loginPage = obj.getJSONObject("login");
    	//Extracting the data to check
    	String UserTextField = loginPage.getString("user");
    	String passwordTextField = loginPage.getString("pass");
    	String loginBtn=loginPage.getString("loginbtn");
    	
    	// Locators extracted from strings using split
    	String[] userLoc = UserTextField.split(":");
    	String[] passLoc = passwordTextField.split(":");
    	String[] loginBtnLoc = loginBtn.split(":");

    	// Test Script Initialization
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    	// Username handling
    	if (userLoc[0].equals("name")) {
    	    driver.findElement(By.name(userLoc[1])).sendKeys("Admin");
    	}

    	// Password handling
    	if (passLoc[0].equals("name")) {
    	    driver.findElement(By.name(passLoc[1])).sendKeys("admin123");
    	}

    	// Login button handling
    	if (loginBtnLoc[0].equals("cssSelector")) {
    	    driver.findElement(By.cssSelector(loginBtnLoc[1])).click();
    	}
    }
}
