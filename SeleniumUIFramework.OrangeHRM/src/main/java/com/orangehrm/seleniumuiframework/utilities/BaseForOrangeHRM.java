package com.orangehrm.seleniumuiframework.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.orangehrm.seleniumuiframework.object_repo.AddCandidatesPage;
import com.orangehrm.seleniumuiframework.object_repo.AddEmployeeDetails;
import com.orangehrm.seleniumuiframework.object_repo.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repo.CandidatesPage;
import com.orangehrm.seleniumuiframework.object_repo.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repo.LoginPage;
import com.orangehrm.seleniumuiframework.object_repo.PIMPage;
import com.orangehrm.seleniumuiframework.object_repo.RequirementPage;
import com.orangehrm.seleniumuiframework.object_repo.VacancyPage;

public class BaseForOrangeHRM {
	public WebDriver driver = null;
	public WebDriverWait wait = null;
	public DashBoardPage dashpage = null;
	public LoginPage loginpage = null;
	public PIMPage pimgage = null;
	public AddEmployeeDetails addpage = null;
	public RequirementPage requirepage=null;
	public VacancyPage vacancypage=null;
	public AddVacancyPage addvacpage=null;
	public CandidatesPage canpage=null;
	public AddCandidatesPage addcanpage=null;
	public Properties prop;
	public FileInputStream fls;
	public String browser;
	
	

	@BeforeSuite
	public void beforesuite() throws IOException {
		System.out.println("--Executing Before suite--");
		fls=new FileInputStream("./src/test/resources/orangehrm.commondata/common.properties");
		prop=new Properties();
		prop.load(fls);
	}
 
//	@Parameters("browser")
	@BeforeTest
	public void beforetest() {
		browser= prop.getProperty("browser");
		if (browser.contains("chrome")) {
			ChromeOptions copt = new ChromeOptions();
			copt.addArguments("--incognito");
//			copt.addArguments("--headless");
			driver = new ChromeDriver();
		} else if (browser.contains("Edge")) {
			EdgeOptions eopt = new EdgeOptions();
			eopt.addArguments("--inprivate");
			eopt.addArguments("--headless");
			driver = new EdgeDriver(eopt);
		}
		else if (browser.contains("firefox")) {
			FirefoxOptions fopt = new FirefoxOptions();
			fopt.addArguments("--private");
			fopt.addArguments("--headless");
			driver = new FirefoxDriver(fopt);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get(prop.getProperty("url"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		dashpage = new DashBoardPage(driver);
		loginpage = new LoginPage(driver);
		pimgage = new PIMPage(driver);
		addpage = new AddEmployeeDetails(driver);
		requirepage=new RequirementPage(driver);
		vacancypage=new VacancyPage(driver);
		addvacpage=new AddVacancyPage(driver);
		canpage=new CandidatesPage(driver);
		addcanpage=new AddCandidatesPage(driver);

	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("--Executing Before class--");
		loginpage.setUsername(prop.getProperty("username"));
        loginpage.setPassword(prop.getProperty("password"));
        loginpage.ClickLoginBtn();
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("--Executing Before method--");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("--Execution of after class--");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("--Execution of after method--");
		dashpage.ClickUserProfile();
		wait.until(ExpectedConditions.elementToBeClickable(dashpage.getLogoutBtn()));
		dashpage.clickLogoutBtn();
	}

	@AfterTest
	public void aftertest() {
		System.out.println("--Execution of after test--");
		driver.quit();
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("--Execution of after suite--");
	}
}
