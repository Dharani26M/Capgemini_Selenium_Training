package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Xpath_Sample_Deletion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Dinoo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@class='oxd-form']/child::div[4]/child::button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@class='oxd-form']/following::button[3]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Yes, Delete')] ")).click();

	}

}
