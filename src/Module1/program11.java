package Module1;

public class program11 {

	public static void main(String[] args) {
		// generate 10 fibonacci numbers
		int num1=0;
		int num2=1;
		int num3;
		System.out.println("Fibonacci numbers are: ");
		System.out.println(num1);
		System.out.println(num2);
		for(int n=1;n<=8;n++)
		{
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		

	}

}
