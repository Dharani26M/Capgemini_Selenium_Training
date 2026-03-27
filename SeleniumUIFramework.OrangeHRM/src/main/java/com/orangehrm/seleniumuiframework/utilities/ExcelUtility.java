package com.orangehrm.seleniumuiframework.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelUtility {
    WebDriver driver;
    Workbook workbook;

    public ExcelUtility(WebDriver driver) throws EncryptedDocumentException, IOException {
        this.driver = driver;
        FileInputStream fls = new FileInputStream("./src/test/resources/orangehrm.commondata/Vacancies.xlsx");
        workbook = WorkbookFactory.create(fls);
    }

    public String ReadData(String sheetName, int row, int col) {
        Cell cell = workbook.getSheet(sheetName).getRow(row).getCell(col);
        if (cell == null) return "";

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();

            case NUMERIC:
                double val = cell.getNumericCellValue();
                if (val == (long) val) {
                    return String.valueOf((long) val);
                } else {
                    return String.valueOf(val);
                }

            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());

            case FORMULA:
                return cell.getCellFormula();

            case BLANK:
                return "";

            default:
                return cell.toString();
        }
    }
}