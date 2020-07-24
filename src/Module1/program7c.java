package Module1;

public class program7c {

	public static void main(String[] args) {
		//find factorial of a number
		int i=5,j=1;
		int k=i;
		do
		{
			j=k*j;
			k--;
		}while(k>=1);
		System.out.println("The factorial of " + i + " is " + j);

	}

}
