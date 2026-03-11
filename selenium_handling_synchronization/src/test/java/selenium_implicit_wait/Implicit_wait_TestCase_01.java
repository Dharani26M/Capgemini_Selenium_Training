package selenium_implicit_wait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait_TestCase_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		driver.findElement(By.xpath("//a[.='YouTube']")).click();
		Set<String> si=driver.getWindowHandles();
		Iterator<String> li=si.iterator();
		while(li.hasNext()) {
			driver.switchTo().window(li.next());

		}
		
		

	}

}
