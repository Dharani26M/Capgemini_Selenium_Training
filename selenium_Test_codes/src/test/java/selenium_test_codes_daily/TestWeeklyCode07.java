package selenium_test_codes_daily;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestWeeklyCode07 {
	WebDriver driver=null;
	@Test(priority=0)
	public void Lauching() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		opt.addArguments("--headless");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
	}
	@Test(priority=1)
	public void Login() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement title= driver.findElement(By.className("title"));
		Assert.assertEquals(title.getText().contains("Products"),true);
		Reporter.log("Products page is displayed", true);
	}
	@Test(priority=2)
	public void AddToCarts() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> li=driver.findElements(By.className("cart_item"));
		Iterator<WebElement> it=li.iterator();
		String exp1=it.next().getText();
		String exp2=it.next().getText();
		Assert.assertEquals(exp1.contains("Backpack"),exp2.contains("Light"));
		Reporter.log("Both Products are verified", true);
		driver.findElement(By.name("checkout")).click();
	}
	@Test(priority=3)
	public void Checkout() {
		driver.findElement(By.id("first-name")).sendKeys("Dharani Raj");
		driver.findElement(By.id("last-name")).sendKeys("M");
		driver.findElement(By.id("postal-code")).sendKeys("602721");
		driver.findElement(By.id("continue")).click();
		WebElement tot_price= driver.findElement(By.className("summary_total_label"));
		String Total=tot_price.getText();
		Assert.assertTrue(Total.contains("$43.18"));
		Reporter.log("Checkout Price is verified", true);
		driver.findElement(By.id("finish")).click();
	}
	@Test(priority=4)
	public void Logout() {
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.quit();
	}
}
