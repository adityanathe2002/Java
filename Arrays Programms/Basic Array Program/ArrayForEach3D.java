//  Write a java program to Print elements from 3D array using for-each loop.
class ArrayForEach3D
{
	public static void main(String[] args) {
		int [][][]arr={{{1,2},{3,4}},{{5,6},{7,8}}};

		for (int[][]i:arr ) 
		{
			for (int[] j: i) 
			{
				for (int k: j) 
				{
					System.out.print(k+" ");
				}
			}
		}
	}
}