package com.orangehrm.seleniumuiframework.utilities;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.orangehrm.seleniumuiframework.object_repo.AddCandidatesPage;
import com.orangehrm.seleniumuiframework.object_repo.AddEmployeeDetails;
import com.orangehrm.seleniumuiframework.object_repo.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repo.CandidatesPage;
import com.orangehrm.seleniumuiframework.object_repo.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repo.LoginPage;
import com.orangehrm.seleniumuiframework.object_repo.PIMPage;
import com.orangehrm.seleniumuiframework.object_repo.RequirementPage;
import com.orangehrm.seleniumuiframework.object_repo.TerminatePage;
import com.orangehrm.seleniumuiframework.object_repo.VacancyPage;
@Listeners(com.orangehrm.seleniumuiframework.utilities.ListenerUtilities.class)
public class BaseClass {
	public WebdriverUtility webutility;
	public ExcelUtility excelutility;
	public FileUtilities fileutility;
	public WebDriver driver;
	public String browser;
	public WebDriverWait wait;
	public LoginPage loginpage = null;
	public DashBoardPage dashpage = null;
	public PIMPage pimpage = null;
	public AddEmployeeDetails addpage = null;
	public RequirementPage requirepage=null;
	public VacancyPage vacancypage=null;
	public AddVacancyPage addvacpage=null;
	public CandidatesPage canpage=null;
	public AddCandidatesPage addcanpage=null;
	public TerminatePage terminatepage=null;
	
	@BeforeSuite
	public void beforesuite() throws IOException {
		Reporter.log("--Executing Before suite--",true);
		
	}
 
	@BeforeTest
	public void beforetest() throws EncryptedDocumentException, IOException {
		Reporter.log("--Executing Before Test--",true);
		fileutility= new FileUtilities();
		browser= fileutility.getPropertyKeyValue("browser");
		if (browser.contains("chrome")) {
			ChromeOptions copt = new ChromeOptions();
			copt.addArguments("--incognito");
			driver = new ChromeDriver(copt);
		} else if (browser.contains("Edge")) {
			EdgeOptions eopt = new EdgeOptions();
			eopt.addArguments("--inprivate");
			driver = new EdgeDriver(eopt);
		}else if (browser.contains("firefox")) {
			FirefoxOptions fopt = new FirefoxOptions();
			fopt.addArguments("--private");
			driver = new FirefoxDriver(fopt);
		}
		webutility = new WebdriverUtility(driver); 
        excelutility = new ExcelUtility(driver);
		webutility.ConfigMaximizeBrowser();
		webutility.EnterUrl(fileutility.getPropertyKeyValue("url"));
		webutility.WaitForAllElements(18);
		loginpage =new LoginPage(driver);
		dashpage = new DashBoardPage(driver);
		pimpage = new PIMPage(driver);
		addpage = new AddEmployeeDetails(driver);
		requirepage=new RequirementPage(driver);
		vacancypage=new VacancyPage(driver);
		addvacpage=new AddVacancyPage(driver);
		canpage=new CandidatesPage(driver);
		addcanpage=new AddCandidatesPage(driver);
		terminatepage=new TerminatePage(driver);
		wait =new WebDriverWait(driver, Duration.ofSeconds(13));
		
	}
	
	@BeforeClass
	public void beforeclass() throws IOException {
		Reporter.log("--Executing Before class--",true);
		loginpage.setUsername(fileutility.getPropertyKeyValue("username"));
        loginpage.setPassword(fileutility.getPropertyKeyValue("password"));
        loginpage.ClickLoginBtn();
		
	}

	@BeforeMethod
	public void beforemethod() {
		Reporter.log("--Executing Before method--",true);
	}

	@AfterMethod
	public void aftermethod() {
		Reporter.log("--Execution of after class--",true);
	}

	@AfterClass
	public void afterclass() {
		Reporter.log("--Execution of after method--",true);
		dashpage.ClickUserProfile();
		webutility.WaitForToBeClickableOfElement(10, dashpage.getLogoutBtn());
		dashpage.clickLogoutBtn();
	}

	@AfterTest
	public void aftertest() {
		Reporter.log("--Execution of after test--",true);
		webutility.QuitBrowser();
	}

	@AfterSuite
	public void aftersuite() {
		Reporter.log("--Execution of after suite--",true);
	}
}
