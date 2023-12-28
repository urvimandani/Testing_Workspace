package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEvent 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		WebElement ip = driver.findElement(By.linkText("Insurance Project"));
		WebElement ap= driver.findElement(By.linkText("Agile Project"));
		WebElement sp = driver.findElement(By.linkText("Security Project"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(ip).build().perform();
		Thread.sleep(1000);
		builder.moveToElement(ap).build().perform();
		Thread.sleep(1000);
		builder.moveToElement(sp).build().perform();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
