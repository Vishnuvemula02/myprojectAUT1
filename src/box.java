import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class box {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*
		driver.get("http://amazon.com");
		
		Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		String item_tobe_check = "Flights";
		
		try {
			cat.selectByVisibleText(item_tobe_check);
			System.out.println(item_tobe_check+" is present in the list or not , test pass");
			
			
		} catch (Exception e) {
			{
				System.out.println(item_tobe_check+" is not present in the list, test fail");
		}
		
		
		
		
		
//  	List<WebElement> catlist = cat.getOptions();
		
//		for (WebElement element : catlist) {
			
//			System.out.println(element.getText());
		
		
		driver.get("http://amazon.com");
		Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> catlist = cat.getOptions();
		String cat1,cat2;
		Boolean ordered = true;
		
		
		for (int i=2; i<catlist.size();i++) 
		{
			
			cat1= catlist.get(i-1).getText();
			cat2= catlist.get(i).getText();
			if (cat2.compareToIgnoreCase(cat1)<0)
			{
				ordered = false;
				break;
		
			}
			
			}
		if (ordered)
		{
			System.out.println("all items are in alphabetical order, test pass ");
			
			
		}else {
			System.out.println("all items are  not in alphabetical order, test fail ");
		}
		
		
		
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement element = driver.findElement(By.id("flexCheckChecked"));
		if (! element.isSelected())
		{
			element.click();
			
	}
		

		driver.get("http://facebook.com");		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();

	
		
		driver.get("http://amazon.in");		
		Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));		
		List<WebElement> catlist = cat.getOptions();		
		
		cat.selectByIndex(catlist.size()-1);
		*/
		driver.get("http://myntra.com");
      // driver.findElement(By.className("desktop-main")).click();
       
       Select cat = new Select(driver.findElement(By.className("desktop-main")));
		
		String item_tobe_check = "Flights";
		
		try {
			cat.selectByVisibleText(item_tobe_check);
			System.out.println(item_tobe_check+" is present in the list or not , test pass");
			
			
		} catch (Exception e) {
			{
				System.out.println(item_tobe_check+" is not present in the list, test fail");
		}
		
       
    
    
    

   /*
   
    
    Select cat = new Select(driver.findElement(By.xpath("")));	
   	
		List<WebElement> catlist = cat.getOptions();
		
		System.out.println(catlist.size());

*/
		
		
		
		
		
	
	}
	

	}
}
