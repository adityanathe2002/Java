// Write a java program to Print elements from 1D array using do- while loop.

class ArrayDoWhileLoop1D
{
	public static void main(String[] args) 
	{
		int[]arr={1,2,3,4,5,6};

		int i=0;
		
		do
		{
			System.out.print(arr[i++]+" ");
		}
		while(i<arr.length);
	}
}