package com.program;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int n = 370;
		int arm = n;
		int i,sum=0;
		
		while(n>0)
		{
			i = n%10;
			n = n/10;
			sum = sum + i*i*i;
		}
		if(arm ==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
		
	}
}


