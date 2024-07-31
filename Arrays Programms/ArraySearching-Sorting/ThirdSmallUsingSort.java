// Write a java program to find the Third Smallest element from an array using sorting.
// Arr[]={7, 44, 21,45,35};
// Output: 35

import java.util.Arrays;
class ThirdSmallUsingSort
{
	public static void main(String[] args) 
	{
		int arr[]={7, 44, 21,45,35};
		Arrays.sort(arr);
		int thirdSmall=arr[2];
		System.out.println("Third Smallest Element is: "+thirdSmall);
	}
}