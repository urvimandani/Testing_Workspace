package com.program;

import java.util.ArrayList;
import java.util.Iterator;

public class iterateThroughAllElements 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String>arraylist = new ArrayList<>();
		
		arraylist.add("Testing");
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add("Android");
		
		for(String element : arraylist)
		{
			System.out.println(element);
			
		}
	
	
	
	
	
	
	}
	

}
