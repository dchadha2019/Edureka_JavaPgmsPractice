package Module1;

public class program6b {

	public static void main(String[] args) {
	
		//print 10 even numbers and 10 odd numbers
		
		int i=1;
		while(i<=20)
		{
			if(i%2==0) {
		
				System.out.println("even number: " + i);
			}
			else
			{
				System.out.print("odd number: " + i);
				System.out.print(" ");
			}
			i++;
		}
	
	}

}
