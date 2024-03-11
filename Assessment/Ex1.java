package com.assesment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;

import com.a1234.Connection;

public class Ex1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = Connection.getconnection("https://demoqa.com/automation-practice-form");
		getScreenShot(driver, "err");
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("mandani");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("u@gmail.com");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("7890456721");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,100)");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).sendKeys("11");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("April");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).sendKeys("2010");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,400)");
		Thread.sleep(1000);
		
		WebElement subjects	=driver.findElement(By.id("subjectsContainer"));
		Thread.sleep(4000);
		Actions builder = new Actions(driver);
		Thread.sleep(6000);
		builder.click(subjects).sendKeys("Maths").sendKeys(Keys.ENTER).sendKeys("Physics").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Rajkot");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        
	}
	public static void getScreenShot(WebDriver driver, String imgname)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\image\\imgname.exe");
		
		try
		{
			FileUtils.copyFile(source, dest);
			System.out.println("screenshot taken");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}