package Module3;

import java.util.Scanner;

abstract class Account
{
	String accountnumber;
	String personname;
	double amount;
	
	abstract void createaccount();
	abstract void deposit();
	abstract void withdraw();
}

final class SB_Account extends Account
{
	final double minbalance = 3000;
	
	Scanner sc = new Scanner(System.in);
	
	void createaccount()
	{
		System.out.println("Welcome to SB Account");
		
		System.out.println("What is your name?");
		personname=sc.nextLine();
		
		System.out.println("How much would you like to deposit to open the account?"
				+ "We have a minimum balance limit of:  "+ "Rs. "+ minbalance);
		
		amount=sc.nextDouble();
		
		accountnumber="SB-AC0001A";
		
		System.out.println("Your SB account has been created.");
		
		System.out.println("Here is your receipt >>");
		System.out.println("Name: "+personname);
		
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Deposit Amount: "+"Rs. "+ amount);
		
	}
	
	void deposit()
	{
		System.out.println("Welcome to SB Account");
		
		System.out.println("What is your name?");
		personname=sc.nextLine();
		
		System.out.println("What is your account number?");
		accountnumber=sc.nextLine();
		
		System.out.println("How much would you like to deposit to your account?");
		
		amount=sc.nextDouble();
		
		System.out.println("Here is your receipt >>");
		System.out.println("Name: "+personname);
		
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Deposit Amount: "+"Rs. "+ amount);
		
				
	}
	void withdraw()
	{
		System.out.println("Welcome to SB Account");
		
		System.out.println("What is your name?");
		personname=sc.nextLine();
		
		System.out.println("What is your account number?");
		accountnumber=sc.nextLine();
		
		System.out.println("How much would you like to withdraw from your SB Account?");
		
		amount=sc.nextDouble();
		
		System.out.println("Here is your receipt >>");
		System.out.println("Name: "+personname);
		
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Withdrawn Amount: "+"Rs. "+ amount);
		
		
	}
}

final class current_account extends Account
{
	Scanner sc = new Scanner(System.in);
	final double minbalance = 10000;
	
	void createaccount()
	{
		System.out.println("Welcome to Current Account");
		
		System.out.println("What is your name?");
		personname=sc.nextLine();
		
		System.out.println("How much would you like to deposit to open the account?"
				+ "We have a minimum balance limit of:  "+ "Rs. "+ minbalance);
		
		amount=sc.nextDouble();
		
		accountnumber="CA-AC0001A";
		
		System.out.println("Your Current account has been created and your account number is: "+ accountnumber);
	}
	
	
	void deposit()
	{
		System.out.println("Welcome to Current Account");
		
		System.out.println("What is your name?");
		personname=sc.nextLine();
		
		System.out.println("What is your account number?");
		accountnumber=sc.nextLine();
		
		System.out.println("How much would you like to deposit to your account?");
		
		amount=sc.nextDouble();
		
		System.out.println("Here is your receipt >>");
		System.out.println("Name: "+personname);
		
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Deposit Amount: "+"Rs. "+ amount);
			
	}
	
	void withdraw()
	{
		System.out.println("Welcome to Current Account");
		
		System.out.println("What is your name?");
		personname=sc.nextLine();
		
		System.out.println("What is your account number?");
		accountnumber=sc.nextLine();
		
		System.out.println("How much would you like to withdraw from your Current Account?");
		
		amount=sc.nextDouble();
		
		System.out.println("Here is your receipt >>");
		System.out.println("Name: "+personname);
		
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Withdrawn Amount: "+"Rs. "+ amount);
		
		
	}
	
}


public class BankAccount {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String account_choice;
		SB_Account sb=new SB_Account();
		current_account c=new current_account();
		
		System.out.println("Welcome! Which account would you like to create?");
		System.out.println("a. SB Account");
		System.out.println("b. Current Account");
		System.out.println("c. You already have an account");
		
		System.out.println("Please enter a or b or c");
		
		
		account_choice=sc.next();
		
		if(account_choice.equalsIgnoreCase("a"))
		{
			
			sb.createaccount();
		}
		
		if(account_choice.equalsIgnoreCase("b"))
		{
			
			c.createaccount();
		}
		if(account_choice.equalsIgnoreCase("c"))
		{
		
		System.out.println("Would you like to deposit money to your account?\n");
		System.out.println("Please enter yes or no");
		String depositchoice;

		depositchoice = sc.next();
		
			if(depositchoice.equalsIgnoreCase("yes"))
			{
			System.out.println("Which account you would like to deposit money to?\n");
			System.out.println("a. SB Account");
			System.out.println("b. Current Account");
			
			System.out.println("Please enter a or b");
			account_choice=sc.next();
				
			
				if(account_choice.equalsIgnoreCase("a"))
				{
				sb.deposit();
				}
				if(account_choice.equalsIgnoreCase("b"))
				{
				c.deposit();
				}
			}
			if(depositchoice.equalsIgnoreCase("no"))
			{
		
				System.out.println("Would you like to withdraw money from your account?\n");
				System.out.println("Please enter yes or no");
		
				String withdrawchoice;
				withdrawchoice=sc.next();
				if(withdrawchoice.equalsIgnoreCase("Yes"))
				{
					System.out.println("From which account would you like to withdraw?\n");
					System.out.println("a. SB Account");
					System.out.println("b. Current Account");
					account_choice=sc.next();
					if(account_choice.equalsIgnoreCase("a"))
					{
						sb.withdraw();
					}
					if(account_choice.equalsIgnoreCase("b"))
					{
						c.withdraw();
					}
				}
				if(withdrawchoice.equalsIgnoreCase("no"))
				{
					System.out.println("How can we help you with? Please speak to our Bank Manager for further assistance");
				}
			}	

		}
	}
}
	
		
