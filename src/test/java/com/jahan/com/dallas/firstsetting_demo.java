package com.jahan.com.dallas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//test case name: varify user login
//lauch url
//click login link
//enter username & pass
//click login
//verify user login successfully


public class firstsetting_demo {
	@Test
public void verifylogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); //copy path
		WebDriver driver = new ChromeDriver();	//create an object
		driver.get("https://www.demoblaze.com/");	
		//pageload wait
		//implisit wait
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);//for loading page
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//for loading html/web elements
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	//upto here one time setup	
  WebElement login =	driver.findElement(By.id("login2"))	;
	    login.click();
	    Thread.sleep(3000);	
	//web elements-Interface	
        WebElement username = driver.findElement(By.id("loginusername"));
        username.sendKeys("sadia2022");
        Thread.sleep(3000);	
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("54321");
        Thread.sleep(3000);	
        WebElement LoginButton= driver.findElement(By.xpath("//button[text()='Log in']"));
        LoginButton.click();
        Thread.sleep(3000);	
//		boolean profilepage = driver.findElement(By.xpath("//a[text() ='Welcome sadia2022']")).isDisplayed();
//        Assert.assertTrue(profilepage);
        //IF IT SHOWS 'Welcome sadia2022' ITS TRUE & IT IS PASS,THAT ASSERT RECOGNIZE 
        //IN ONE TEST CASE WE CAN USE AS MANY VALIDATION(ASSERT) IF WE NEED
        boolean profilepage = driver.findElement(By.id("nameofuser")).isDisplayed();
        Assert.assertTrue(profilepage);
        Thread.sleep(3000);
        driver.quit(); 
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
