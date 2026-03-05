package webdriver_intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Switching_SessionID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		Driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		Set<String> win=Driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String parentid=it.next();
		String childid=it.next();
		Driver.switchTo().window(childid);	
		Driver.close();

	}

}
