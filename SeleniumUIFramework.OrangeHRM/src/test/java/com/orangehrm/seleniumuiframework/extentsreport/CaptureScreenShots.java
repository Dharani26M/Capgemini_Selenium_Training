package com.orangehrm.seleniumuiframework.extentsreport;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repo.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repo.LoginPage;
import com.orangehrm.seleniumuiframework.utilities.FileUtilities;
import com.orangehrm.seleniumuiframework.utilities.ScreenShotUtilities;
import com.orangehrm.seleniumuiframework.utilities.WebdriverUtility;

public class CaptureScreenShots {
	@Test(invocationCount =2)
	public void ScreenShot() throws IOException {
		WebDriver driver=new ChromeDriver();
		WebdriverUtility web=new WebdriverUtility(driver);
		web.WaitForAllElements(10);
		LoginPage lp=new LoginPage(driver);
		FileUtilities fu=new FileUtilities();
		DashBoardPage dsp=new DashBoardPage(driver);
		ScreenShotUtilities ssu=new ScreenShotUtilities();
		web.EnterUrl(fu.getPropertyKeyValue("url"));
		lp.setUsername(fu.getPropertyKeyValue("username"));
		lp.setPassword(fu.getPropertyKeyValue("password"));
		lp.ClickLoginBtn();
		System.out.println(ssu.CaptureScreenShotWebDriver(driver, "Fullpage"));
		System.out.println(ssu.CaptureScreenShotWebElement(dsp.getPIMPageLink(),"Element"));
		web.QuitBrowser();
		
		
		
	}
	
}
