package certproject;

import java.util.Scanner;



class ATM2THREAD extends Thread
{
	public void run()
	{
		ATM a = new ATM();
		
		
		Scanner sc = new Scanner(System.in);
		int choice1;
		
		synchronized(a)
		{
			try
			{
			a.wait(21000);
			}
			catch(InterruptedException e)
			{ e.printStackTrace();
			
			}
		System.out.println("ATM #002");
		System.out.println("Welcome to the ATM Application");
		System.out.println("Please enter your Debit card number and ATM pin number");
		
		long debitcardnum, pinnum;
		
		
		System.out.println("ATM #002");
		System.out.print("Debit card number: ");
		debitcardnum = sc.nextLong();
		
		System.out.println("ATM #002");
		System.out.print("ATM pin number: ");
		pinnum = sc.nextLong();
		
		/*try
		{
		Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{ e.printStackTrace();
		
		}*/
		
		System.out.println("ATM #002");
		System.out.println("**Welcome to your account**");
		System.out.println("What would you like to do:");
		System.out.println("1. Check your balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		
		System.out.println("Please enter your choice - 1, 2 or 3");
			
		choice1 = sc.nextInt();
		
		//check your balance
		if(choice1 == 1)
		{
			System.out.println("ATM #002");
			System.out.println("Which account you want to check:");
			System.out.println("1. Checking Account");
			System.out.println("2. Savings Account");
			System.out.println("Please enter your choice - 1 or 2");
			int choice2;
			choice2 = sc.nextInt();
			
			
			if(choice2==1)
			{ 
				System.out.println("ATM #002");
				a.showBalance(choice2);
			}
			if(choice2==2)
			{
				System.out.println("ATM #002");
				a.showBalance(choice2);
			}
		}
		
		//deposit money
		
		if(choice1 == 2)
		{
			System.out.println("ATM #002");
			System.out.println("To which account you would like to deposit money in:");
			System.out.println("1. Checking Account");
			System.out.println("2. Savings Account");
			System.out.println("Please enter your choice - 1 or 2");
			int choice3;
			
			choice3 = sc.nextInt();
			
			
			
			if(choice3 == 1)
			{
				System.out.println("ATM #002");
				a.depositMoney(choice3);
				
			}
			if(choice3 == 2)
			{
				System.out.println("ATM #002");
				a.depositMoney(choice3);
				
			}
		}
		
		//withdraw money
		
		if(choice1 == 3)
		{
			System.out.println("ATM #002");
			System.out.println("From which account you want to withdraw money from:");
			System.out.println("1. Checking Account");
			System.out.println("2. Savings Account");
			System.out.println("Please enter your choice - 1 or 2");
			int choice4;
			
			choice4 = sc.nextInt();
			/*try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}*/
			
			if(choice4 == 1)
			{
				System.out.println("ATM #002");
				a.withdrawMoney(choice4);
				
			}
			if(choice4 == 2)
			{
				System.out.println("ATM #002");
				a.withdrawMoney(choice4);
				
			}
		}
		
	}
}
}

		
public class ATM extends Thread{
	
	
		double checkingbalance =1500;
		double savingsbalance = 3000;
		
		double totalchkbalance = 0;
		double totalsavbalance = 0;
		
		double checkingdeposit;
		double savingsdeposit;
		double checkingwithdraw;
		double savingswithdraw;
	
