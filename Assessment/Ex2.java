package com.assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.a1234.Connection;

public class Ex2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = Connection.getconnection("https://demoqa.com/webtables");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");
		driver.findElement(By.id("edit-record-2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstName")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userForm")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("age")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("salary")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("department")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("delete-record-2")).click();
		
		
	}

}
