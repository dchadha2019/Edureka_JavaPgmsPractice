package Module2;

public class SwapNum {

	
	static void swap(int n1, int n2)
	{
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("The swapped numbers are:");
		System.out.println("num1: " + n1);
		System.out.println("num2: "+ n2);
			
	}
	
	public static void main(String[] args)
	{
		// swap two numbers
		
		int num1 = 10, num2 = 20;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: "+ num2);
		SwapNum.swap(num1, num2); 
			

	}

}
