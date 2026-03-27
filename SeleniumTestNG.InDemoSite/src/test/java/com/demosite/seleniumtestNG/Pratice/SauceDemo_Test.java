package com.demosite.seleniumtestNG.Pratice;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SauceDemo_Test extends BaseClass{
	@Test(priority = 0)
	public void login() {
		
		if(driver.getCurrentUrl().contains("www.saucedemo.com")) 
			Reporter.log("Login verified", true);
		else
			Reporter.log("Failed", true);
	}
	
	@Test(priority = 1)
	public void addtocart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> li=driver.findElements(By.className("cart_item"));
		Iterator<WebElement> it=li.iterator();
		String exp1=it.next().getText();
		String exp2=it.next().getText();
			if(exp1.contains("Backpack") && exp2.contains("Light"))
				Reporter.log("Both product is verified",true);
			else
				Reporter.log("failed", true);
		}
	
	
}
