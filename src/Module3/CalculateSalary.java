package Module3;

import java.util.Scanner;

public class CalculateSalary {

	void calculatesalary(long basicsal,long hra, long da, long taxamt) 
	{
		long netsalary, grosssalary;
		
		grosssalary=basicsal + hra + da;
		
		netsalary= grosssalary - taxamt;
		
		display(netsalary);
		
	}
	
	void inputdata()
	{
		long basicsalary;
		long hra;
		long da;
		long tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your basic salary:");
		
			
		basicsalary = sc.nextLong();
		
		System.out.println("Enter your HRA amount:");
		hra = sc.nextLong();
		
		System.out.println("Enter your DA amount:");
		da = sc.nextLong();
		
		System.out.println("Enter your tax amount:");
		tax = sc.nextLong();
		
		calculatesalary(basicsalary,hra,da,tax);
		
	}
	
	void display(long totalnetsalary)
	{
		System.out.println("Your Net Salary is:"+totalnetsalary);
		
	}
	
	
	public static void main(String[] args) {
		// Calculate basic salary

		CalculateSalary c=new CalculateSalary();		
		c.inputdata();
		
	}

}
