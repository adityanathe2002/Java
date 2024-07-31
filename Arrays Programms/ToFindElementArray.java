import java.util.*;
class ToFindElementArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]={11,12,13,14,15,16,17,18,19,11};
		System.out.print("Enter a Number: ");
		int key=sc.nextInt();
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("The Element Found In Position "+(i+1));
				System.out.println("*** EWWWWWW *****");
				flag=false;
				// break;
				// if we want to print duplicate element position simply dont use break 
			}
		}
		if(flag)
		{
			System.out.println("Element Not Found "+key);
		}
	}
}