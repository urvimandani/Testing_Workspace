package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterinGmail 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
	
	 System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://mail.google.com");
	 driver.manage().window().maximize();
	
	 driver.findElement(By.id("identifierId")).sendKeys("nirmitmandani99047@gmail.com");
	 Thread.sleep(1000);
	 driver.findElement(By.id("identifierNext")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.name("Passwd")).sendKeys("Urvi1234");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("passwordNext")).click();
	 
	 driver.close();
	 
	 
}
}