	public void run()
	{
		ATM a = new ATM();
		Scanner sc = new Scanner(System.in);
		int choice1;
		
		
			synchronized(a)
			{
		System.out.println("ATM #001");
		System.out.println("Welcome to the ATM Application");
		System.out.println("Please enter your Debit card number and ATM pin number");
		
		long debitcardnum, pinnum;
		
		
		System.out.println("ATM #001");
		System.out.print("Debit card number: ");
		debitcardnum = sc.nextLong();
		
		System.out.println("ATM #001");
		System.out.print("ATM pin number: ");
		pinnum = sc.nextLong();
		
		System.out.println("ATM #001");
		System.out.println("**Welcome to your account**");
		System.out.println("What would you like to do:");
		System.out.println("1. Check your balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		
		System.out.println("Please enter your choice - 1, 2 or 3");
		
		
		
		choice1 = sc.nextInt();
		
		
		//check your balance
		
		if(choice1 == 1)
		{
			System.out.println("ATM #001");
			System.out.println("Which account you want to check:");
			System.out.println("1. Checking Account");
			System.out.println("2. Savings Account");
			System.out.println("Please enter your choice - 1 or 2");
			int choice2;
			choice2 = sc.nextInt();
			
			if(choice2==1)
			{
				showBalance(choice2);
			}
			if(choice2==2)
			{
				showBalance(choice2);
			}
		}
		//a1.notify();
		
		//deposit money
		if(choice1 == 2)
		{
			System.out.println("ATM #001");
			System.out.println("To which account you would like to deposit money in:");
			System.out.println("1. Checking Account");
			System.out.println("2. Savings Account");
			System.out.println("Please enter your choice - 1 or 2");
			int choice3;
			
			choice3 = sc.nextInt();
			
			
			if(choice3 == 1)
			{
				System.out.println("ATM #001");
				depositMoney(choice3);
				
			}
			if(choice3 == 2)
			{
				System.out.println("ATM #001");
				depositMoney(choice3);
				
			}
		}
		//a1.notify();
		
		//withdraw money
		if(choice1 == 3)
		{
			System.out.println("ATM #001");
			System.out.println("From which account you want to withdraw money from:");
			System.out.println("1. Checking Account");
			System.out.println("2. Savings Account");
			System.out.println("Please enter your choice - 1 or 2");
			int choice4;
			
			choice4 = sc.nextInt();
			
			
			
			if(choice4 == 1)
			{
				System.out.println("ATM #001");
				withdrawMoney(choice4);
				
			}
			if(choice4 == 2)
			{
				System.out.println("ATM #001");
				withdrawMoney(choice4);
				
			}
		}
		a.notify();
	}
	}
	
	
	void showBalance(int customerchoice)
	{
		
		if(customerchoice == 1)
		{
			System.out.println("Welcome to checking account");
			
			totalchkbalance = checkingbalance;
			System.out.println("Your current balance is: "+ totalchkbalance);
		}
		if(customerchoice == 2)
		{
			System.out.println("Welcome to savings account");
			
			totalsavbalance = savingsbalance;
			System.out.println("Your current balance is: "+ totalsavbalance);
		}
	}
	
	void depositMoney(int choice)
	{
	
	Scanner sc1 = new Scanner(System.in);
		if(choice == 1)
		{
			System.out.println("How much money you would like to deposit?");
			checkingdeposit = sc1.nextDouble();
			checkingbalance = checkingbalance + checkingdeposit;
			 	showBalance(choice);
		}	
		
		if(choice == 2)
		{
			System.out.println("How much money you would like to deposit?");
			savingsdeposit = sc1.nextDouble();
			
			savingsbalance = savingsbalance + savingsdeposit;
			showBalance(choice);
			
		}
		
	}
	
	void withdrawMoney(int accountchoice)
	{
		Scanner sc2 = new Scanner(System.in);
		if(accountchoice == 1)
		{
			System.out.println("How much money you would like to withdraw?");
			checkingwithdraw = sc2.nextDouble();
			checkingbalance = checkingbalance - checkingwithdraw;
			 	showBalance(accountchoice);
		}	
		
		if(accountchoice == 2)
		{
			System.out.println("How much money you would like to deposit?");
			savingswithdraw = sc2.nextDouble();
			
			savingsbalance = savingsbalance - savingswithdraw;
			showBalance(accountchoice);
			
		}
	}	
		

	
	
	public static void main(String[] args) {
		
		ATM a1 = new ATM();
		
		
		a1.start();
		
		ATM2THREAD a2 = new ATM2THREAD();
		
		
		a2.start();
		
 }
}
		
		
	


