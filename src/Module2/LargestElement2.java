package Module2;

public class LargestElement2 {

	public static void main(String[] args) {
		// find the largest element in the array
		//find the second largest element in the array
		
		//int arr[]= {1,2,3,4,5};
		int arr[]= {5,2,3,4,1};
		//int arr[]= {1,2,5,4,3};
		//int arr[]= {1,2,3,4,-5};
		//int arr[]= {1,2,3,5,4};
		
		int i = 0,maxvar = arr[i];
		//int j = 0;
		int secondmax = arr[i];
		//int k=1;
		
		for(i=1;i<5;i++)
		{
			if(maxvar < arr[i])
			{
				secondmax = maxvar;
				maxvar = arr[i];
			}
			
			else if(secondmax == maxvar || secondmax < arr[i]) //&& arr[i] != maxvar)
			{
				secondmax = arr[i];
			}
			
			/*if(secondmax < arr[i] && arr[i] != maxvar)
			{
				secondmax = arr[i];
			}*/
			
			
			/*
			if(arr[j] > arr[k] && arr[j] != maxvar)
			{
				secondmax = arr[j];
			}
			
			if(arr[j] < arr[k] && arr[k] != maxvar)
			{
				arr[j] = arr[k];
				
				secondmax = arr[j];
			}
			
			if((arr[j] == maxvar || arr[j] < arr[k]) && (arr[k] != maxvar))
				{
				j++;
				secondmax = arr[j];
				}
				
			k++;*/
			
			
		}	
		
		System.out.println("The second largest num in the array is: "+ secondmax);
		System.out.println("The largest num in the array is: "+ maxvar);
		
				
		/* method 2 of code works - drawback two loops
		int secondmax;
		int j=0;
		secondmax = arr[j];
		for(j=1;j<5;j++)
		
			if((secondmax <  arr[j] && arr[j] != maxvar) || secondmax == maxvar) secondmax = arr[j];	
				
				
		
		System.out.println("The second largest num in the array is: " + secondmax);*/
		
	
	}
}		
		
	
