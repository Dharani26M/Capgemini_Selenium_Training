package com.orangehrm.seleniumuiframework.testclass;

import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.utilities.BaseClass;

public class RequirementLinkCandidates extends BaseClass {
	@Test
	public void RequirementTest() throws ParseException {
		dashpage.ClickRequirementPage();
		requirepage.ClickCandidatesPage();
		canpage.ClickAddButtonInCandidates();
		addcanpage.AddName(excelutility.ReadData("Sheet2", 2, 0),
				excelutility.ReadData("Sheet2", 2, 1),
				excelutility.ReadData("Sheet2", 2, 2));
		addcanpage.AddCandidates(
				"Account",
				excelutility.ReadData("Sheet2", 2, 3),
				excelutility.ReadData("Sheet2", 2, 4),
				excelutility.ReadData("Sheet2", 2, 5));
		addcanpage.AddDate(excelutility.ReadData("Sheet2", 2, 6));
		addcanpage.ClickCanditatesLink();
		Assert.assertTrue(addcanpage.CanditatesVerification(excelutility.ReadData("Sheet2", 2, 0))," Canditate was NOT found in the table");
	}

}
