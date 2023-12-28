package com.a5670;

import org.testng.annotations.Test;

public class Cart 
{
	@Test(groups = "smoke")
	public void editItem()
	{
		System.out.println("edit item running..");
	}
	
	@Test(groups = "sanity")
	public void removeItem()
	{
		System.out.println("running remove item...");
	}

}
