import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox1 {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	//	driver.get("http://google.com");
		
     //   driver.findElement(By.className("truncate")).sendKeys("selenium");
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> keywordlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		
		System.out.println(keywordlist.size());
		
		for(WebElement element : keywordlist)
		{
			String keyword = element.getText();
			System.out.println(keyword);
		}
 
		
	

	}

}
