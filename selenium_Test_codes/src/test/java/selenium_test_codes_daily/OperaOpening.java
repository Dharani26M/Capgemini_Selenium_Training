package selenium_test_codes_daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperaOpening {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        
        options.setBinary("C:\\Users\\itsdh\\Downloads\\OperaSetup.exe");
        
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

        System.out.println("Opera Browser Launched: " + driver.getTitle());
	}
}
