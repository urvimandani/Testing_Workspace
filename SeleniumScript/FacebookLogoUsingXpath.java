package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FacebookLogoUsingXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("9904771171");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_sb\"]/div/div[1]/div/div[2]/div[1]/a/svg/path[1]")).click();
		
		driver.close();
	}

}
