package secondpackage;
import java.util.Scanner;

import Module4.publicaccess;

public class copyclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		publicaccess p1=new publicaccess();
		
		
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any two numbers you want to subtract, multiply and divide \n");
		
		System.out.println("Number 1: \n");
		num1=sc.nextInt();
		
		System.out.println("Number 2: \n");
		num2 = sc.nextInt();
		
		p1.subtract(num1,num2);
		
		p1.multiply(num1,num2);
		
		p1.divide(num1,num2);
		
		System.out.println("Please enter the number to find its factorial \n");
		
		int factnum;
		
		factnum=sc.nextInt();
		
		p1.factorial(factnum);
		
		System.out.println("Please enter the number you want to reverse \n");
		
		int revnum;
		
		revnum=sc.nextInt();
		
		p1.reversedigits(revnum);
		
		
		
		
		
		
	}

}
