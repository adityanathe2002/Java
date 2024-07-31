// Merge two 1D arrays.

import java.util.Arrays;
class MergeTwo1DArray
{
	public static void main(String[] args) 
	{
		int []a={1,2,3};
		int []b={4,5,6};

		int c = a.length+a.length;
		int []mergedArray=new int[c];
		for (int i=0;i<a.length;i++ ) 
		{
			mergedArray[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			mergedArray[b.length+i]=b[i];
		}
		System.out.print(Arrays.toString(mergedArray));
	}
}

// output --> {1,2,3,4,5,6,}