package selenium_relative_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement name =driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("dino");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement email =driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
		email.sendKeys("dino@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement pass =driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
		pass.sendKeys("123123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pass)).click();
		
		
}

}
