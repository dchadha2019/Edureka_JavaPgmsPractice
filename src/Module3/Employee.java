package Module3;

import java.util.Scanner;

class EmployeeWorking
{
	double salary;
	double earn()
	{
		return salary;
	}
	
	void work()
	{}
	
}

class Developer extends EmployeeWorking
{
	Scanner sc = new Scanner(System.in);
	double earn(int payperhr)
	{
		salary=payperhr * 2000;
		
		
		return salary;
	}
	
	void work()
	{
		System.out.println("The developer develops software applications");
	}
	
	}

class Tester extends EmployeeWorking
{

	double earn(int pay)
	{
		salary = pay * 2000;
		return salary;
	}
	
	void work()
	{
		System.out.println("The Tester tests the software applications");
	}
	
}


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer d=new Developer();
		double sal;
		int payrate;
		System.out.println("What is the avg. per hour pay rate of a Developer?");
		Scanner sc = new Scanner(System.in);
		payrate=sc.nextInt();
		sal=d.earn(payrate);
		System.out.println("The average salary of a developer per annum is: "+"$ "+ sal);
		
		d.work();

		Tester t=new Tester();
		System.out.println("");
		System.out.println("What is the avg. per hour pay rate of a Tester?");
		payrate=sc.nextInt();
		sal=d.earn(payrate);
		System.out.println("The average salary of a Tester per annum is: "+ "$ "+ sal);
		t.work();
		
		
		
	}

}
