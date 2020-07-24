package Module1;

public class program7b {

	public static void main(String[] args) {
		
		//find factorial of a number
				int i=5,j=1;
				int k=i;
				while(k>=1)
				{
					j=k*j;
					k--;
				}
				System.out.println("The factorial of " + i + " is " + j);
	}

}
