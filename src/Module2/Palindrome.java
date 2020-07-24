package Module2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// check given string is palindrome or not
		//radar, rotator, abba, mom
		System.out.println("Enter the text");
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		
		int length;
		length = str.length();
	
		int i=0;
		int j=length - 1;
		
		while(i != j && j > i)
		{
			if(str.charAt(i) != str.charAt(j)) 
			{
			System.out.println("The string is not a palindrome");
			break;
			}
						
			if(str.charAt(i) == str.charAt(j))
			{
				
				i++;
				j--;
				if(i == j || j < i )
				{
					System.out.println("The string is a palindrome");
					break;
				}
			}
		
		}
		
			
		}
		


			
	

}
