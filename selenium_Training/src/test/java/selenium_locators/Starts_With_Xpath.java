package selenium_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Starts_With_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.xpath("//a[starts-with(text(),'digital')]")).click();
		
		
		driver.findElement(By.xpath("//input[contains(@type,'button') and contains(@value,'Subscribe')]")).click();
		// this is normal  and or xpath 
		
		
		driver.findElement(By.xpath("//strong[.='Categories']/../..//a[contains(.,'Digital downloads')]")).click();
		// this is used to access, if we accessing a particular tag and we need to go to parent tag and need to come to another tag means this command
		
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/digital-downloads']")).click();
		// using this we can access for , if we using the tag and we need to acess inside another means this commannd
		
		
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[starts-with(@data-csa-c-slot-id,'nav_cs_4')]")).click();

	}

}
