package com.orangehrm.seleniumuiframework.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtilities {

	WebDriver driver;
	Actions action;

	public ActionUtilities(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
	}

	// pause
	public void pauseOnAction(long timeInSeconds) {
		action.pause(timeInSeconds);
	}

	// Click using Actions
	public void clickOnElement(WebElement element) {
		action.click(element).perform();
	}

	// SendKeys using Actions
	public void sendKeys(WebElement element, String value) {
		action.sendKeys(element, value).perform();
	}
	
	//keys down
	public void navigateDownDropdown(WebElement element, int count,long milliseconds) {
		Actions a=action.click(element).pause(milliseconds);
		for(int i=1;i<=count;i++) {
			a.sendKeys(Keys.ARROW_DOWN);
		}
		a.perform();
	}
}
