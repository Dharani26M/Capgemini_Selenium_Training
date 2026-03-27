package com.orangehrm.seleniumuiframework.object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacancyPage {
	public VacancyPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement AddButtonInVacancy;

	public WebElement getAddButtonInVacancy() {
		return AddButtonInVacancy;
	}

	public void ClickAddButtonInVacancy() {
		getAddButtonInVacancy().click();
	}
	
	
	
}
