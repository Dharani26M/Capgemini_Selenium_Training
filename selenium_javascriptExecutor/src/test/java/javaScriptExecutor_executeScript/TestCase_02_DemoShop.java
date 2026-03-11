package javaScriptExecutor_executeScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_02_DemoShop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demowebshop.tricentis.com/");
		js.executeScript("arguments[0].value='mobile'", driver.findElement(By.id("small-searchterms")));
	}

}
