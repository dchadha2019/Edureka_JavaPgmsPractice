package Module2;

import java.util.Scanner;

public class DisplayEmpInfo {

	static void display(int empid[], String empname[], double empsalary[])
	{
		System.out.print("ID      ");
		System.out.print("   Name    ");
		System.out.print("     Salary  ");
		for(int n=0;n<=4;n++)
		{
		System.out.println("");
		System.out.print(empid[n]);
		System.out.print("         ");
		System.out.print(empname[n]);
		System.out.print("         ");
		System.out.print(empsalary[n]);
		System.out.println("");
		}
	}
	
	static void display(int empID[],String empName[])
	{
		System.out.println("");
		System.out.print("ID      ");
		System.out.print("   Name");
		

		for(int n=0;n<=4;n++)
		{
		System.out.println("");
		System.out.print(empID[n]);
		System.out.print("         ");
		System.out.print(empName[n]);
		System.out.println("");
		}
	}
	
	static void display(String namesearch,int EmpId[],String EmpName[],double EmpSal[])
	{
		
	for(int n=0;n<5;n++)
	{
		if(namesearch.equalsIgnoreCase(EmpName[n]))
		{
			System.out.print("ID      ");
			System.out.print("   Name    ");
			System.out.print("     Salary  ");
			System.out.println("");
			System.out.print(EmpId[n]);
			System.out.print("         ");
			System.out.print(EmpName[n]);
			System.out.print("         ");
			System.out.print(EmpSal[n]);
			System.out.println("");
			
		}
	}
		
	}
	
	
	public static void main(String[] args) {
		// Display 5 Employees ID, Name and Salary
	
	int employeeid[]=new int[5];
	String employeename[]=new String[5];
	double employeesalary[]=new double[5];
	
	System.out.println("Enter five employees ids:");
	
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<5;i++)
	{
	employeeid[i] = sc.nextInt();
	}
	
	System.out.println("Enter five employee names:\n");
	
	for(int i=0;i<5;i++)
	{
		employeename[i]=sc.next();
		
	}
	//System.out.println();
	System.out.println("Enter five employee salaries:");
	
	for(int i=0;i<5;i++)
	{
		employeesalary[i]=sc.nextDouble();
	}
	
	DisplayEmpInfo.display(employeeid,employeename,employeesalary);

	DisplayEmpInfo.display(employeeid,employeename);
	
	
	System.out.println("Enter the employee name to display its records\n");
	
	String searchname;
	
	searchname=sc.next();
	
	
	DisplayEmpInfo.display(searchname,employeeid,employeename,employeesalary);
	
}
}
