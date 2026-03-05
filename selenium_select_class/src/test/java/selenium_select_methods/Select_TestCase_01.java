package selenium_select_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_TestCase_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://demoqa.com/select-menu");
		System.out.println(new Select(driver.findElement(By.id("oldSelectMenu"))).isMultiple());
		System.out.println(new Select(driver.findElement(By.id("cars"))).isMultiple());
	}

}
