package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.a1234.Connection;

public class Website1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = Connection.getconnection("https://phptravels.com/demo/");
		
		
		driver.findElement(By.xpath("//*[@id=\"PHPTRAVELS\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Demo")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("first_name")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.name("last_name")).sendKeys("mandani");
		Thread.sleep(1000);
		driver.findElement(By.name("business_name")).sendKeys("ABC");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("urvi@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Pricing")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Themes")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Product")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Integrations")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Product")).click();
		driver.findElement(By.linkText("Customization")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Product")).click();
		driver.findElement(By.linkText("Technology")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Product")).click();
		driver.findElement(By.linkText("Requirements")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Features")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[5]/ul/li[3]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Features")).click();
	    driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[5]/ul/li[4]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Features")).click();
	    driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[5]/ul/li[5]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Features")).click();
	    driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[5]/ul/li[6]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Features")).click();
	    driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[5]/ul/li[7]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Features")).click();
	    driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[5]/ul/li[8]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Features")).click();
	    driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[5]/ul/li[9]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Features")).click();
	    driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/ul/li[5]/ul/li[10]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Company")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Blogs")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Company")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Docs")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Company")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Contact Us")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Company")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("About Us")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Company")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("The Team")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Company")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Jobs")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Company")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Partners")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Company")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Media Kit")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"mynavbar\"]/div/a[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Store")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Browse All")).click();
	    Thread.sleep(1000);	    
	    driver.findElement(By.linkText("Store")).click();
	    driver.findElement(By.linkText("Installation")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Store")).click();
	    driver.findElement(By.linkText("License")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Store")).click();
	    driver.findElement(By.linkText("Mobile")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Store")).click();
	    driver.findElement(By.linkText("Services")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Store")).click();
	    driver.findElement(By.linkText("API")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Announcements")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Knowledgebase")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Network Status")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Affiliates")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Contact Us")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Account")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("inputEmail")).sendKeys("urvi@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("inputPassword")).sendKeys("12345");
	    Thread.sleep(1000);
	    driver.findElement(By.id("login")).click();
	
	    driver.close();
	
	}

}

