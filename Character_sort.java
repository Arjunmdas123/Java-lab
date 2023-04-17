import java.util.*;

class Character_Sort{
	
	public static void main(String[] args){
		
		Scanner read=new Scanner(System.in);

		System.out.println("Enter the String Want to sort");

		String strin=read.nextLine();

		char words[]=strin.toCharArray();

		Arrays.sort(words);
	
		System.out.println(new String(words));

	}
}
