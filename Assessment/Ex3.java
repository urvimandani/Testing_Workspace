package com.assesment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.a1234.Connection;

public class Ex3 
{
	public static void main(String[] args) 
	{
		WebDriver driver = Connection.getconnection("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        List<WebElement>  rows  = driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th[1]/span"));
		List<WebElement> headers = driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th[2]/span"));
        
		for(int i=1;i<rows.size();i++)
		{
			String data =  driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th[2]/span["+i+"]")).getText();
			System.out.print(data+" ");
		}
		System.out.println();
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement>  cols = driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tfoot/tr["+i+"]/td"));
			

		for(int j=1;j<=cols.size();j++)
			{
				String data = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tfoot/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}	
	}