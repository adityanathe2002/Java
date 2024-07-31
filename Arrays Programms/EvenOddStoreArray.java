// wajp to store even and odd element in two differernt element
import java.util.*;
class EvenOddStoreArray
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5,6,7,8,9,10};
		int evenCount=0;
		int oddCount=0;

		for (int i:a ) 
		{
			if(i%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		int[]evenNumber=new int [evenCount];
		int[]oddNuumber=new int[oddCount];
		int indx1=0;
		int indx2=0;
		for (int j:a ) 
		{
			if(j%2==0)
			{
				evenNumber[indx1++]=j;
			}
			else
			{
				oddNuumber[indx2++]=j;
			}
		}
		System.out.println("Even Array : "+Arrays.toString(evenNumber));
		System.out.println("Odd Array: "+Arrays.toString(oddNuumber));
	}
}