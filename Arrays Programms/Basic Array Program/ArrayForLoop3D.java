// Write a java program to Print elements from 3D array using for loop.
class ArrayForLoop3D
{
	public static void main(String[] args) 
	{
		int[][][] arr={{{1,2},{3,4}},{{5,6},{7,8}}};

		for (int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
			}
		}
	}
}