package com.program;

public class MaxiandMiniValueofArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {12,34,10,87,65};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		System.out.println(" Minimum " + min + " Maximum " + max);
	}
}