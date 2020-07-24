package Module3;

abstract class Bank
{
	abstract void RateOfInterest();
	
}

class BankOfAmerica extends Bank
{
	void RateOfInterest()
	{
		System.out.println("");
		System.out.print("Bank Of America    ");
		System.out.print("  0.01%              ");//savings
		System.out.print(" 0.01%");
	}
	
}

class CapitalOne extends Bank
{
	void RateOfInterest()
	{
		System.out.println("");
		System.out.print("Capital One    ");
		System.out.print("      1.30%              ");//savings
		System.out.print(" 0.20%");
	}
	
}

class ChaseBank extends Bank
{
	void RateOfInterest()
	{
		System.out.println("");
		System.out.print("Chase Bank    ");
		System.out.print("       0.01%              ");//savings
		System.out.print("  0.01%");
		
	}
	
}

class Citibank extends Bank
{
	void RateOfInterest()
	{
		System.out.println("");
		System.out.print("Citibank    ");
		System.out.print("         0.04%              ");//savings
		System.out.print("  0.01%");
		
	}
	
}


public class Bank_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The following is the list of Banks in USA with the average rate of interest offered by each bank \n");
		System.out.print("Bank Names        ");
		System.out.print("Avg. Savings ROI  ");
		System.out.print("  Avg. Checking ROI ");
		
		BankOfAmerica b1=new BankOfAmerica();
		b1.RateOfInterest();
		
		CapitalOne b2=new CapitalOne();
		b2.RateOfInterest();
		
		ChaseBank b3=new ChaseBank();
		b3.RateOfInterest();

		Citibank b4=new Citibank();
		b4.RateOfInterest();
	}

}
