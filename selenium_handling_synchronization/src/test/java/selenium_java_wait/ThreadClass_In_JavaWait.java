package selenium_java_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadClass_In_JavaWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:Amazon.in");
		Thread.sleep(4000);
		driver.navigate().to("https://www.ebay.com/");;
		Thread.sleep(2000, 20000);
		driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(Duration.ofSeconds(10));
		
		
	}

}
