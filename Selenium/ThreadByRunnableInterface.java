package com.program;

interface Thread
{
	void thread();

	
}
class Multi implements Thread
{

	@Override
	public void thread() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}
	
}
public class ThreadByRunnableInterface
{
	public static void main(String[] args) 
	{
		Multi m1 = new Multi();  
		m1.thread();  
		
	}
}