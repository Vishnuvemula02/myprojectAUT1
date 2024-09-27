import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshort {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*    
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.partialLinkText("Welcome harish")).click();
		driver.findElement(By.linkText("Change Password")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File trgfile =  new File("c:\\demo\\defect.png");
		FileUtils.copyFile(srcfile, trgfile);
	*/
	    
	 //   driver.get("http://amazon.in");   
      //  JavascriptException js = (JavascriptException)driver;
      //  js.executescripte ("argument[0].scrooll INtoview() ",driver.findElement(By.linkText("Explore allcategories");
   
		
		
	 //   driver.get("http://amazon.in");   
	  //  JavascriptException js = (JavascriptException)driver;
	 //   js.executescript("window.scrool by(0,1000)");

	}

}


