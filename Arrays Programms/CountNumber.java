import java.util.Scanner;
import java.util.Arrays;
class CountNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size: ");
		int size=sc.nextInt();

		System.out.println("Enter a Elemnet: ");
		int[]arr=new int [size];
		
		for (int i=0;i<size;i++ ) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter The Num You Want to Get The Count: ");
		int num=sc.nextInt();
		int count=0;
		for (int i=0;i<size ;i++ ) 
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		System.out.println("Cont Of number Is : "+count);
	}
}