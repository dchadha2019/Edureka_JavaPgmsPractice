package Module4;

import java.util.Scanner;

interface Queue
{
	public void insert(int n1);
	public void delete(int n2);
	
}
public class assignment1 implements Queue{
	int queue =0;
	public void insert(int num1)
	{
		
		queue = queue + num1;
		System.out.println("The number of people in the queue are: " + queue);
	}
	
	public void delete(int num2)
	{
		queue = queue - num2;
		System.out.println("The number of people left in the queue are:" + queue);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment1 a1 = new assignment1();
		System.out.println("Please enter the number of people to insert in a queue:");
		Scanner sc = new Scanner(System.in);
		int numinsert, numdelete;
		numinsert=sc.nextInt();
		
		a1.insert(numinsert);
		
		System.out.println("Please enter the number of people to remove from a queue:");
		numdelete = sc.nextInt();
		a1.delete(numdelete);
		
	}

}
