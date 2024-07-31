// Write a java program to Print elements from 2D array using whileloop.
class ArrayWhileLoop2D
{
	public static void main(String[] args) 
	{
		int[][]arr={{1,2,3},{4,5,6}};
		int i=0;
		while(i<arr.length)
		{
			int j=0;
			while(j<arr[i].length)
			{
				System.out.print(arr[i][j++]+" ");
			}
			i++;
		    System.out.println();
		}
	}
}