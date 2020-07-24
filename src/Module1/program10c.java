package Module1;

public class program10c {

	public static void main(String[] args) {
		// reverse the digits of a number
		int num=1234;
		int digit;
		int count=0;
		int j=num;
		
		do	
		{
				j=j/10;
				count=count+1;
			}while(j>0);
		
		int units=1;
		int c=count;
		do
			{
				units=units*10;
				c--;
			}while(c>0);
		
		units = units /10;
		int newnum,total=0;
		int i=units;
		
		do
			{
				digit=num%10;
				newnum=i*digit;
				total=total+newnum;
				i=i/10;
				num=num/10;
			}while(i>0);
		System.out.println(total);
	}

}
