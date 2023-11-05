package com.program;

import java.util.ArrayList;

public class RemoveThirdElementinArray 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String>arraylist = new ArrayList<>();
		
		arraylist.add("Red");
		arraylist.add("Green");
		arraylist.add("White");
		arraylist.add("Black");
		arraylist.add("Blue");
		
		
		arraylist.remove(2);
		
		System.out.println(arraylist);
		
	}

}
