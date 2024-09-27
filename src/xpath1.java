import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	/*	 driver.get("https://facebook.com");
			driver.findElement(By.id("email")).sendKeys("demo.qedge@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Qedge123");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
*/
         driver.get("http://orangehrm.qedgetech.com");

         driver.findElement(By.id("txtUsername")).sendKeys("Admin");
         driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
         driver.findElement(By.name("Submit")).click();
         driver.findElement(By.linkText("PIM")).click();
         driver.findElement(By.linkText("Employee List")).click();
         List<WebElement> checklist = driver.findElements(By.id("ohrmList_chkSelectAll"));
         for  (WebElement element : checklist)
         {
        	 element .click();
         }
         
         
         
		
	}
	
}
