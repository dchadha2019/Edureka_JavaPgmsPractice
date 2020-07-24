package Module2;

public class PrintIntandString {

	static void print(int num)
	{
		System.out.println(num);
	}
	
	static void print(String str) 
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// Print integer and String data using function overloading
		PrintIntandString.print("This year is ");
		PrintIntandString.print(2020);
		
		

	}

}
