package com.program;

public class CompareToString 
{
	public static void main(String[] args) 
	{
		String s1="Java";
		String s2=new String("Java");
		String s3="Hello";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
	}
}