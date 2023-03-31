import java.util.Scanner;

class Evenod{
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter  number:");
		int r=read.nextInt();
		if(r%2==0)
		{
			System.out.println("The number is even");		
		}
		else
		{
			System.out.println("The number is odd");
		}

	}
}

