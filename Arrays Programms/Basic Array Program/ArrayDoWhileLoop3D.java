// Write a java program to Print elements from 3D array using do-while loop
class ArrayDoWhileLoop3D
{
	public static void main(String[] args) 
	{
		int [][][]arr={{{1,2},{3,4}},{{5,6},{7,8}}};

		int i=0;
		do
		{
			int j=0;
			do
			{
				int k=0;
				do
				{
					System.out.print(arr[i][j][k++] +" ");
				}
				while(k<arr[i][j].length);
				j++;
			}
			while(j<arr[i].length);
			 i++;
		}
		while(i<arr.length);
	}
}