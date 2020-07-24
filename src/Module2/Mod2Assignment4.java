package Module2;

public class Mod2Assignment4 
{
	public static void main(String[] args)
	{
		// Display largest element in an array without sorting the array (version 1)
		int arr[]= {200,900,100,3000,400};
		int i=0,j=1,c=1;
		for(;j<=4;)
		{
			if(arr[i]>arr[j])
			{
				if(c==4)
				{
					System.out.println("The largest num is:"+arr[i]);
					break;
				}
				
				j++;
				
				if(arr[i]==arr[j])
				{
					j++;
				}
				c++;
				continue;
			}
			else
			{
				c=1;
				i++;
				j=0;
			}
		}
	}		
		
}	
		


