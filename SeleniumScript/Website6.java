package com.a5670;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.a1234.Connection;

public class Website6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = Connection.getconnection("https://omayo.blogspot.com/");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.linkText("Page One")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ta1")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.id("multiselect1")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Swift")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("fname")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("alert1")).click();
		Alert alert =   driver.switchTo().alert();
		alert.accept();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
		driver.findElement(By.linkText("Button2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("rotb")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.id("prompt")).sendKeys("urvi");
		Thread.sleep(1000);
		Alert alert2 =   driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id("confirm")).click();
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.id("form1")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Password")).sendKeys("otp");
		Thread.sleep(1000);
		driver.findElement(By.linkText("LogIn")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.id("timerButton")).click();
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.id("alert2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("deletesuccess")).click();
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.name("vehicle")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Laptop")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.id("myDropdown")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Double click Here")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("userid")).sendKeys("qws");
		Thread.sleep(1000);
		driver.findElement(By.name("pswrd")).sendKeys("tyh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Check this")).click();
			
	}
}
