package Module2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// Check given number is a prime number or not
		// 2,3,5,7,11,13,17,19,23,29

		
		int num;
		
		System.out.println("Enter any number");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		int count=0;
		for(int n=1;n<=19;n++)
		{
			if(num % n == 0)
			{
				count++;
				if(count > 2)
				{
				System.out.println("The number is not a prime number");
				break;
				}
			}
		}
		if(count <= 2)
				System.out.println("The number is a prime number");			
			
		
			
		}
		
	
	}


