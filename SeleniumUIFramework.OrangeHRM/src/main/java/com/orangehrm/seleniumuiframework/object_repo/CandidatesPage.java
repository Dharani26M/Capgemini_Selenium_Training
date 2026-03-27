package com.orangehrm.seleniumuiframework.object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandidatesPage {
	public CandidatesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement AddButtonInCandidates;

	public WebElement getAddButtonInCandidates() {
		return AddButtonInCandidates;
	}

	public void ClickAddButtonInCandidates() {
		getAddButtonInCandidates().click();
	}

}
