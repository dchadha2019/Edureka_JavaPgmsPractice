package Module2;

public class Factorial {

	static int factorialfunc(int num)
	{
		int factorialnum=1;
	
		for(int n=num; n >= 1; n--)
		{
			factorialnum=factorialnum * n;
		}
		return factorialnum;
	}
	
	public static void main(String[] args) {
		// Find factorial of a number
		int number=6;
		
		int factorialnumber;
		
		factorialnumber=Factorial.factorialfunc(number);
		System.out.println("The factorial of "+number+" is: " +factorialnumber);
		

	}

}
