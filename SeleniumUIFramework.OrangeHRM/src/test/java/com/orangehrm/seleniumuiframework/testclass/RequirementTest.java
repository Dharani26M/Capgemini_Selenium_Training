package com.orangehrm.seleniumuiframework.testclass;


import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.utilities.BaseClass;

public class RequirementTest extends BaseClass{

	@Test
	public void Requirement() {
		dashpage.ClickRequirementPage();
		requirepage.ClickVacancyPage();
		vacancypage.ClickAddButtonInVacancy();
		addvacpage.AddVacancy(excelutility.ReadData("Sheet1", 2, 1),
				excelutility.ReadData("Sheet1", 2, 2),
				excelutility.ReadData("Sheet1", 2, 3),
				excelutility.ReadData("Sheet1", 2, 4),
				excelutility.ReadData("Sheet1", 2, 5));
		
		
	}
}
