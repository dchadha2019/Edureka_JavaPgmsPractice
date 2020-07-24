package Module2;

public class Transposematrix {

	public static void main(String[] args) {
		// Transpose a matrix
		int matrix[][] = {{1,2,3},
						  {4,5,6},
						  {7,8,9}};
		int tempvar;
		
		int newmatrix[][]=new int[3][3];
		
		System.out.println("The original matrix is: ");
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+ " ");
				
				newmatrix[j][i]=matrix[i][j];
			}
			System.out.println();
		}
		
		System.out.println("The new transposed matrix is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		System.out.print(newmatrix[i][j]+ " ");
			}
			System.out.println();
		}
		
		

	}

}
