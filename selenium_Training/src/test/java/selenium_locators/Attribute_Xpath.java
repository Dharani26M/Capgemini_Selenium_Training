package selenium_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
//		Driver.get("https://amazon.com/"); 
//		Thread.sleep(5000);
////		Driver.findElement(By.xpath("//span[text()='✕']")).click();
//		Driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Events/2026/Easter_26/AIS_Easter_Muse_QuadCards_2026_Exports_Easter26_15_Muse_Prod_melody_homepage_372x232_1X._SY116_CB786813666_.jpg']")).click();

		
		Driver.get("https://radio.garden/");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//div[@class='_welcomeIcon_1m2ix_48 _playButton_1m2ix_83']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.partialLinkText("Search")).click();
		Thread.sleep(2000);
		Driver.findElement(By.cssSelector("[placeholder=\"Country, City, Station\"]")).sendKeys("Chennai");
		Driver.findElement(By.xpath("//div[@data-jest-id='rowButtonTitle-Naan-FM rowButtonTitle']")).click();
		
		
		
		
		}

}
