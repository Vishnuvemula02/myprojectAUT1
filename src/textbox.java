import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("http://facebook.com");
	
	Thread.sleep(2000);
	
    List<WebElement>  editlist = driver.findElements(By.xpath("// input[@type = 'text' or @type = 'password ']"));
    
	System.out.println(editlist.size())	;	
	
	
	
	
	
	}
/*
	private static Object implicitlyWait(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
		*/
	}


