package Module1;

public class program7 {

	public static void main(String[] args) 
	{
		//find factorial of a number
		int i=5,j=1;
		
		for(int k=i;k>=1;k--)
		{
			j=k*j;
			
		}
		System.out.println("The factorial of " + i + " is " + j);
	}
}
