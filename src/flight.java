import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		/* driver.get("http://flights.qedgetech.com");
		 driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("demo");
       //  driver.findElement(By.className("btn btn-primary btn-block btn-flat")).click();
        //driver.findElement(By.className("ui-datepicker-week-end")).click();
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		 driver.get("http://google.com");
		 String link_tobe_ckeck = "Sign up";
		 try 
		 {
			 if(driver.findElement(By.linkText(link_tobe_ckeck)).isDisplayed())
			 {
			 System.out.println("testpass");
			 }
			
		} catch (Exception e) {
			{
				System.out.println("test fail");
			}
		}
		 
		 
		 driver.get("http://orangehrm.qedgetech.com");
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
			driver.findElement(By.name("Submit")).click();
			
			try 
			{
				if(driver.findElement(By.linkText("Admin")).isDisplayed())
				{
					System.out.println("Admin Login Test Pass");
				}
			} catch (Exception e) 
			{
				System.out.println("Admin Login Test Fail");
			}

	
		 driver.get("http://orangehrm.qedgetech.com");
			
			driver.findElement(By.id("txtUsername")).sendKeys("Rakesh");
			driver.findElement(By.id("txtPassword")).sendKeys("Rakesh123!@#");
			driver.findElement(By.name("Submit")).click();
			
			try 
			{
				if(driver.findElement(By.linkText("Admin")).isDisplayed())
				{
					System.out.println("Employee Login Test Fail");
				}
				
			} catch (Exception e) 
			{
				System.out.println("Employee Logn Test Pass");
			}
*/
	}

}
