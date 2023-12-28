package com.a5670;

import java.sql.Driver;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.junit.DriverConnection;

import util.Driverconnection;

public class JunittoCheckGmailLogin 
{
	static WebDriver driver;
	
	@BeforeClass
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
	
	@After	
	public static void close()
	{
		driver.quit();
	}
}
	
