package selenium_test_codes_daily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeeklyCode04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		WebElement dr = driver.findElement(By.xpath("((//div[@class='oxd-select-text-input'])[1])"));
		dr.click();
		dr.sendKeys(Keys.ARROW_DOWN);
		dr.sendKeys(Keys.ENTER);
		System.out.println("Admin is displayed :"+dr.isDisplayed());
		dr.click();
		dr.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		dr.sendKeys(Keys.ENTER);
		System.out.println("Ess is displayed :"+dr.isDisplayed());
		driver.findElement(By.xpath("//button[contains(.,'Cancel')] ")).click();
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		driver.quit();

	}

}
