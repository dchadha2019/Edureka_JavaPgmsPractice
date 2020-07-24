package Module4;

public class ExceptionHandle {

	void displayarray()
	{
		int numarr[]={10,20,30,40,50};
		System.out.println("The numbers in the array are: ");
		try
		{
		for(int i=0;i<=5;i++)
		{
			System.out.println(numarr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The exception is: " + e);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandle e= new ExceptionHandle();
		
		e.displayarray();
		
		
	}

}
