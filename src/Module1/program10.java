package Module1;

public class program10 {

	public static void main(String[] args)
	{
		// reverse the digits of a number
		int num=1234;
		int digit;
		int count=0;
		for(int j=num;j>0;)
		{
				j=j/10;
				count=count+1;
		}
		
		int units=1;
		
		for(int c=count;c>0;c--)
		{
				units=units*10;
		}
		
		units = units /10;
		int newnum,total=0;
		
		for(int i=units;i>0;)
		{
				digit=num%10;
				newnum=i*digit;
				total=total+newnum;
				i=i/10;
				num=num/10;
		}
		
		System.out.println(total);
		
	}

}
