package com.orangehrm.seleniumuiframework.object_repo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequirementPage {
	WebDriver driver;
	
	public RequirementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath = "//a[.='Vacancies']")
	private WebElement vacancyPage;

	@FindBy(xpath = "//a[.='Candidates']")
	private WebElement CandidatesPage;
	
	
	public WebElement getCandidatesPage() {
		return CandidatesPage;
	}
	

	public void ClickCandidatesPage() {
		getCandidatesPage().click();
	}
	
	
	public WebElement getVacancyPage() {
		return vacancyPage;
	}

	public void ClickVacancyPage() {
		getVacancyPage().click();
	}
	
}
