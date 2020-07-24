package Module4;


class secondthread extends Thread
{
//print tables of 5
	public void run()
	{
		int number=5, product;
		System.out.println("The table of 5:\n");
		for(int i=1;i<=10;i++)
		{
			product = number * i;
			System.out.println(number + "x" + i + "=" + product);
		}
	}
	
}

public class TwoThreads {

	public void displayeven()
	{
		int count=0;
		System.out.println("The twenty even numbers are:\n");
		
		for(int i=1;;i++)
		{
			
			if(i % 2 == 0)
			{
				System.out.println(i);
		
				count++;
		
				if(count == 20)
				{
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		secondthread t2=new secondthread();
		t2.start();
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		TwoThreads t1=new TwoThreads();
		t1.displayeven();
	
		
		
	}

}
