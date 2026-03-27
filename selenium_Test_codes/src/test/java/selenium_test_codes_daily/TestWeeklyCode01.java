package selenium_test_codes_daily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeeklyCode01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
		String url="https://icehrmpro.gamonoid.com/login.php";
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(" ");
		driver.findElement(By.id("password")).sendKeys(" ");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		System.out.println(driver.findElement(By.xpath("(//div[contains(.,'Login failed')])[9]")).isDisplayed()?"error is displayed":"error is not displayed");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("adm");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		System.out.println(driver.findElement(By.xpath("(//div[contains(.,'Login failed')])[9]")).isDisplayed()?"error is displayed":"error is not displayed");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		System.out.println(driver.getCurrentUrl().contains("dashboard")?"Page is valid":"page is not valid");
		driver.findElement(By.xpath("//li[@ref='admin_Employees']//a[@href='#']")).click();
		driver.findElement(By.xpath("(//a[@href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees'])[1]")).click();
		driver.findElement(By.xpath("//a[.='Skills']")).click();
		driver.findElement(By.xpath("//span[.=' Add New']")).click();
		driver.findElement(By.xpath("(//button[.='Cancel'])[3]")).click();
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']/*[1]")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		System.out.println((driver.getCurrentUrl().contains("logout"))?"Logout is displayed":"logout is not displayed");
		
	}

}
