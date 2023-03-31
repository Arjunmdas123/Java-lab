import java.util.Scanner;
class Leap_year{

	
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter start Year");
	
		int start=sc.nextInt();
		
		System.out.println("Enter End Year");

		int end=sc.nextInt();

		System.out.println("Leap years");
		
		for(int i=start;i<=end;i++){
	
	
			if((i%400==0 && i%100==0) || (i%4==0 && i%100!=0)){
				
				System.out.println(i);				
				
			}
		
		}

	}	

}
