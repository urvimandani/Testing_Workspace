package com.program;

import java.util.LinkedList;

public class UpdateArrayElement 
{
	public static void main(String[] args) 
	{
		LinkedList<String>list = new LinkedList<>();
		
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Green");
		list.add("White");
		
		list.set(2,"Blue");
		
		
		System.out.println(list);
		
		
		
	}

}
