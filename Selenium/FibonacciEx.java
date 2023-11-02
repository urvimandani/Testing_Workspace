package com.program;

import java.util.Scanner;

public class FibonacciEx 
{
	public static void main(String[] args) 
	{
		
		int a=0;
		int b=1;
		System.out.println("Enter Number");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		
		System.out.println(a+" ");
		System.out.println(b+" ");
		
		for(int i=3; i<=n; i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c+" ");
		}
		
		
	}


}
