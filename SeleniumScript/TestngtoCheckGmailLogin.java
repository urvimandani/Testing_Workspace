package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.junit.DriverConnection;


public class TestngtoCheckGmailLogin 
{
static WebDriver driver;
	
	@BeforeTest
	public static void openBrowser()
	{
		driver = DriverConnection.connect();
		driver.get("https://mail.google.com");
	}
	
	@Test
	public void logincheck()
	{
		 driver.findElement(By.id("identifierId")).sendKeys("nirmitmandani99047@gmail.com"); 
		 driver.findElement(By.id("identifierNext")).click(); 
		 driver.findElement(By.name("Passwd")).sendKeys("Urvi1234");
		 driver.findElement(By.xpath("passwordNext")).click();
		
	}
	
	@AfterTest	
	public static void close()
	{
		driver.quit();
	}

	}
