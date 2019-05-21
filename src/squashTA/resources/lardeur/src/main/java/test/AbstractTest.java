package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractTest {

	protected static WebDriver driver;
	

	public AbstractTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver2_43/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.wowhead.com/");	
		
		
		
	}
	@After
	public void close() {
		driver.close();
	}
	
}
