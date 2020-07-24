package Module3;

import java.util.Scanner;

public class CalcSalary {
	
	String emp_id;
	String empname;
	String empdept;
	long basicsal;
	long hra;
	long da;
	long tax;
	
	CalcSalary()
	{
		emp_id = "";
		empname = "";
		empdept = "";
		basicsal = 0;
		hra = 0;
		da = 0;
		tax = 0;
	}
	
	CalcSalary(String empid,String emp_name,String emp_dept,long basicsalary,long hra_amt,long da_amt,long tax_amt)
	{
		emp_id = empid;
		empname = emp_name;
		empdept = emp_dept;
		basicsal = basicsalary;
		hra = hra_amt;
		da = da_amt;
		tax = tax_amt;
		
	}
	
	void inputdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your employee id:");
		emp_id = sc.nextLine(); 
		System.out.println("Please enter your name:");
		empname = sc.nextLine(); 
		System.out.println("Please enter your department:");
		empdept = sc.nextLine(); 
		System.out.println("Please enter your basic salary:");
		basicsal = sc.nextLong(); 
		System.out.println("Please enter your HRA amount:");
		hra = sc.nextLong();
		System.out.println("Please enter your DA amount:");
		da = sc.nextLong();
		System.out.println("Please enter your tax amount:");
		tax = sc.nextLong();
		
	}
	long gross_salary()
	{
		long gross_sal = basicsal + hra + da;
		return gross_sal;
	}
	
	long netsalary(long gross_pay)
	{
		
		long netsal = gross_pay - tax;
		return netsal;
	}
	
	void display(long net_salary, long gross_salary)
	{
		System.out.println("");
		System.out.println("***********************");
		System.out.println("Employee ID: " + emp_id);
		System.out.println("Employee Name: " + empname);
		System.out.println("Department: " + empdept);
		System.out.println("Basic Salary: " + basicsal);
		System.out.println("HRA: " + hra);
		System.out.println("DA: " + da);
		System.out.println("Income Tax Amount: " + tax);
		System.out.println("Gross Salary: " + gross_salary);
		System.out.println("Net Salary: " + net_salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalcSalary c1=new CalcSalary();


		CalcSalary c2=new CalcSalary("","","",0,0,0,0);
		
		c2.inputdata();
		
		long grosssalary=c2.gross_salary();
		
		long netsalary=c2.netsalary(grosssalary);
		
		c2.display(netsalary, grosssalary);
	
	}

}
