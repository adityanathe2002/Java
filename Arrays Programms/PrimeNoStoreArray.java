import java.util.Scanner;
class PrimeNoStoreArray
{
	public static void main(String[] args) 
	{
		int[]arr={2,8,5,4,7,9,13,14,15,16,17};   // --> 11

		for (int i=0;i<arr.length;i++)         // i--> 0
		{
			int count=0;                       // count --> 0
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)   
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}