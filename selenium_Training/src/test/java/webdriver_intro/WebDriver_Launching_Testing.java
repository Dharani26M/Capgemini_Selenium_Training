package webdriver_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriver_Launching_Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browser="Edge";
		WebDriver Driver=null;
		if(browser.equals("Chrome")) {
			Driver=new ChromeDriver();
		}
		
		if(browser.equals("Edge")) {
			Driver=new EdgeDriver();
		}
		Driver.get("https:google.com");
		Thread.sleep(2000);
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		Driver.quit();
	}

}
