package selenium_explicit_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_In_DemoSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(38));
		driver.get("https://demo.automationtesting.in/Loader.html");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='loader']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Save changes']"))).click();
		driver.quit();
	}

}
