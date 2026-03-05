package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Multiple_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Explore more")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='X Path']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(.,'Duplicate Elements')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Samsung']/..//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.=' RedMi ']/..//input[@type='checkbox']")).click();


	}

}
