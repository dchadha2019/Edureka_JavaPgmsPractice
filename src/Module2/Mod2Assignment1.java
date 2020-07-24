package Module2;

public class Mod2Assignment1 {

	public static void main(String[] args) {
		// find the largest element in the array
		int arr[]= {100,20,100,5000,90,200};
		int j;
		for(int i=0;i<6;i++)
		{
			j=i+1;
			
			if(j==6)
			{
				break;
			}
			if(arr[i]>arr[j])
			{
			
			int num=arr[j];
			arr[j]=arr[i];
			arr[i]=num;
			}
		}
		System.out.println(arr[5]);
		
	}

}
