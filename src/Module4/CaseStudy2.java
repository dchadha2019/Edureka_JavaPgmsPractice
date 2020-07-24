package Module4;

import java.util.Scanner;

interface HrTeam
{
	public void hireEmployee();
}

class HR implements HrTeam
{
	public void hireEmployee()
	{
		System.out.println("HR Department");
	}
}

class TECH implements HrTeam
{
	public void hireEmployee()
	{
		System.out.println("TECH Department");
	}
}

class PRODUCT implements HrTeam
{
	public void hireEmployee()
	{
		System.out.println("PRODUCT Department");
	}
}



public class CaseStudy2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Job Application Form \n");
			System.out.println("Please enter your name: ");
		
			Scanner sc = new Scanner(System.in);
		
			String candidatename;
			candidatename = sc.next();
		try
		{
			System.out.println("Please enter your marks: ");
			int marks;
			
			marks = sc.nextInt();
			if(marks > 70)
			{
			System.out.println("You are eligible for the interview process in the following departments: \n");
			HR h = new HR();
			h.hireEmployee();
			
			TECH t = new TECH();
			t.hireEmployee();
			
			PRODUCT p = new PRODUCT();
			p.hireEmployee();
			}
		
		else
		throw new Exception("We are sorry, you need to have more than 70 to be eligible for the interview");	
		}catch(Exception e)
				{
					System.out.println("Exception is " + e);
				}	
		
		}
	}
			
			
		
		
		
		
		
	


