package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website4 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   	    System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(1000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("inventory_sidebar_link")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("reset_sidebar_link")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("react-burger-cross-btn")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
