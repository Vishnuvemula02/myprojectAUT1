import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.bus.irctc.co.in");
		 
		 
		 driver.findElement(By.name("departFrom")).sendKeys("Hyderabad");
		 
		 Thread.sleep(7000);
		 driver.findElement(By.id("goingTo")).sendKeys("Bangalore");
		 Thread.sleep(5000);
		 driver.findElement(By.name("departDate")).sendKeys("24-07-2024");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/app-root/ng-component/div[3]/div[2]/div[2]/form/div[4]/button")).click();
		 
	     
		
		
		 
		 
		 
	}

}
