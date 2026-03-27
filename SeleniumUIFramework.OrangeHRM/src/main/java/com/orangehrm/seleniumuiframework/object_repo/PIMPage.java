package com.orangehrm.seleniumuiframework.object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	 public PIMPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}

	 @FindBy(xpath = "//button[contains(.,'Add')]")
	 private WebElement PIMAddButton;

	public WebElement getPIMAddButton() {
		return PIMAddButton;
	}

	// configuration dropdown
		@FindBy(xpath = "//span[text()='Configuration ']")
		WebElement configDropdown;
	public void ClickPIMAddButton() {
		getPIMAddButton().click();
	}
	
	public WebElement getConfigBtn() {
		return configDropdown;
	}

	public void clickConfigBtn() {
		getConfigBtn().click();
	}
	// termination button
	@FindBy(linkText = "Termination Reasons")
	WebElement terminationbtn;

	public WebElement getTerminationBtn() {
		return terminationbtn;
	}

	public void clickTerminationBtn() {
		getTerminationBtn().click();
	}
}
