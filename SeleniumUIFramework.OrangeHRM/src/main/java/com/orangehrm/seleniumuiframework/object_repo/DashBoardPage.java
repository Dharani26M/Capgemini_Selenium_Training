package com.orangehrm.seleniumuiframework.object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	 public DashBoardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[href='/web/index.php/pim/viewPimModule']")
	private WebElement PIMPageLink;
	
	@FindBy(xpath = "//span[.='Recruitment']")
	private WebElement RequirementLink;
	
	@FindBy(css = "[class='oxd-userdropdown-img']")
	private WebElement UserProfile;
	
	
	@FindBy(linkText = "Logout")
	private WebElement LogoutBtn;

	public WebElement getPIMPageLink() {
		return PIMPageLink;
	}

	public void ClickPIMPageLink() {
		getPIMPageLink().click();
	}

	public WebElement getRequirementPage() {
		return RequirementLink;
	}
	
	public void ClickRequirementPage() {
		getRequirementPage().click();
	}
	
	public WebElement getUserProfile() {
		return UserProfile;
	}

	public void ClickUserProfile() {
		getUserProfile().click();
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}

	public void clickLogoutBtn() {
		getLogoutBtn().click();
	}
}
