package Module2;

import java.util.Scanner;

public class Mod2Assignment2 {

	public static void main(String[] args)
	{
		// Search an element in an array
		int arr[]= {100,200,300,300,600};
		System.out.println("Enter the number to search for in an array");
		Scanner sc = new Scanner(System.in);
		int num;
		num=sc.nextInt();
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(num==arr[i])
			{
				System.out.println("Number is "+i+" element in an array");
			}
			else
			{
				count++;
			}
		}
			if(count==5)
			{
				System.out.println("Number not found in the array");
			}
			}
			
		
		
	}


