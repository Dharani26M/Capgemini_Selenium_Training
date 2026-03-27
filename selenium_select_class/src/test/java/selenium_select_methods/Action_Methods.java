package selenium_select_methods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Methods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://demo.automationtesting.in/Static.html");
		WebElement drag=driver.findElement(By.xpath("//img[@src='logo.png']"));
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, driver.findElement(By.id("droparea"))).perform();
		
		act.clickAndHold(driver.findElement(By.xpath("(//img[@src='original.png'])[2]")))
		.moveToElement(driver.findElement(By.id("droparea")))
		.release()
		.perform();
	
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		act.clickAndHold(driver.findElement(By.id("circle")))
		.perform();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		act.moveToElement(driver.findElement(By.cssSelector("[src='/assets/message-hint-nbRmWGWf.png']")))
		.perform();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		WebElement dm=driver.findElement(By.xpath("//div[text()='Drag Me']"));
		System.out.println(dm.getRect().x);
		System.out.println(dm.getRect().y);
		act.clickAndHold(dm)
		.moveByOffset(700,320)
		.release()
		.perform();
		

	}

}
