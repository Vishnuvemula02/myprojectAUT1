import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
 /*   
    driver.get("http://flights.qedgetech.com");
    driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
    driver.findElement(By.name("password")).sendKeys("demo");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Flight Bookings")).click();
    driver.findElement(By.linkText("Delete")).click();
    
    String alertmsg = driver.switchTo().alert().getText();
     if (alertmsg.contains("Delete"))
     {
		driver.switchTo().alert().accept();
		
	}else {
		driver.switchTo().alert().dismiss();
		
	}
  */
    /*
     
   
    
     driver.get("http://flights.qedgetech.com");
     driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
     driver.findElement(By.name("password")).sendKeys("demo");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     driver.findElement(By.linkText("Flight Bookings")).click();
    
    String orderid_tobe_deleted = "11345";
    WebElement orderstable = driver.findElement(By.className("flights_table"));
   
    List<WebElement>  rows = orderstable.findElements(By.tagName("tr")) ;
    
    for (int i = 1; i < rows.size(); i++)
    	
    {
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		if(cols.get(0).getText().equals(orderid_tobe_deleted));
		{
			
			cols.get(9).findElement(By.linkText("Delete")).click();
			
			driver.switchTo().alert().accept();
			break;
	}
    
    
    
	}
    
    
 */
    driver.get("http://flights.qedgetech.com");
    driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
    driver.findElement(By.name("password")).sendKeys("demo");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Flight Bookings")).click();
   
   String orderid_tobe_deleted = "11345";
   WebElement orderstable = driver.findElement(By.className("flights_table"));
  
   List<WebElement>  rows = orderstable.findElements(By.tagName("tr")) ;
   
   for (int i = 1; i < rows.size(); i++)
   	
   {
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		if(cols.get(0).getText().equals(orderid_tobe_deleted));
		{
			
			cols.get(9).findElement(By.linkText("Delete")).click();
			
			
			driver.switchTo().alert().accept();
			break;
	}
   
   
   
	}
   
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  /*  
    
//	driver.get("http://snapdeal.com");
	/* mouse over specified element
	
	 Actions act =  new Actions(driver);
	 act.moveToElement(driver.findElement(By.linkText("Home & Kitchen")));
	 act.build().perform();
	 
	
	 Actions act =  new Actions(driver);
	 act.moveToElement(driver.findElement(By.linkText("Home & Kitchen")));
	 act.contextClick();
	 act.build().perform();

	driver.get("http://jqueryui.com");
	
	driver.findElement(By.linkText("Droppable")).click();
	
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	
	
	
	WebElement srcelement ,trgelement ;
	
	srcelement = driver.findElement(By.id("draggable"));
	trgelement = driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop( srcelement, trgelement );
	act.build().perform();
	
	driver.switchTo().parentFrame();
	driver.findElement(By.linkText("Blog")).click();
*/	
	
/*
 
	driver.get("http://gmail.com");
	String current_window_id = driver.getWindowHandle();
	System.out.println(current_window_id);
*/
/*	
	driver.get("https://gmail.com");
	
	driver.findElement(By.linkText("Help")).click();
	
	Set<String>  allwindows = driver.getWindowHandles();
	
	
	
	System.out.println( allwindows);
	
	Object[]windows = allwindows.toArray();
	String window1 = windows[0].toString();
	String window2 = windows[1].toString();
	
	
	
	driver.switchTo().window(window2);
	driver.findElement(By.linkText("Community")).click();
	driver.switchTo().window(window1);
	driver.findElement(By.id("identifierId")).sendKeys("demo");
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
		
		
		
		
		
		
		
		
		

	}

}
