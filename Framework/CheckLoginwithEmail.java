package com.a123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLoginwithEmail 
{
	@Test
	public static String[][] readExcel() throws InvalidFormatException, IOException
	{
		String[][] data=null;
			
		String filepath="D:\\xyz.xlsx"; 
		
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
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\newdata\\chromedriver-win64\\chromedriver.exe");
		String[][] data=readExcel();
		for(int i=0;i<data.length;i++)
		{
			driver=new ChromeDriver();
			driver.get("https://www.inmotionhosting.com/");	
			Thread.sleep(2000);
			driver.findElement(By.className("fa fa-imh-user")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(data[i][1]);
			Thread.sleep(2000);
			driver.findElement(By.id("login-submit")).click();
			Thread.sleep(2000);
			if(driver.getCurrentUrl().equals("https://secure1.inmotionhosting.com/index/login"))
			{
				System.out.println("Your Test HasBeen Passed...");
			}
			else
			{
				System.out.println("Your Test HasbeenFailed");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("D:\\image\\imgname\\IEDriverServer.exe");
				FileUtils.copyFile(src, dest);
				Thread.sleep(2000);
				Assert.fail("Incorrect username or password...");
				
			}
			Thread.sleep(2000);
			System.out.println("Bye Bye...");
			driver.close();
		}
	}
}