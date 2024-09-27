import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementclassmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	//	 driver.get("http://facebook.com");
		 
	//	 String msg  = driver.findElement(By.className("_8eso")).getText();
	// System.out.println(msg);
	//driver.navigate().back();
			
	//	 driver.navigate().to("http://google.com");
		 
	//	 driver.get("http://primusbank.qedgetech.com");
		 
	//	  String content =  driver.findElement(By.className("style7")).getText();
	//	  System.out.println(content);
	 
	//	 driver.get("http://google.com");
	//	 List<WebElement>  links  = driver.findElements(By.tagName("a"));
	//	  String firstlink = links.get(0).getText();
	//	  System.out.println(firstlink);
		 
		 
	/*	 
		 driver.get("http://google.com");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("count of Links : "+links.size());
		 for (WebElement element : links)
		 
		 {
		    System.out.println(element.getText());
		 }
		 
		
	 
	
		 driver.get("https://facebook.com");
		 String x = driver.findElement(By.id("email")).getAttribute("placeholder");
		 System.out.println(x);
		 */
		 
		 
		
		 
		 
	}

}
