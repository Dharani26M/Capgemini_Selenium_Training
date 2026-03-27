package com.orangehrm.seleniumuiframework.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtilities {
	
	public String CaptureScreenShotWebDriver( WebDriver driver,String FileName) {
		String timestamp = new SimpleDateFormat("yy-MM-dd_HH-mm-ss").format(new Date());
		String path="./Reports/"+FileName+"_"+timestamp+".png";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			FileHandler.copy(src, dest);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dest.getAbsolutePath();
	}
	public String CaptureScreenShotWebElement(WebElement element, String FileName) {
		String timestamp = new SimpleDateFormat("yy-MM-dd_HH-mm-ss").format(new Date());
		String path="./Reports/"+FileName+"_"+timestamp+".png";
		File src=element.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			FileHandler.copy(src, dest);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dest.getAbsolutePath();
	}
}
