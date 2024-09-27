import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("http://www.railyatri.in/time-table");
	    WebElement trains_table = driver.findElement(By.xpath( "//div[2]/div[4]/div/table"));
	    List<WebElement> rows = trains_table.findElements(By.tagName("tr"));
	    
	    
		for (int i = 1; i < rows.size(); i++)
			
            {
			 List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			 String train_number = cols.get(0).getText();
			 String train_name = cols.get(1).getText();
			   System.out.println(train_number+"   "+train_name);
}
	}
}	
	    
	    
	    
	    
	    
	    
	    
	    
	    



