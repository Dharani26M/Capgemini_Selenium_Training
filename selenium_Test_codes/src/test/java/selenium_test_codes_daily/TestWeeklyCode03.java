package selenium_test_codes_daily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeeklyCode03 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();
		System.out.println(driver.getCurrentUrl().contains("dashboard")?"Page is valid":"page is not valid");
		driver.findElement(By.xpath("//li[@ref='admin_Employees']//a[@href='#']")).click();
		driver.findElement(By.xpath("//ul[@id='admin_Employees']//child::a[contains(.,' Employees')]")).click();
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		WebElement dept= driver.findElement(By.xpath("//input[@id='rc_select_5']"));
		dept.click();
		dept.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//span[.='Save']")).click();
		System.out.println("Vaild is sucessfully Department = Marketing Department:"+driver.findElement(By.xpath("//span[.='Department = Marketing Department']")).isDisplayed());
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		WebElement job= driver.findElement(By.xpath("//input[@id='rc_select_7']"));
		job.click();
		job.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//span[.='Save']")).click();
		System.out.println("Vaild is sucessfully Job Title = Project Manager | Department = Marketing Department :"+driver.findElement(By.xpath("//span[.='Job Title = Project Manager | Department = Marketing Department']")).isDisplayed());
		driver.findElement(By.xpath("//li[@class='dropdown user user-menu']/*[1]")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
	}
}
