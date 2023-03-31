
import java.util.Scanner;

public class Matrix_add{


	public static void main(String[] args){
	
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the diamension Of matrix M*N");
	 	m=sc.nextInt();
		n=sc.nextInt();
		int[][] mat1=new int[m][n];
		int[][] mat2=new int[m][n];
		int[][] mat=new int[m][n];
		System.out.println("Enter the First matrix :");
		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				mat1[i][j]=sc.nextInt();

			}
		}

		System.out.println("Enter the Second matrix :");
		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				mat2[i][j]=sc.nextInt();

			}
		}

		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				mat[i][j]=mat1[i][j]+mat2[i][j];

			}
		}

		System.out.println("The matrix IS:");

		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				System.out.print(mat[i][j]+" ");

			}
		System.out.println("");
		
		}


	

	}

}
