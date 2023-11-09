package com.program;

import java.io.FileInputStream;

public class DemonstrateTryCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis =new FileInputStream("D:/Hello.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello");
		
	}
	

}
