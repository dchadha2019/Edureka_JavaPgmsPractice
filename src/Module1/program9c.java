package Module1;

public class program9c {

	public static void main(String[] args) {
		
		//add the digits of a number
		int num=123;
		int total=0;
		
		do
		{
			int digit = num % 10; 
					
			total = total + digit;
			
			num = num / 10; 
		}while(num>0);
		
	
		System.out.println("The total of adding digits of a number is: "+ total);

	}

}
