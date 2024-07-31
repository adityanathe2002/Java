// WAJP to Sort The element in Assending Order

import java.util.Scanner;
import java.util.Arrays;
class SortArrayAscending
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size: ");
		int size=sc.nextInt();

		System.out.println("Enter an Element: ");
		int []arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int indx=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					indx=arr[i];
					arr[i]=arr[j];
					arr[j]=indx;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}