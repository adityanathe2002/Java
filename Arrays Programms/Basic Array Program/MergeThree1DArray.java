// Merge Three 1D arrays.

import java.util.Arrays;
class MergeThree1DArray
{
	public static void main(String[] args) 
	{
		int []a={1,2,3};
		int []b={4,5,6};
		int []c={7,8,9};

		int size=a.length+b.length+c.length;
		int []mergedArray=new int[size];
		for (int i=0;i<a.length;i++) 
		{
			mergedArray[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			mergedArray [b.length+i] =b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			mergedArray[c.length+b.length+i]=c[i];
		}
		System.out.print(Arrays.toString(mergedArray));
	}
}