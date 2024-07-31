// Write a java program to Print elements from 3D array using while-loop.
class ArrayWhileLoop3D
{
	public static void main(String[] args) 
	{
		int[][][] arr={{{1,2},{3,4}},{{5,6},{7,8}}};
		
		int i=0;
		while(i<arr.length)
		{
			int j=0;
			while(j<arr[i].length)
			{
				int k=0;
				while(k<arr[i][j].length)
				{
					System.out.print(arr[i][j][k++] +" ");
				}j++;
				System.out.println();
			}i++;
		}
	}
}