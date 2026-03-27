package com.orangehrm.seleniumuiframework.utilities;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	WebDriver driver;
	WebDriverWait wait;
	public WebdriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	// maximize browser
	public void ConfigMaximizeBrowser() {
		driver.manage().window().maximize();
	}
	// minimize browser
	public void ConfigMinmizeBrowser() {
		driver.manage().window().minimize();
	}
	// Full screen browser
	public void ConfigFullscreenBrowser() {
		driver.manage().window().fullscreen();
	}
	// Get Dimension 
	public Dimension FetchBrowserSize() {
		return driver.manage().window().getSize();
	}
	// set Dimension
	public void ConfigBrowserSize(int width, int height) {
		driver.manage().window().setSize(new Dimension(width,height));
	}	
	// Get point
	public Point FetchBrowserCoordinates() {
		return driver.manage().window().getPosition();
	}
	// set point
	public void ConfigBrowserCoordinates(int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}
	//Navigate
	public void navigateToApplication(String url) {
		driver.navigate().to(url);
	}
	//forward
	public void navigateToForward() {
		driver.navigate().forward();
	}
	//backward
	public void navigateToBackward() {
		driver.navigate().back();
	}
	//backward
	public void RefreshCurrentpage() {
		driver.navigate().refresh();
	}
	//get Url
	public void EnterUrl(String url) {
		driver.get(url);
	}
	//get Title
	public String FetchApplicationTitle() {
		return driver.getTitle();
	}
	//get Current url
	public String FetchApplicationUrl() {
			return driver.getCurrentUrl();
	}
	//driver close
	public void CloseParentTab() {
		driver.close();
	}
	//driver quit
	public void QuitBrowser() {
		driver.quit();
	}
	//Implicit wait
	public void WaitForAllElements(long Seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
	}
	//Explicit wait
	public void WaitForVisibiltyOfElement(long seconds, WebElement ele) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	//Explicit wait
	public void WaitForToBeClickableOfElement(long seconds, WebElement ele) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	//popups
	//Alert Accept
	public void AcceptAlertMessage() {
		driver.switchTo().alert().accept();
	}
	//Alert Dismiss
	public void DismissAlertMessage() {
		driver.switchTo().alert().dismiss();
	}
	//prompt popup
	public void EnterPromptInPopup(String Message) {
		driver.switchTo().alert().sendKeys(Message);
	}
	//display popup message
	public void DisplayPopupMessage() {
		System.out.println(driver.switchTo().alert().getText());
	}
	//child window switch using Title
	public void SwitchWindowUsingTitle(String Wantedtitle) {
		Set<String> weblist=driver.getWindowHandles();
		Iterator<String> it=weblist.iterator();
		while(it.hasNext()) {
		driver.switchTo().window(it.next());
		if(driver.getTitle().contains(Wantedtitle))
			break;
		}
	}
	//child window switch using URL
	public void SwitchWindowUsingUrl(String WantedURL) {
		Set<String> weblist=driver.getWindowHandles();
		Iterator<String> it=weblist.iterator();
		while(it.hasNext()) {
		driver.switchTo().window(it.next());
		if(driver.getCurrentUrl().contains(WantedURL))
			break;
		}
	}
	
	

}
