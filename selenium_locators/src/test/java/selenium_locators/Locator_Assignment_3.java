package selenium_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Assignment_3 {

	
		 public static void main(String[] args) throws InterruptedException {

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        driver.get("https://amazon.in/");
		        Thread.sleep(3000);

		        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
		              .sendKeys("Laptop");

		        //  Search Button → using ID attribute
		        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
		              .click();

		        Thread.sleep(3000);

		        // Click First Product → using class attribute
		        driver.findElement(By.xpath("(//img[@data-image-index='1'])"))
		              .click();
		        driver.get("https://www.amazon.in/HP-Previously-Snapdragon-Processor-Light-Weight/dp/B0F8P4Y7VF/ref=sr_1_1_sspa?crid=1JTFR99V6E15R&dib=eyJ2IjoiMSJ9.DsfwJMnWkW_vhiAIRXBDFAmRqoGWZYzpPuJM5ulCGBdNa2_Hir6yjlwe0QhG4MA3yv9aKFAkp8AOxry1WYSp8YKpnFCzkbq99KKi9gZPtVekf7TEFd3QtN23pQcr4gp3QAtkcx1Xe_0AIpqAu3xPXIOQtaPxrZ6CU_vcTv2hBY4GyosG0IRBhCzry6kt-K8vIQOK3sKT_C6PFROLxNA0grKzY88TXAuL6nPWnzmxftg.hHS5kuvBJc09NukADVagZWoB_QTMla-p19eeI3GR9J4&dib_tag=se&keywords=Laptop&qid=1772112771&sprefix=la%2Caps%2C446&sr=8-1-spons&aref=v3d5HQPIvW&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		        Thread.sleep(3000);

		     //  Click 1 Year Warranty Checkbox
		        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"))
		              .click();

		        Thread.sleep(2000);

		        //  Buy Now button
		        driver.findElement(By.xpath("//input[@id='buy-now-button']"))
		              .click();

		        //Thread.sleep(5000);s
		        driver.quit();
		    }
	}

