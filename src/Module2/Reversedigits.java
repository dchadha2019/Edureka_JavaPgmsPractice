package Module2;

public class Reversedigits {

	public static void main(String[] args) {
		
		// Reverse digits of a number
		
		int num=1234;
		
		int newnum, diff, remainder;
		
		newnum = 0;
		
		while(num >= 10)
		{
			remainder = num % 10;
			
			newnum = (newnum + remainder) * 10;
			
			diff = num - remainder; 
			
			num = diff / 10;
		}	
		newnum = newnum + num;
		
			System.out.println("The reverse digits of the number is: "+ newnum);
			
			
	
	}

}
