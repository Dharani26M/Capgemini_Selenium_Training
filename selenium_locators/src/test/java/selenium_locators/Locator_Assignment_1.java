package selenium_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator_Assignment_1 {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.flipkart.com/");
	        Thread.sleep(4000);

	        //  Close login popup
	        driver.findElement(By.xpath("//span[text()='✕']"))
	              .click();

	        Thread.sleep(2000);

	        //  Click Login text
	        driver.findElement(By.xpath("//a[text()='Login']"))
	              .click();

	        Thread.sleep(2000);

	        //  Click Become a Seller
	        driver.findElement(By.xpath("//span[text()='Become a Seller']"))
	              .click();

	        Thread.sleep(3000);

	        //  Click Cart
	        driver.findElement(By.xpath("//button[text()='Start Selling']"))
	              .click();

	        Thread.sleep(3000);

	        //  Click Mobiles category
	        driver.findElement(By.xpath("//button[text()='Terms of Use']"))
	              .click();

	        Thread.sleep(5000);

	        driver.quit();
	    }
}
