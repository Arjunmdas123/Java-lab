import java.util.Scanner;
	
import java.math.BigDecimal;

class Std{
		
	
	public static void main(String[] args){
		
		Scanner read=new Scanner(System.in);

		System.out.println("Enter the number of subject");

		int n=read.nextInt();
		
		double [] marks=new double[n];

		BigDecimal num=new BigDecimal("100");
		BigDecimal den=new BigDecimal((n*100)+"");
		
		BigDecimal perc=num.divide(den);		

		System.out.println("Enter the Student Marks (100):");
	
		double tot=0;		
		
		for(int i=0;i<n;i++){
		
			double m=read.nextInt();
			tot+=m;
			marks[i]=m;	
		}
		
		System.out.println("Total mark for "+n+" subject is "+tot);
		System.out.println("Percantage of "+n+" subject is "+(tot*Double.parseDouble(perc+"")));

	}

	
}
