package selenium_concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ALART_DEMO {
@Test
public void alart_demo() {
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); //copy path
	WebDriver driver = new ChromeDriver();	//create an object
	driver.get("https://www.demoblaze.com/");	
	//pageload wait
	//implisit wait
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);//for loading page
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//for loading html/web elements
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
