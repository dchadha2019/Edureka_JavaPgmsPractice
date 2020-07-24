package Module2;

public class Mod2Assignment3 {

	public static void main(String[] args) {
		// Sort an array in ascending order
int arr[]= {100,2,50,200,25,10000};
int tempnum;
	for(int n=0;n<6;n++)
	{
		int j=1;
		for(int i=0;i<6;i++)
		{
			if(j==6)
			{
				break;
			}
			if(arr[i]>arr[j])
			{
				tempnum=arr[j];
				arr[j]=arr[i];
				arr[i]=tempnum;	
			}
			j++;
		}
		
	}
	for(int k=0;k<6;k++)
	{
		System.out.println("The array in ascending order: " + arr[k]);
	}
	
	}

}
