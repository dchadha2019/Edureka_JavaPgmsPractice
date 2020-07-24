package Module1;

public class program9 {

	public static void main(String[] args)
	{
		//add the digits of a number
		int num;
		int total=0;
		
		for(num=123;num>0; )
		{
			int digit = num % 10; 
					
			total = total + digit;
			
			num = num / 10; 
		}
		
	
		System.out.println("The total of adding digits of a number is: "+ total);
	
	}

}

