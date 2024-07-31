// Write a java program to find the Second Largest element from an array using sorting.
// Arr[]={32,12,76,23,28};
// Output: 32

import java.util.Arrays;
class SecondLargeEleSort
{
	public static void main(String[] args) 
	{
		int arr[]={32,12,76,23,28};
		Arrays.sort(arr);
		int secondLarge=arr[arr.length-2];
		System.out.println("The Second Large Element is: "+secondLarge);
	}
}