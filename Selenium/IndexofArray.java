package com.program;

import java.util.Scanner;

public class IndexofArray 
{
	public static void main(String[] args) 
	{
		int[] a = {2,5,4,6,7,8,1};
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the index position to get element");
		int index = sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(index==i)
			{
				System.out.println(a[i]);
			}
			
		}
		
	}

}
