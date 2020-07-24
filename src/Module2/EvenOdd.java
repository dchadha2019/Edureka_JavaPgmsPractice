package Module2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// To check given number is even or odd
		int num;
		
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}

}
