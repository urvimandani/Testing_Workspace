package com.program;

public class GreatestNumber 
{
	public static void main(String[] args) 
	{
		int a=30;
		int b=20;
		int c=60;
		
		if (a>b)
		{
			if(a>c)
				System.out.println(a);
			
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
			{
				System.out.println(c);
			}
		}
			
		
	}

}
