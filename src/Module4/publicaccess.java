package Module4;

import java.util.Scanner;

public class publicaccess {

	public void subtract(int n1, int n2)
	{
		int sub;
		if(n1 > n2)
		{
			sub = n1 - n2;
		}
		else
			sub = n2 - n1;
		
		System.out.println("Subtraction of "+ n1 + " and "+ n2 + " is: "+ sub);
	}
	
	public void multiply(int n1, int n2)
	{
		int product;
		
		product = n1 * n2;
		
		System.out.println("Product of "+ n1 + " and "+ n2 + " is: "+ product);
		
	}
	
	public void divide(int n1, int n2)
	{
		float division;
		
		if(n1 > n2)
		{
		division = n1 / n2;
		}
		else
			division = n2 / n1;
		
		System.out.println("Division of "+ n1 + " and "+ n2 + " is: "+ division );
	}
	
	public void factorial(int n3)
	{
		int factorial = 1;
		for(int i=n3;i>0;i--)
		{
			factorial = factorial * i;
		}
		System.out.println("The factorial of "+ n3 + " is " + factorial);
	}
	
	public void reversedigits(int number)//123
	{
		int digit, newnum=0, diff, remainnum;
		
	while(number > 10)
	{
		digit = number % 10; 
		
		
		newnum = (newnum + digit)*10;
		
		diff = number - digit; 
		
		number = diff / 10; 
		
	}
		newnum = newnum + number;
		System.out.println("The reversed number is: "+ newnum);
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		publicaccess p = new publicaccess();
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any two numbers you want to subtract, multiply and divide \n");
		
		System.out.println("Number 1: \n");
		num1=sc.nextInt();
		
		System.out.println("Number 2: \n");
		num2 = sc.nextInt();
		
		p.subtract(num1,num2);
		
		p.multiply(num1,num2);
		
		p.divide(num1,num2);
		
		System.out.println("Please enter the number to find its factorial \n");
		
		int factnum;
		
		factnum=sc.nextInt();
		
		p.factorial(factnum);
		
		System.out.println("Please enter the number you want to reverse \n");
		
		int revnum;
		
		revnum=sc.nextInt();
		
		p.reversedigits(revnum);
		
		
	}

}
