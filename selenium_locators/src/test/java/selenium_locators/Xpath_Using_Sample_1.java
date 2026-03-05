package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Using_Sample_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Explore more")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[placeholder=\"Enter your name\"]")).sendKeys("Dharani");
		driver.findElement(By.cssSelector("[placeholder=\"Enter Your Email\"]")).sendKeys("Dharani26@gmail.com");
		driver.findElement(By.cssSelector("[placeholder=\"Enter your password\"]")).sendKeys("Dharani26",Keys.ENTER);
		
//	or 
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("name")).sendKeys("Dharani");
//		driver.findElement(By.id("email")).sendKeys("Dharani26@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Dharani26",Keys.ENTER);
	}

}
