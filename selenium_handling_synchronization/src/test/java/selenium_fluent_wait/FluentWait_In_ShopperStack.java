package selenium_fluent_wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait_In_ShopperStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://www.shoppersstack.com/products_page/34");
		driver.findElement(By.id("Check Delivery")).sendKeys("123445");
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofMillis(200))
				.withTimeout(Duration.ofSeconds(18))
				.ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();

	}

}
