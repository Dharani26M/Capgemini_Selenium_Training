package selenium_relative_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_locators_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firstname=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstname.sendKeys("bharathi");
		WebElement last=driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model='LastName']")).toRightOf(firstname));
		last.sendKeys("s");
		WebElement add=driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model='Adress']")).below(firstname));
		add.sendKeys("chennai");
		WebElement butre=driver.findElement(RelativeLocator.with(By.id("Button1")).below(firstname));
		butre.click();

	}

}
