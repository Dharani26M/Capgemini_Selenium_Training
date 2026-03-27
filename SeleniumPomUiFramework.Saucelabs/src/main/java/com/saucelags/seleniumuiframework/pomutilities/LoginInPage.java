package com.saucelags.seleniumuiframework.pomutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInPage {

	WebDriver driver;

    // Constructor to initialize the driver
    public LoginInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.username.sendKeys(password);
	}

	// Locators
    @FindBy(id="user-name")private WebElement username;
    @FindBy(id="password")private WebElement password;
    @FindBy(id="login-button")private WebElement loginBtn;
    
   

    // Business logic (Login actions)
    public void loginclick() {
    	loginBtn.click();
    }
}
