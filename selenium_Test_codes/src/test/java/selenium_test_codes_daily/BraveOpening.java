package selenium_test_codes_daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BraveOpening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	        WebDriverManager.chromedriver().setup();

	        ChromeOptions options = new ChromeOptions();
	        
	        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

	        WebDriver driver = new ChromeDriver(options);
	        driver.get("https://www.google.com");
	        
	        System.out.println("Brave Browser Launched: " + driver.getTitle());

	}

}
