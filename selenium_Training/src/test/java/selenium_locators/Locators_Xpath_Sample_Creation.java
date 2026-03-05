package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Xpath_Sample_Creation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type=\"button\" and @class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Dinoo");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Dinoo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Email']/../..//input[@placeholder='Type here']")).sendKeys("Dinoo@gmail.com");
		driver.findElement(By.xpath("//label[.='Contact Number']/../..//input[@placeholder='Type here']")).sendKeys("6767676767",Keys.ENTER);
		Thread.sleep(5000);

	}

}
