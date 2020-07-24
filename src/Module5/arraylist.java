package Module5;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// insert 1 to 10 numbers in an ArrayList and display them
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10 ; i++)
		{
			arr.add(i);
		}
		System.out.println(arr);

	}

}
