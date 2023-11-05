package com.program;

import java.util.ArrayList;
import java.util.Iterator;

public class AllElementsInArrayList 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String>arraylist = new ArrayList<>();
		
		arraylist.add("Testing");
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add("Android");
		
		
		
		Iterator <String> i = arraylist.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
