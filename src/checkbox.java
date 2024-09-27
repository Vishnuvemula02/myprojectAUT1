import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
    //	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 
    	 
	/*	 driver.get("http://facebook.com");
		 driver.findElement(By.linkText("Create new account")).click();
			
			
			Select dlist = new Select(driver.findElement(By.id("day")));
			dlist.selectByIndex(0);
			
			Select mlist = new Select(driver.findElement(By.id("month")));
			mlist.selectByValue("10");
			
			WebElement yearelement = driver.findElement(By.id("year"));
			Select ylist = new Select(yearelement);
			ylist.selectByVisibleText("1990");
	*/
		 driver.get("http://amazon.in");
			
			
			Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));		
			cat.selectByVisibleText("Books");

		 

		 

	}

	private static Select Select(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}

}
