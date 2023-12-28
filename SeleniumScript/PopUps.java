package com.a5670;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.a1234.Connection;

public class PopUps 
{
	public static void main(String[] args) 
	{		
        System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");	
		String mainwin = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> allwins =  driver.getWindowHandles();
		
		for(String win : allwins)
		{
			if(!win.equals(mainwin))
			{
				driver.switchTo().window(win);
			} 
		}
		driver.findElement(By.name("emailid")).sendKeys("urvi@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
	}

}
