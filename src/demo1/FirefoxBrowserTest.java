package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver  driver = new  FirefoxDriver();

	}

}
