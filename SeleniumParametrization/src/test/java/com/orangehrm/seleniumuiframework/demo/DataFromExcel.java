package com.orangehrm.seleniumuiframework.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataFromExcel {
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		FileInputStream fls = new FileInputStream("./src/test/resources/orangehrm.testscriptdata/Vacancies.xlsx");
		Workbook workbook = WorkbookFactory.create(fls);
		Sheet sheet = workbook.getSheet("Addvacancy");
		Iterator<Row> row = sheet.iterator();
		row.next();
		while (row.hasNext()) {
			Row r = row.next();
			for (int i = 1; i <r.getLastCellNum(); i++) {
				Cell c = r.getCell(i);
				if (c.getCellType() == CellType.STRING)
					System.out.println(c.getStringCellValue());
				else if (c.getCellType() == CellType.NUMERIC)
					System.out.println(c.getNumericCellValue());
			}
		}

		System.out.println("----------------------------------------");
		Iterator<Row> row1 = sheet.iterator();
		row1.next();
		while (row1.hasNext()) {
			Row r = row1.next();
			Cell c = r.getCell(1);
			if (c.getCellType() == CellType.STRING)
				System.out.println(c.getStringCellValue());
			else if (c.getCellType() == CellType.NUMERIC)
				System.out.println(c.getNumericCellValue());
		}

	}
}
