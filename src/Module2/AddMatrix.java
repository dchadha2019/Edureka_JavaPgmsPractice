package Module2;

public class AddMatrix {

	public static void main(String[] args) {
		// Add all the elements of the matrix
		int matrix[][]= {{1,1,1},
						 {1,1,1},
						 {1,1,1}};
		
		int totalsum=0;
		System.out.println("Matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]);
				totalsum=totalsum + matrix[i][j];
			}
			System.out.println();
		}
		System.out.println("The total sum of all the elements of the matrix is: "+ totalsum);
	}

}
