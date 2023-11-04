package com.program;

class A1
{
	//method
	void a()
	{
		System.out.println("A Accessed");
	}
}
class B1 extends A1
{
	//method
	void b()
	{
		System.out.println("B Accessed");
	}
}
public class ExtendingThreadClass
{
	public static void main(String[] args) 
	{
		B1 b = new B1();
		
		b.a();
		b.b();
		
	}
}