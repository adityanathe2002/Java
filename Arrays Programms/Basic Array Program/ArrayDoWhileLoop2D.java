// Write a java program to Print elements from 2D array using do-while loop
class ArrayDoWhileLoop2D
{
	public static void main(String[] args) 
	{
		int[][]arr={{1,2,3},{4,5,6}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(arr[i][j++]+" ");
			}
			while(j<arr[i].length);
			i++;
		}
		while(i<arr.length);
	}
}