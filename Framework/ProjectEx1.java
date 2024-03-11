package com.fw;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProjectEx1 {

	@DataProvider(name="urvi")
	public static Object[][] readexcel() throws InvalidFormatException, IOException
	{
		Object[][] data=null;
		
		String filepath="D:\\xyz2.xlsx"; 
		
		File file=new File(filepath); 
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		Sheet sheet=workbook.getSheet("Sheet1");
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows are... "+nrows);
		
		data=new String[nrows][];
		for(int i=0;i<nrows;i++)
		{
			Row row=sheet.getRow(i);
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("no of cols are.. "+ncols);
			data[i]=new String[ncols];
			for(int j=0;j<ncols;j++)
			{
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
		}
		
		return data;
	}
	
	WebDriver driver = null;
	@Test(dataProvider = "urvi")
	public void test(String keyword,String data) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\newdata\\chromedriver-win64\\chromedriver.exe");
		
		if(keyword.equals("open browser"))
		{			
			driver=new ChromeDriver();
		}
		else if(keyword.equals("enter url"))
		{
			driver.get(data);	
			Thread.sleep(2000);
		}
		else if(keyword.equals("click logo"))
		{
			driver.findElement(By.linkText("PRODUCT STORE")).sendKeys(data);
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,200)");
		}
		
		else if(keyword.equals("click phones"))
		{
			driver.findElement(By.linkText("Phones")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click link"))
		{
			driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click add to cart"))
		{
			driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).sendKeys(data);
			Thread.sleep(2000);
			Alert alert =   driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
		}
		else if(keyword.equals("click home"))
		{
			driver.findElement(By.id("//*[@id=\"navbarExample\"]/ul/li[1]/a")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click laptops"))
		{
			driver.findElement(By.linkText("Laptops")).sendKeys(data);
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,200)");
		}
		else if(keyword.equals("click Monitors"))
		{
			driver.findElement(By.linkText("Monitors")).sendKeys(data);
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,200)");
		}
		else if(keyword.equals("click next2"))
		{
			driver.findElement(By.id("next2")).sendKeys(data);
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,200)");
		}
		else if(keyword.equals("click prev2"))
		{
			driver.findElement(By.id("prev2")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click Contact"))
		{
			driver.findElement(By.linkText("Contact")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter username"))
		{
			driver.findElement(By.id("recipient-email")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter name"))
		{
			driver.findElement(By.id("recipient-name")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter message"))
		{
			driver.findElement(By.id("message-text")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click send message"))
		{
			driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).sendKeys(data);
			Thread.sleep(2000);
			Alert alert =   driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
		}
		else if(keyword.equals("click About us"))
		{
			driver.findElement(By.linkText("About us")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click close"))
		{
			driver.findElement(By.linkText("//*[@id=\"videoModal\"]/div/div/div[3]/button")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click cartur"))
		{
			driver.findElement(By.id("cartur")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click place order"))
		{
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter name"))
		{
			driver.findElement(By.id("name")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter country"))
		{
			driver.findElement(By.id("country")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter city"))
		{
			driver.findElement(By.id("city")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter card"))
		{
			driver.findElement(By.id("card")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter month"))
		{
			driver.findElement(By.id("month")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter year"))
		{
			driver.findElement(By.id("year")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click purchase"))
		{
			driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click ok"))
		{
			driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click sign up"))
		{
			driver.findElement(By.id("signin2")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter username"))
		{
			driver.findElement(By.id("sign-username")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter password"))
		{
			driver.findElement(By.id("sign-password")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click signup"))
		{
			driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).sendKeys(data);
			Thread.sleep(2000);
			Alert alert =   driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
		}
		else if(keyword.equals("click login2"))
		{
			driver.findElement(By.id("login2")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter username"))
		{
			driver.findElement(By.id("loginusername")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter password"))
		{
			driver.findElement(By.id("loginpassword")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click login"))
		{
			driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click close"))
		{
			driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button/span")).sendKeys(data);
			Thread.sleep(2000);
			if(driver.getCurrentUrl().equals("https://www.demoblaze.com/"))
			{
				System.out.println("Your Test HasBeen Passed...");
			}
			else
			{
				System.out.println("Your Test HasbeenFailed");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("D:\\image\\imgname.png");
				FileUtils.copyFile(src, dest);
				Thread.sleep(2000);
				Assert.fail("Incorrect username or password...");
			}	
		}
			else if(keyword.equals("click logout"))
			{
				driver.findElement(By.id("logout2")).click();
				Thread.sleep(2000);
			}
			else if(keyword.equals("close browser"))
			{
				System.out.println("Bye Bye...");
				driver.close();
			}
		}
		}