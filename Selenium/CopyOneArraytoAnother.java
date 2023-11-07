package com.program;

public class CopyOneArraytoAnother 
{
	public static void main(String[] args) 
	{
		int[] original = {10,30,46,79,95};
		int[] copy =original;
		
		System.out.println("Original Array is:");
		for(int i=0;i<original.length;i++)
			System.out.println(original[i]+"\t");
		
		System.out.println("\nCopied Array is");
		for(int i=0;i<copy.length;i++)
			System.out.println(copy[i]+"\t");
		
		
	}

}
