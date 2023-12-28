package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.a1234.Connection;

public class LocatingLinkandPartialLinkText 
{
	public static void main(String[] args) 
	{
		
        System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/link.html");
		
		
		driver.findElement(By.linkText("click here")).click();					
        System.out.println("title of page is: " + driver.getTitle());
        
        driver.findElement(By.partialLinkText("click here")).click();					
        System.out.println("Title of page is: " + driver.getTitle());							
        driver.quit();
		
	}
	
}

