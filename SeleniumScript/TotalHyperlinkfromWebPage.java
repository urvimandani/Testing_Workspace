package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalHyperlinkfromWebPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("NSE")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Daily")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Weekly")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Monthly")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("All")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Group B")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Group M")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Group T")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Group MT")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Group Z")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Company")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Group")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Prev Close (Rs)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Current Price (Rs)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("% Change")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("HDIL")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("135")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("18")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   3.7")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("REC")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("723.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("202.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   8.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Bharat Electroni")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("497.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("428.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+  7.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Corporation Bank")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("713.9")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("474.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   2.5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Kwality")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("938.9")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("186.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   5.4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("LIC Housing Fi")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("958.4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("448.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   8.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Coffee Day Enterpris")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("487.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("851.4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   5.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("IDFC L")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("90.4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("312.1")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   5.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Blue Dart Expres")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("359.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("995.9")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   5.5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Mangalore Refine")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("527.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("929.4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   7.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("DCB Bank")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("984.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("755.6")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   9.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("IDFC L")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("87.7")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("11.6")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   4.7")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Quess Corp")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("658.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("141.7")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   8.1")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Quess Corp")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("902.4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("905")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   3.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Blue Dart Expres")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("132.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("392.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   4.5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Power Finance Co")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("585.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("840.5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   6")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Punj. NationlBak")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("148.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("480")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   5.7")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Ujjivan Financial")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("483.5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("657.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   5.7")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Mangalore Refine")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("930")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("75.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+  5.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("IDFC Bank")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("217.1")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("981")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("217.1")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Ujjivan Financial")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("888.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("149.2")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   5.4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Deepak Fertilisers")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("529.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("547.4")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   4.7")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Ujjivan Financial")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("761")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("15.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   8.3")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("IDFC Bank")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("425.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("640.5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   6.8")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Hero MotoCorp")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("87.5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("885.6")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   9")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Vakrangee")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("A")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("14")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("187.7")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("+   4.7")).click();
		
	}
}
