package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator_Assignment_2 {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.flipkart.com/");
	        Thread.sleep(3000);

	        // Close Login Popup using contains(text())
	        driver.findElement(By.xpath("//span[contains(text(),'✕')]"))
	              .click();

	        Thread.sleep(2000);

	        //  Click Search Box using contains(attribute)
	        driver.findElement(By.xpath("//input[contains(@class,'nw1UBF v1zwn25')]"))
	              .sendKeys("Laptop");

	        Thread.sleep(2000);

	        //  Click Search Button using contains(attribute)
	        driver.findElement(By.xpath("//button[contains(@type,'submit')]"))
	              .click();

	        Thread.sleep(3000);

	        //  Click First Product using contains(class)
	        driver.findElement(By.xpath("(//div[contains(@class,'RG5Slk')])[1]"))
	              .click();

	        Thread.sleep(3000);

	        //  Click Cart using contains(text())
	        driver.findElement(By.xpath("//span[contains(text(),'Cart')]"))
	              .click();

	        Thread.sleep(5000);

	        driver.quit();
	    }
	}

