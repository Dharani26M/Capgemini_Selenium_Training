package com.orangehrm.seleniumuiframework.requirement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.utilities.BaseForOrangeHRM;

public class RequirementLinkTest extends BaseForOrangeHRM {
	@Test
	public void Requirement() {
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		// first name, second name , and last name
		driver.findElement(By.xpath("//button[.=' Add ']")).click();
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Dinoo");
		WebElement middlename = driver.findElement(RelativeLocator.with(By.name("middleName")).toRightOf(firstname));
		middlename.sendKeys("Di");
		driver.findElement(RelativeLocator.with(By.name("lastName")).toRightOf(middlename)).sendKeys("U");
		// vacancy drop down
		WebElement vacancy = driver.findElement(By.xpath("//div[text()='-- Select --']"));
		vacancy.click();
		vacancy.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		// email ID
		WebElement emailID = driver
				.findElement(By.xpath("//label[text()='Email']/parent::div/following-sibling::div//input"));
		emailID.sendKeys("Dinooo@gmail.com");

		// contact number
		driver.findElement(RelativeLocator.with(By.cssSelector("[placeholder='Type here']")).toRightOf(emailID))
				.sendKeys("7904399332");
		// selecting file
		driver.findElement(By.cssSelector("[type='file']")).sendKeys(
				"C:\\Users\\itsdh\\OneDrive\\Documents\\Capegemini Needed\\Dharani Raj M Resume.pdf");
		// selecting date
		WebElement date = driver.findElement(By.cssSelector("[placeholder='yyyy-dd-mm']"));
		date.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		date.sendKeys("2026-12-03");

		// clicking save btn
		driver.findElement(By.cssSelector("[type='submit']")).click();

		// clicking on candidates
		driver.findElement(By.linkText("Candidates")).click();
		// selecting jobtitle dropdown
		WebElement jobtitle = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		a.click(jobtitle).pause(2000).sendKeys(Keys.ARROW_DOWN).click().perform();
		// selecting job vacancy
		WebElement jobvacancy = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
		jobvacancy.click();
		jobvacancy.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		// selecting Hiring Manager
		WebElement hiringmanager = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]"));
		hiringmanager.click();
		driver.findElement(By.xpath("//span[contains(.,'John')]")).click();
		// selecting status
		WebElement status = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[4]"));
		status.click();
		status.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		// enter employee name
		WebElement empname = driver.findElement(By.cssSelector("[placeholder='Type for hints...']"));
		empname.sendKeys("Dinoo");
		a.pause(3000).sendKeys(empname, Keys.ARROW_DOWN, Keys.ENTER).perform();
		// enter from date
		WebElement fromdate = driver.findElement(By.cssSelector("[placeholder='From']"));
		fromdate.sendKeys("2026-08-03");
		// enter to date
		WebElement todate = driver.findElement(By.cssSelector("[placeholder='To']"));
		todate.sendKeys("2026-15-03");
		// click search btn
		driver.findElement(By.cssSelector("[type='submit']")).click();

		// verification
//		String emp = driver.findElement(By.xpath("(//div[@role='row'])[2]")).getText();
//		Assert.assertEquals(emp.contains("Dinoo"),true);
//		Reporter.log("employee data verified", true);
	}
}
