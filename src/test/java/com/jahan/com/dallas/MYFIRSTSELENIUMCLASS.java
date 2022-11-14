package com.jahan.com.dallas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MYFIRSTSELENIUMCLASS {

	public static void main(String[] args) throws Exception {
		
	//two imports here	
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); //copy path
	WebDriver driver = new ChromeDriver();	//create an object
	driver.get("https://www.demoblaze.com/");	
	driver.manage().window().maximize();//one time setup
	driver.findElement(By.linkText("Contact")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("recipient-email")).sendKeys("test");//enter email
	driver.findElement(By.id("recipient-name")).sendKeys("sadia");//enter name
	driver.findElement(By.id("message-text")).sendKeys("this is my messege");//enter messege
	driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();//send messege
	Thread.sleep(10000);//manual wait statement	
	driver.quit();//to close window
	
		
		
		
		
		
		

	}

}
