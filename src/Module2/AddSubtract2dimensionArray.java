package Module2;

public class AddSubtract2dimensionArray {

	public static void main(String[] args) {
		// Add, subtract two dimensional array of 2x2 matrix
	
	int num[][]= {{1,2},{3,4}};
	int sum,j,diff;
	
	for(int i=0;i<2;i++)
	{
		sum=0;
		j=0;
		System.out.print("Sum of " + num[i][j]);
		sum=sum + num[i][j];
		
		for(j=1;j<2;j++)
		{
			
		System.out.print(" and "+ num[i][j]+" is:");
			sum = sum + num[i][j];
			System.out.println(sum);
		}
	}
	
	for(int i=0;i<2;i++)
	{
		diff=0;
		j=0;
		System.out.print("Difference of " + num[i][j]);
		diff=num[i][j] - diff;
		
		for(j=1;j<2;j++)
		{
			
		System.out.print(" and "+ num[i][j]+" is:");
			diff = num[i][j] - diff;
			System.out.println(diff);
		}
	}
	
	
	}
}
