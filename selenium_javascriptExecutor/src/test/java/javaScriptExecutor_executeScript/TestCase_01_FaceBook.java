package javaScriptExecutor_executeScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase_01_FaceBook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		WebElement gen=driver.findElement(By
				.xpath("//div[@role='combobox' and starts-with(@id,'_R')]"));
		
		Actions act=new Actions(driver);
		act.click(gen)
		.pause(1000)
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER)
		.perform();
		js.executeScript("arguments[0].value='male'",
				driver.findElement(By.xpath("//input[@dir='ltr' and starts-with(@id,'_r_')]")));
	}

}
