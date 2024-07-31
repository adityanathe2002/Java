// Write a java program to Print elements from 2D array using for-each loop.
class ArrayForEach2D
{
	public static void main(String[] args) 
	{
		int [][]arr={{1,2,3},{4,5,6}};

		for (int[] i:arr) 
		{
			for (int j:i) 
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}