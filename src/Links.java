import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	//	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	/*	scriptto print all the links present in the google page
	  
	  
		driver.get("http://google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	all links in google page
		
		 driver.get("http://google.com");
			List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement element :links)
		{
			System.out.println(element.getText());
		}
		*/
		
		 driver.get("http://google.com");
			List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement element :links)
		{
			String linkname = element.getText();
			String linkurl  = element.getAttribute("href");
			System.out.println(linkname+""+linkurl);
			
			
					
		}
	}

}
