package com.assesment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.a1234.Connection;

public class ProjectEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = Connection.getconnection("https://www.demoblaze.com/");
		
		driver.findElement(By.linkText("PRODUCT STORE")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");
		
		driver.findElement(By.id("cat")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Phones")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Alert alert =   driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(1000);
		alert.accept();
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Monitors")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("next2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("prev2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recipient-email")).sendKeys("u@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("recipient-name")).sendKeys("6777");
		Thread.sleep(1000);
		driver.findElement(By.id("message-text")).sendKeys("rajkot");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Send message")).click();
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.linkText("About us")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Play Video")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Pause")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Close")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("cartur")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Place Order")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.id("country")).sendKeys("india");
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("rajkot");
		Thread.sleep(1000);
		driver.findElement(By.id("card")).sendKeys("465657743");
		Thread.sleep(1000);
		driver.findElement(By.id("month")).sendKeys("jan");
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("2023");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Purchase")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("OK")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("yuyu");
		Thread.sleep(1000);
		driver.findElement(By.id("loginpassword")).sendKeys("24345");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("sign-username")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.id("sign-password")).sendKeys("7890");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign up")).click();
	
	}
}
