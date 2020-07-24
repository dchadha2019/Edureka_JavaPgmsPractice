package Module2;

public class ReverseArray {

	public static void main(String[] args) {
		// reverse the elements of the array
		
		//int arr[]= {1,2,3,4,5};
		int arr[]= {5,4,3,2,1};
		//int arr[]= {3,4,2,1,5};
		int tempvar,j=4,i=0;
		
		for(int k=0;k<3;k++)
		{
				tempvar= arr[i];
				arr[i] = arr[j];
				arr[j] = tempvar;
				i++;
				j--;
			
		}
		System.out.println("The reverse of the array is:");
		
		for(int n=0; n<=4;n++)
		{
			System.out.print(arr[n]);
		}
		
		
		
		
	}

}
