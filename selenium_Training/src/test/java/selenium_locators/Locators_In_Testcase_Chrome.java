package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_In_Testcase_Chrome {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(.,'Create account')]")).click();
			Thread.sleep(3000);
			
			
			driver.get("https:chatgpt.com");
			Thread.sleep(3000);
			driver.findElement(By.id("prompt-textarea")).sendKeys("hello",Keys.ENTER);
			Thread.sleep(2000);
			
			driver.get("https:amazon.in");
			Thread.sleep(2000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moto g64",Keys.ENTER);
			Thread.sleep(2000);
			
			driver.get("https://www2.hm.com/en_in/index.html?srsltid=AfmBOooHNx6ZbbZrtt0NCn3QIlnkGD5HT_qj6fa4ZyAPGMw7IoINuL-y");
			Thread.sleep(7000);
			WebElement tab = driver.findElement(By.id("men"));
	        tab.sendKeys(Keys.ENTER);
	        Thread.sleep(2000);
	        
			driver.get("https://www.menfashion.com/?srsltid=AfmBOorFVI86aOjDZ-Tg6_QQQf9x1NU2qD4E7UPSqGSVHDfJrFS-L6od");
			Thread.sleep(7000);
			WebElement taab = driver.findElement(By.id("site-nav-item--1"));
	        taab.sendKeys(Keys.ENTER);
		}
}
