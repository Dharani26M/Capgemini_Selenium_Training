package com.orangehrm.seleniumuiframework.object_repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCandidatesPage {
	
	public AddCandidatesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstName")
	private WebElement Firstname;
	
	@FindBy(name = "middleName")
	private WebElement Middlename;
	
	@FindBy(name = "lastName")
	private WebElement LastName;
	
	@FindBy(xpath = "//div[text()='-- Select --']")
	private WebElement VacancyName;
	
	@FindBy(xpath = "//div[@role='listbox']")
	private WebElement VacancyContainer;
	
	@FindBy(xpath = "//label[text()='Email']/parent::div/following-sibling::div//input")
	private WebElement Email;
	
	@FindBy(xpath = "//label[.='Contact Number']/../following-sibling::div//input")
	private WebElement ContactNumber;
	
	@FindBy(css = "[type='file']")
	private WebElement Resume;
	
	@FindBy(css = "[placeholder='yyyy-dd-mm']")
	private WebElement Date;
	
	@FindBy(css = "[placeholder='Enter comma seperated words...']")
	private WebElement Keywords;
	
	@FindBy(css = "//label[.='Notes']/../following::div//textarea")
	private WebElement Notes;
	
	@FindBy(css = "[type='submit']")
	private  WebElement SaveButton;
	@FindBy(xpath = "//div[@role='row']//div[3]")
	private List<WebElement> candidatesList;
	@FindBy(xpath = "//button[.//i[contains(@class,'bi-chevron-right')]]")
	WebElement nextBtn;
	@FindBy(xpath = "//span[.='Recruitment']")
	private WebElement RequirementLink;
	
	@FindBy(xpath = "//a[.='Candidates']")
	WebElement canditatesLink;

	public WebElement getCanditatesLink() {
		return canditatesLink;
	}

	public void ClickCanditatesLink() {
		getCanditatesLink().click();
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public void EnterFirstname(String Firstname) {
		getFirstname().sendKeys(Firstname);
	}

	public WebElement getMiddlename() {
		return Middlename;
	}

	public void EnterMiddlename(String middlename) {
		getMiddlename().sendKeys(middlename);
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void EnterLastName(String lastName) {
		getLastName().sendKeys(lastName);
	}

	public WebElement getVacancyName() {
		return VacancyName;
	}

	public void ClickVacancyName() {
		getVacancyName().click();
	}

	public WebElement getVacancyContainer() {
		return VacancyContainer;
	}

	public void setVacancyContainer(String VacancyName) {
		WebElement item = getVacancyContainer().findElement(
				By.xpath(".//span[contains(.,'" + VacancyName + "')]"));
		item.click();
	}

	public WebElement getEmail() {
		return Email;
	}

	public void EnterEmail(String email) {
		getEmail().sendKeys(email);
	}

	public WebElement getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		getContactNumber().sendKeys(contactNumber);
	}
	
	public WebElement getRequirementPage() {
		return RequirementLink;
	}
	
	public void ClickRequirementPage() {
		getRequirementPage().click();
	}

	public WebElement getResume() {
		return Resume;
	}

	public void setResume(String resume) {
		getResume().sendKeys(resume);
	}

	public WebElement getDate() {
		return Date;
	}

	public void setDate(String date) {
		getDate().sendKeys(date);
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	public boolean CanditatesVerification(String name) {
		boolean flag = false;
		while (true) {
			for (WebElement row : candidatesList) {
				if (row.getText().contains(name)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
			if (nextBtn.isEnabled() && nextBtn.isDisplayed()) {
				nextBtn.click();
			} else {
				break;
			}
		}
		return flag;
	}

	public void ClickSaveButton() {
		getSaveButton().click();
	}
	
	public void AddName(String firstname,String middlename,String lastname) {
		EnterFirstname(firstname);
		EnterMiddlename(middlename);
		EnterLastName(lastname);
	}
	
	public void AddCandidates(String vacancyname, String email, String contact, String resume) {
		
		ClickVacancyName();
		setVacancyContainer(vacancyname);
		EnterEmail(email);
		setContactNumber(contact);
		setResume(resume);
	}
	public void AddDate(String date) {
		getDate().sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		setDate(date);
		ClickSaveButton();
	}
}
