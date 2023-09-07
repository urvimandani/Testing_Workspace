import java.util.Scanner;

public class task2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your First name");
		String name = sc.next();
		
		System.out.println("Enter your Last name");
		String name2 = sc.next();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Your Email id");
		String Email = sc.next();
		
		System.out.println(name+""+name2+""+salary+""+Email);
		if(salary>=75000)
		{
			System.out.println("75000-50000 loan");
		}
		else if(salary>=50000)
		{
			System.out.println("50000-25000 loan");
		}
		else if(salary>=25000)
		{
			System.out.println("25000-12000");
		}
	}
	


		
		
	
	
		

		
	}
	

}
