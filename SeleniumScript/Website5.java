package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Website5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver
		.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("jQuery UI")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Demos")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("API Documentation")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Themes")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Development")).click();
		Thread.sleep(1000);
	    driver.findElement(By.linkText("Blog")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Resizable")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Selectable")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sortable")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Accordion")).click();
		Thread.sleep(1000);
        
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    
		driver.findElement(By.linkText("Autocomplete")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Checkboxradio")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio-1")).click();
		driver.findElement(By.linkText("New York")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkbox-1")).click();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("2 Star")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.id("checkbox-nested-1")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.linkText("2 Double")).click();
		//driver.findElement(By.linkText("Controlgrou.p")).click();
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Datepicker")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Dialog")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Menu")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Progressbar")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Selectmenu")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Spinner")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Tabs")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Tooltip")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Add Class")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Color Animation")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Easing")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("1. linear")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.linkText("Effect")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("effectTypes")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Bounce")).click();
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Hide")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("effectTypes")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Bounce")).click();
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Remove Class")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Show")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Switch Class")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Toggle")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("effectTypes")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Clip")).click();
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Toggle Class")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Position")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("my_horizontal")).click();
		driver.findElement(By.linkText("center")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("my_vertical")).click();
		driver.findElement(By.linkText("center")).click();
		driver.findElement(By.id("collision_horizontal")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("flip")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Widget Factory")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("change")).click();
		driver.findElement(By.id("disable")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("green")).click();
	
	
	}
	

}
