package com.orangehrm.seleniumuiframework.object_repo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeeDetails {
	
	 public AddEmployeeDetails(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
	

	@FindBy(name = "firstName")
	private WebElement firstName;

	@FindBy(name = "middleName")
	private WebElement middleName;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(xpath = "//label[.='Employee Id']/../..//input")
	private WebElement employeeId;

	@FindBy(xpath = "//p[.='Create Login Details']/../div//child::span")
	private WebElement loginToggle;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement userName;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmPassword;

	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String fname) {
		getFirstName().sendKeys(fname);
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String mname) {
		getMiddleName().sendKeys(mname);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lname) {
		getLastName().sendKeys(lname);
	}

	public WebElement getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String id) {
		getEmployeeId().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		getEmployeeId().sendKeys(id);
	}

	public WebElement getLoginToggle() {
		return loginToggle;
	}

	public void clickLoginToggle() {
		getLoginToggle().click();
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String uname) {
		getUserName().sendKeys(uname);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String pwd) {
		getPassword().sendKeys(pwd);
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String pwd) {
		getConfirmPassword().sendKeys(pwd);
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void clickSaveBtn() {
		getSaveBtn().click();
	}

	public void addEmployee(String fname, String mname, String lname, String id) {

		setFirstName(fname);
		setMiddleName(mname);
		setLastName(lname);
		setEmployeeId(id);
	}
	
	public void credential( String uname, String pwd1,String pwd2) {
		clickLoginToggle();
		setUserName(uname);
		setPassword(pwd1);
		setConfirmPassword(pwd2);
		clickSaveBtn();
		
	}

}
