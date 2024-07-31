// Find even elements and store it in a new array.

import java.util.Arrays;
class StoreEvenInArray
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,3,4,5,6};
		int count=0;
		for (int i:arr) 
		{
			if(i%2==0)
				count++;
		}
		int []evenNumber=new int[count];
		int indx=0;
		for (int i:arr) 
		{
			if(i%2==0)
				evenNumber[indx++]=i;
		}
		System.out.print("Even Number: "+Arrays.toString(evenNumber));
	}
}