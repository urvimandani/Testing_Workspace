package com.a5670;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.a1234.Connection;

public class WindowAlerts 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = Connection.getconnection("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver,30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		//Alert 1 
		
		//driver.findElement(By.id("alertButton")).click();		
		//	Alert alert =   driver.switchTo().alert();
		//	System.out.println(alert.getText());
		//	Thread.sleep(2000);
		//	alert.accept();
		
	   //Alert 2
				
	   //	driver.findElement(By.id("timerAlertButton")).click();	
	   //	wait.until(ExpectedConditions.alertIsPresent());	
	   //	Alert alert = driver.switchTo().alert();
	   //	System.out.println(alert.getText());
	   //	alert.accept();	
					
	   //Alert 3
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();

					
		//Alert 4	
		driver.findElement(By.id("promtButton")).click();
		Alert alert2= driver.switchTo().alert();
		alert.sendKeys("Typing by topstech");
		alert.accept();		
		
	}

}
