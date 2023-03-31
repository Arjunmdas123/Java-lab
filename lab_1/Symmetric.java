
import java.util.*;

public class Symmetric{

	static void checkSymmetric(int mat[][], int row, int col)
	{
		int i, j, flag = 1;

		System.out.println("The matrix formed is:");

		for (i = 0; i < row; i++) {
	
			for (j = 0; j < col; j++) {
			
				System.out.print(mat[i][j] + "\t");
			}

			System.out.println("");
		}


		int[][] transpose = new int[row][col];

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {

				transpose[j][i] = mat[i][j];
			}
		}


		if (row == col) {

			for (i = 0; i < row; i++) {


				for (j = 0; j < col; j++) {


					if (mat[i][j] != transpose[i][j]) {
						flag = 0;
						break;
					}
				}
			}


			if (flag == 0) {
				// Display message
				System.out.print("\nThe matrix is not symmetric");
			}


			if (flag == 1) {

				System.out.print("\nThe matrix is symmetric");
			}
		}

		else {
			System.out.print("\nThe matrix is not symmetric");
		}

	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		int i, j, row, col;

		System.out.print("Enter the number of rows:");
		row = sc.nextInt();

		System.out.print("Enter the number of columns:");

		col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Enter the matrix elements:");

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {

				mat[i][j] = sc.nextInt();
			}
		}

		if(row == col)
		{
			checkSymmetric(mat, row, col);
		}

		else{
			System.out.println("The matrix formed is:");

			for (i = 0; i < row; i++) {
		
				for (j = 0; j < col; j++) {
				
					System.out.print(mat[i][j] + "\t");
				}
	
				System.out.println("");
			}
			
			System.out.println("Not Symmetric");
		}

	}
}
