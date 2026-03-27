package com.orangehrm.seleniumuiframework.object_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVacancyPage {
	private WebDriver driver;
	
	// page factory with constructor
	public AddVacancyPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//vacancy name
	@FindBy(xpath = "//label[.='Vacancy Name']/../../child::div/following-sibling::div//input" )
	private WebElement VacancyName;
	
	//job title
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private WebElement JobTitle;
	
	// job title container
	@FindBy(xpath = "//div[@role='listbox']")
	private WebElement JobTitlelistboxContainer;
	
	//description box
	@FindBy(css = "[placeholder='Type description here']")
	private WebElement Description;
	
	//hiring manager
	@FindBy(css = "[placeholder='Type for hints...']")
	private WebElement HiringManger;
	
	// no of positions
	@FindBy(xpath = "(//label[.='Number of Positions']/../following::input)[1]")
	private WebElement NoOfPositions;
	
	//save button
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement SaveButton;
	
	//getter and setter for vacancy name
	public WebElement getVacancyName() {
		return VacancyName;
	}
	
	public void EnterVacancyName(String vacancyName) {
		getVacancyName().sendKeys(vacancyName);
	}
	
	//getter and setter for Job title
	public WebElement getJobTitle() {
		return JobTitle;
	}
	public void ClickJobTitle() {
		getJobTitle().click();
	}
	
	public WebElement getJobTitlelistboxContainer() {
		return JobTitlelistboxContainer;
	}
	public void setJobTitle(String roleName) {
		WebElement item = getJobTitlelistboxContainer().findElement(
				By.xpath(".//span[contains(.,'" + roleName + "')]"));
		item.click();
	}

	//getter and setter for Description
	public WebElement getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		getDescription().sendKeys(description);
	}
	
	//getter and setter for Hiring manager
	public WebElement getHiringManger() {
		return HiringManger;
	}
	public void SetHiringManager(String ManagerName) {
		// action method
		Actions al=new Actions(driver);
		getHiringManger().sendKeys(ManagerName);
		al.pause(3000).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
	}
	
	//getter and setter for No of position
	public WebElement getNoOfPositions() {
		return NoOfPositions;
	}
	public void setNoOfPositions(String noOfPositions) {
		getNoOfPositions().sendKeys(noOfPositions);
	}
	
	//getter and setter for save button
	public WebElement getSaveButton() {
		return SaveButton;
	}
	public void ClickSaveButton() {
		getSaveButton().click();
	}

	//Addvacancy Method
	public void AddVacancy(String vacancyname, String role, String des, String name, String pos) {
		EnterVacancyName(vacancyname);
		ClickJobTitle();
		setJobTitle(role);
		setDescription(des);
		SetHiringManager(name);
		setNoOfPositions(pos);
		ClickSaveButton();
	}
	
}


