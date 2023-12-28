package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.a1234.Connection;

public class Website2 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Connection.getconnection("https://thedemosite.co.uk/");
		
		
		driver.findElement(By.className("custom-logo")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.linkText("2")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.findElement(By.linkText("3")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.findElement(By.linkText("4")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.findElement(By.linkText("5")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.findElement(By.linkText("6")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.findElement(By.linkText("7")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.findElement(By.linkText("8")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("fcb44c85")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.name("0112ce16")).sendKeys("mandani");
		Thread.sleep(1000);
		driver.findElement(By.name("012af4e3")).sendKeys("urvi@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("fd8a921a")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.linkText("VPN")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Web 3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Privacy Policy")).click();

		
	}

}
