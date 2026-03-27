package com.orangehrm.seleniumuiframework.demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingxml {

    @Test
    public void login() throws SAXException, IOException, ParserConfigurationException {
        // Parse the XML File
    	Document file=DocumentBuilderFactory.newInstance().newDocumentBuilder()
    	              .parse(new File("./src/main/resources/Object.demorepository/loginpage.xml"));

        // Extract text values from XML tags
        String user = file.getElementsByTagName("UsernameField").item(0).getTextContent();
        String pass = file.getElementsByTagName("PasswordField").item(0).getTextContent();
        String btn= file.getElementsByTagName("LoginbtnField").item(0).getTextContent();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Login using the split logic
        
        // Username
        String[] userLoc = user.split(":");
        if (userLoc[0].equals("name")) {
            driver.findElement(By.name(userLoc[1])).sendKeys("Admin");
        }

        // Password
        String[] passLoc = pass.split(":");
        if (passLoc[0].equals("name")) {
            driver.findElement(By.name(passLoc[1])).sendKeys("admin123");
        }

        // Login Button
        String[] btnLoc = btn.split(":");
        if (btnLoc[0].equals("css")) {
            driver.findElement(By.cssSelector(btnLoc[1])).click();
        }

        driver.quit();
    }
}