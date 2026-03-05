package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_Xpath_Axes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//font[.='Offers']/parent::h2/parent::div/following::div/following::a")).click();

	}

}
