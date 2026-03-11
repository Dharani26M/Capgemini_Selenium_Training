package selenium_explicit_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_IN_HiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		driver.findElement(By.xpath("//button[contains(.,'Start')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Pause')]"))).click();
		driver.quit();

	}

}
