import java.util.*;
class SearchString
{
	public static void main(String args[])
	{	
		int i,j,flag =0,pos=0,k;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number to be stored in Array");
		int s=sc.nextInt();
		int arr[] = new int[s];
		
		System.out.println("Enter the numbers to be stored");
		for(i=0;i<s;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number to be searched");
		k= sc.nextInt();
	
		for(i=0;i<s;i++)
		{
			
			if(arr[i]==k)
			{
				flag=1;
				break;
			}
		pos++;
		}
		
		if(flag ==1)
		{
			System.out.println("The number found at position "+(pos+1)+" in the array");
		}
		else
		{
			System.out.println("Number not found");
		}
	}
}
