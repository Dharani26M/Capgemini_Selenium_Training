package com.orangehrm.seleniumuiframework.object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	// Locating username
	@FindBy(name = "username")
	private WebElement username;

	// Locating username
	@FindBy(name = "password")
	private WebElement password;

	// Locating loginbtn
	@FindBy(css = "[type='submit']")
	private WebElement loginBtn;

	// Locating linkedlin
	@FindBy(css = "[href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement linkedin;

	// Locating facebook
	@FindBy(css = "[href='https://www.facebook.com/OrangeHRM/']")
	private WebElement facebook;

	// Locating twitter
	@FindBy(css = "[href='https://twitter.com/orangehrm?lang=en\']")
	private WebElement twitter;

	// Locating youtube
	@FindBy(css = "[href='https://www.youtube.com/c/OrangeHRMInc']")
	private WebElement youtube;

	// getter and setter for loginBtn WebElements
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void ClickLoginBtn() {
		getLoginBtn().click();
	}

	// getter and setter for linkedin WebElements
	public WebElement getLinkedin() {
		return linkedin;
	}

	public void ClickLinkedin() {
		getLinkedin().click();
	}

	// getter and setter for facebook WebElements
	public WebElement getFacebook() {
		return facebook;
	}

	public void ClickFacebook() {
		getFacebook().click();
	}

	// getter and setter for Twitter WebElements
	public WebElement getTwitter() {
		return twitter;
	}

	public void ClickTwitter() {
		getTwitter().click();
	}

	// getter and setter for youtube WebElements
	public WebElement getYoutube() {
		return youtube;
	}

	public void ClickYoutube() {
		getYoutube().click();
	}

	// getter and setter for Username WebElements
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String username) {
		getUsername().sendKeys(username);
	}

	// getter and setter for Password WebElements
	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		getPassword().sendKeys(password);
	}

}
