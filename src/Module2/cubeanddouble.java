package Module2;

public class cubeanddouble {

	
	static int cube(int n1)
	{
		int cubenum1;
		cubenum1=n1*n1*n1;
		
		return cubenum1;
	}
	
	static double cube(double n2)
	{
		double cubenum2;
		cubenum2=n2*n2*n2;
		return cubenum2;
	}
	public static void main(String[] args) 
	{
		// cube of an integer and double values using function overloading
		int num1=3;
		double num2=3.5;
		
		int cubeint=cubeanddouble.cube(num1);
		System.out.println("The cube of an integer num "+num1+"is: "+cubeint);
		
		double cubedouble=cubeanddouble.cube(num2);
		System.out.println("The cube of a double type num "+num2+"is: "+cubedouble);
		
		
		

	}

}
