package com.orangehrm.seleniumuiframework.pim;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.utilities.BaseForOrangeHRM;

public class PimTest extends BaseForOrangeHRM {
	@Test(priority = 0)
	public void pimModule() {
		// adding employee details
		driver.findElement(By.cssSelector("[href='/web/index.php/pim/viewPimModule']")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']//button")).click();
		driver.findElement(By.name("firstName")).sendKeys("thirisha");
		driver.findElement(By.name("middleName")).sendKeys("vijay");
		driver.findElement(By.name("lastName")).sendKeys("keerthysuresh");
		WebElement empId = driver.findElement(By.xpath("(//label[text()='Employee Id']//following::input)[1]"));
		empId.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		empId.sendKeys("2026");
		driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::span")).click();
		driver.findElement(By.xpath("//label[text()='Username']//parent::div/following-sibling::div//input"))
				.sendKeys("vijay");
		driver.findElement(By.xpath("//label[text()='Enabled']")).click();
		WebElement pwd = driver.findElement(
				By.xpath("//label[text()='Password']/parent::div/following-sibling::div//input[@type='password']"));
		wait.until(ExpectedConditions.visibilityOf(pwd)).sendKeys("22Dec2023");
		driver.findElement(By.xpath(
				"//label[text()='Confirm Password']/parent::div/following-sibling::div//input[@type='password']"))
				.sendKeys("22Dec2023");
		driver.findElement(By.cssSelector("[type='submit']")).click();

		if (driver.findElement(By.cssSelector("[class='orangehrm-background-container']")).isDisplayed())
			Reporter.log("Employee Record Created", true);

		// checking employee details
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Admin']")))).click();
		driver.findElement(By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input"))
				.sendKeys("thirisha");
		WebElement usrRole = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		usrRole.click();
		usrRole.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

		WebElement empname = driver.findElement(By.cssSelector("[placeholder='Type for hints...']"));
		Actions a = new Actions(driver);
		a.click(empname).sendKeys("thirisha vijay").pause(2000).sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
		WebElement status = driver.findElement(By.xpath("//div[text()='-- Select --']"));
		a.click(status).pause(2000).sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}
}
