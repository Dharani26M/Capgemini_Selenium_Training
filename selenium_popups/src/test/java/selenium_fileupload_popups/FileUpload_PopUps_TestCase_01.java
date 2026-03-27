package selenium_fileupload_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_PopUps_TestCase_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.cssSelector("[title='Jobseeker Register']")).click();
		driver.findElement(By.xpath("(//div[@class='iconWrap'])[1]")).click();
		driver.findElement(By.cssSelector("[class='uploadAction']")).sendKeys("C:\\Users\\itsdh\\OneDrive\\Documents\\Capegemini Needed\\Dharani Raj M Resume.pdf");

	}

}
