package selenium_fileupload_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Popups_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\itsdh\\OneDrive\\Documents\\Capegemini Needed\\Dharani Raj M Engineering Semester 4.pdf");

	}

}
