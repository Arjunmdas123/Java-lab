import java.util.*;
class StringManipulation
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);

	System.out.println("------------STRING MANIPULATION METHODS--------------");
	System.out.println("Enter 1st string: ");
	String str1=sc.nextLine();
	System.out.println("Enter 2nd string: ");
	String str2=sc.nextLine();
	String str3=str1.concat(str2);
	System.out.println("After String concatenation: " + str3);

	System.out.println("Length of concatnated string is : "+ str3.length());
	System.out.println(str3+" converted to uppercase : "+ str3.toUpperCase());
	System.out.println(str3+" after replacing all occurence of a to l : "+str3.replace('a','l'));
	char ch[]=str3.toCharArray();
	for(int i=0;i<ch.length;i++)
	{	
		System.out.println("character at "+(i+1)+" is "+ch[i]);		
	}

	System.out.println("Index position of the substring "+str2+" is "+str3.indexOf(str2));

	System.out.println("----------------StringBuffer CLASS METHODS--------------");
	System.out.println("Enter 1st string: ");
	String temp=sc.nextLine();
	StringBuffer str=new StringBuffer(temp);
	System.out.println("Enter 2nd string: ");
	String temp1=sc.nextLine();

	str.append(temp1);
	System.out.println(temp+" after String concatenation: " + str);

	System.out.println("Length of string :"+str1+" is "+str1.length());

	System.out.println("Enter a substring to be inserted: ");
	String temp2=sc.nextLine();
	System.out.println("Enter the position where the substring need to be inserted: ");
	int pos =sc.nextInt();
	str.insert(pos,temp2);
	System.out.println("Changed string : "+str);
	}
}
