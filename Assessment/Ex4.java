package com.assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.a1234.Connection;

public class Ex4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = Connection.getconnection("https://clicks.aweber.com/y/ct/?l=G4JVC&m=mqr21DGG7WFEjy9&b=Az.STklKlTmnEcwnm5dmMg");
		
		driver.findElement(By.name("emailid")).sendKeys("nirmitmandani99047@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("btnLogin")).click();
	}
}