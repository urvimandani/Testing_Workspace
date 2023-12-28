package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.a1234.Connection;

public class ScriptforDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = Connection.getconnection("https://demo.guru99.com/test/newtours/register.php");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Actions builder = new Actions(driver);
		driver.findElement(By.name("country")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("country")).click();
		
	    driver.close();
		
	}

}
