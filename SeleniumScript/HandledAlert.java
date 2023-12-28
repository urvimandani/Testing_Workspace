package com.a5670;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("cusid")).sendKeys("sdc");
			Thread.sleep(1000);
			driver.findElement(By.name("submit")).click();
			Alert alert =   driver.switchTo().alert();
			alert.accept();
			alert.accept();
			
		driver.close();
	}

}
