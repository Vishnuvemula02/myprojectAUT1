import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmqedgtechcom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
	//	String empid = driver.findElement(By.id("employeeld")).getAttribute("value");
	//	System.out.println(empid);
		
		driver.findElement(By.id("firstName")).sendKeys("vishnuvardhan");
		driver.findElement(By.id("lastName")).sendKeys("vemula");
		
		WebElement element = driver.findElement(By.id("employeeId"));
		element.clear();
		element.sendKeys("123");
		 driver .findElement(By.id("btnSave")).click();
		
		
	}

}
