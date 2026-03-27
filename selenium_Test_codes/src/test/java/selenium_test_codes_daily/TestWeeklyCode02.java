package selenium_test_codes_daily;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeeklyCode02 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> li=window.iterator();
		String parent=li.next();
		String child=li.next();
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl().contains("orangehrm.com")?"URL is valid":"URL is not valid");
		System.out.println(driver.getTitle().isBlank()?"Title is not valid":"Title is valid");
		driver.close();
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl().equals(url)?"valid page":"invalid page");
		driver.quit();
	}

}
