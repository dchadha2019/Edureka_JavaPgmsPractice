package Module4;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Print values from 0 to 10: \n");
		
		for(int i=0;i<=10;i++)
		{
			System.out.print(i + " ");
		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("\n");
		System.out.println("Print values from 101 to 110: \n");
		
		for(int i=101; i<=110; i++)
		{
			System.out.print(i + " ");
		}
	}

}



public class CaseStudy1 {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
		
		
	}

}
