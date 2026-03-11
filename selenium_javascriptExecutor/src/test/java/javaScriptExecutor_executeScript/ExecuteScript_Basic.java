package javaScriptExecutor_executeScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript_Basic {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
//		WebElement user = driver.findElement(By.name("username"));
//        WebElement pass = driver.findElement(By.name("password"));
//        WebElement btn  = driver.findElement(By.cssSelector("[type='submit']"));
//        String script = "arguments[0].value=arguments[1]; arguments[0].dispatchEvent(new Event('input', { bubbles: true }));";
//        js.executeScript(script, user, "Admin");
//        js.executeScript(script, pass, "admin123");
//        js.executeScript("arguments[0].click();", btn);
         

	}

}
