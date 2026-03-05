package selenium_locators;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_In_Testcase_Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://youtube.com");
		driver1.findElement(By.name("search_query")).sendKeys("Troll op Bgmi",Keys.ENTER);
		Thread.sleep(3000);
		driver1.findElements(By.id("video-title")).get(0).click();
		Thread.sleep(4000);
		driver1.findElement(By.xpath("//button[contains(.,'Share')]")).click();
				
	}

}
