// Write a java program to find the smallest element from an array using sorting.
// Arr[]={32,54,76,23,2};
// Output: 2

import java.util.Arrays;
class SmallestEleUsingSort
{
	public static void main(String[] args) 
	{
		int arr[]={32,54,76,23,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int smallestelement=arr[0];
		System.out.println(smallestelement);
	}
}