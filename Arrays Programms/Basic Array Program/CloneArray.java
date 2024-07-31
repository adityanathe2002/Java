// clone the Array

import java.util.Arrays;
class CloneArray
{
	static int cloneCount=0;
	public static void main(String[] args) 
	{
		int[] arr={4,5,6};
		int [] cloneArray;

		for (int i=0;i<arr.length;i++) 
		{
			cloneCount ++;
		}
		cloneArray=new int [cloneCount];
		int indx=0;
		for(int i=0;i<arr.length;i++)
		{
			cloneArray[indx++]=arr[i];
		}
		System.out.println(Arrays.toString(cloneArray));
	}
}