package selenium_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_TestCase_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[.='Employee Name']/parent::div/following::div/child::input")).sendKeys("albert");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Employee Name']/parent::div/following::div/child::input")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//button[contains(.,'Search')] ")).click();
		
	}

}
