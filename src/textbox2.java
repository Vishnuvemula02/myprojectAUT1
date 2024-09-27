import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox2 {
	
   public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/*	driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> keywordlist =
				driver.findElement(By.className("gLFyf")).findElements(By.tagName("textarea"));
		for(WebElement element : keywordlist)
		{
			String keyword = element.getText();
			
			if
			(keyword.equalsIgnoreCase("selenium download")) 
			{
			  element.click();
			  break;
			}
		*/
			
			driver.get("http://amazon.com");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
			
		/*	Thread.sleep(2000);
			
			List<WebElement> keywordlist =
					driver.findElement(By.className("gLFyf")).findElements(By.tagName("textarea"));
			for(WebElement element : keywordlist)
			{
				String keyword = element.getText();
				
				if
				(keyword.equalsIgnoreCase("selenium download")) 
				{
				  element.click();
				  break;
				}	
		}
		*/
		
	   
	   
	   
	   
	   
	
    }
   
}
	

     

	
	



