package com.a5670;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.junit.DriverConnection;


public class LoginProcessofFacebook 
{
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser()
	{
		driver = DriverConnection.connect();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void titleCheck()
	{
		assertEquals("Facebook ? log in or sign up",driver.getTitle());
	}
	@Test
	public void loginCheck()
	{
		driver.findElement(By.id("email")).sendKeys("tops");
		driver.findElement(By.id("pass")).sendKeys("tech123");
		driver.findElement(By.name("login")).click();
		
	}
	public static void close()
	{
		driver.quit();
	}

}



