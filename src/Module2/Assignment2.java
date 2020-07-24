package Module2;

import java.util.Scanner;

public class Assignment2 {

	static void display(int employeeid[],String employeename[],int employeesalary[])
	{
		System.out.print("ID ");
		System.out.print(" Name ");
		System.out.print(" Salary");
		for(int k=0;k<5;k++)
		{
			System.out.println("");
			System.out.print(employeeid[k]+"  ");
			System.out.print(employeename[k]+"  ");
			System.out.print(employeesalary[k]+"  ");
			
		}
		
	}
	static void display(int employeeid[],String employeename[])
	{
		System.out.println("");
		System.out.print("ID ");
		System.out.print(" Name ");
		for(int k=0;k<5;k++)
		{
			System.out.println("");
			System.out.print(employeeid[k]+"  ");
			System.out.print(employeename[k]+"  ");
			
			
		}
		
	}

		public static void main(String[] args) {
			int empid[]=new int[5];
			int salary[]=new int[5];
			String empnames[]=new String[5];
			System.out.println("Please enter 5 employee ids with their names and salaries");
			
			for(int i=0;i<5;i++) 
			{
			Scanner sc = new Scanner(System.in);
			System.out.println("Employee "+ (i+1) +" Id:");
			empid[i]=sc.nextInt();
			System.out.println("Employee "+ (i+1) +" Name:");
			empnames[i] = sc.next();
			System.out.println("Employee "+ (i+1) +" Salary:");
			salary[i]=sc.nextInt();
			}
			display(empid,empnames,salary);
				display(empid,empnames);
			
		}

}
