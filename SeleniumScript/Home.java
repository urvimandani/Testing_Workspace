package com.a5670;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home 
{
	@Test(groups = "smoke")
	public void login()
	{
		System.out.println("running login test");
		assertFalse(true);
	}
	
	@Test
	public void logout()
	{
		System.out.println("running logout test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("running before every home method...");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("running after every home method...");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("running before home class...");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("running after home class...");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("running before test...");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("running after test...");
	}

}
