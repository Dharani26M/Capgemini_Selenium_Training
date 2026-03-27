package com.orangehrm.seleniumuiframework.pim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.utilities.BaseForOrangeHRM;

public class MyInfoTest extends BaseForOrangeHRM {
	@Test
	public void UpdateMyInfo() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(6000);
		WebElement first= driver.findElement(By.name("firstName"));
		first.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Thread.sleep(3000);
		first.sendKeys("Dinooo");
		WebElement middle= driver.findElement(By.name("middleName"));
		middle.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Thread.sleep(3000);
		middle.sendKeys("Di");
		WebElement last= driver.findElement(By.name("lastName"));
		last.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Thread.sleep(3000);
		last.sendKeys("U");
		WebElement emp= driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		emp.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Thread.sleep(3000);
		emp.sendKeys("20002", Keys.ENTER);
		driver.findElement(By.cssSelector("img[alt='profile picture']")).click();
		driver.findElement(By.linkText("Logout")).click();
		WebElement usrname = driver.findElement(By.name("username"));
		usrname.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement loginbtn = driver.findElement(By.cssSelector("[type='submit']"));
		loginbtn.click();
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(10000);
		WebElement first1= driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']"));
		Reporter.log(first1.getText(),true);
		Assert.assertEquals(first1.getText().contains("Dinooo"),true);
		
	}
}
