package com.orangehrm.seleniumuiframework.testclass;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.utilities.BaseClass;

public class AddToEmployeeTest  extends BaseClass{
	
	@Test
	public void add() {
		dashpage.ClickPIMPageLink();
		pimpage.ClickPIMAddButton();
		wait.until(ExpectedConditions.elementToBeClickable(addpage.getLoginToggle()));
		addpage.addEmployee(excelutility.ReadData("Sheet3",3, 0),
				excelutility.ReadData("Sheet3",3, 1),
				excelutility.ReadData("Sheet3",3, 2),
				excelutility.ReadData("Sheet3",3, 3));
		addpage.credential(excelutility.ReadData("Sheet3",3, 4),
				excelutility.ReadData("Sheet3",3, 5),
				excelutility.ReadData("Sheet3",3, 5));
		wait.until(ExpectedConditions.urlContains("viewPersonalDetails"));
		Assert.assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"),"Employee not found");
	}

}
