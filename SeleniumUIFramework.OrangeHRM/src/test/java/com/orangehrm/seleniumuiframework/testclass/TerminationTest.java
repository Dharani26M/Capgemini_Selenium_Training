package com.orangehrm.seleniumuiframework.testclass;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.utilities.BaseClass;

public class TerminationTest extends BaseClass{
	@Test
	public void AddTerminationReason() throws Exception {

		// click pim module
		dashpage.ClickPIMPageLink();

		// click on configuration dropdown
		pimpage.clickConfigBtn();

		// click on termination link
		pimpage.clickTerminationBtn();

		// click on add button
		terminatepage.clickAddBtn();

		// give termination reason
		terminatepage.setReason(excelutility.ReadData("Sheet4", 3, 1));

		// click on save button
		terminatepage.clickSaveBtn();

		boolean result = terminatepage.verifyTerminationReason(excelutility.ReadData("Sheet4", 3, 1));
		Assert.assertTrue(result, "Termination reason was NOT added");
	}
}
