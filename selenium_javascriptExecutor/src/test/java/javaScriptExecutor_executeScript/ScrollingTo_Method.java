package javaScriptExecutor_executeScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollingTo_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https:youtube.com");
		driver.findElement(By.cssSelector("[name='search_query']")).sendKeys("Troll op", Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='content-section']")));
		js.executeScript("window.scrollTo(0,6000)");
		js.executeScript("window.scrollTo(0,2000)");

	}

}
