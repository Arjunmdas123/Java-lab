import java.util.*;

class sort{
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the string to be sorted");
		String a = read.nextLine();
		char temp[]=a.toCharArray();
		Arrays.sort(temp);
		System.out.println(new String(temp));
	}
}


