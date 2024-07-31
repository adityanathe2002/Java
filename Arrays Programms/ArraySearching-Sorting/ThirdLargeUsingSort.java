// Write a java program to find the Third Largest element from an array using sorting.
// Arr[]={32,54,76,23,2};
// Output:32

import java.util.Arrays;
class ThirdLargeUsingSort
{
	public static void main(String[] args) 
	{
		int arr[]={32,54,76,23,2};
		Arrays.sort(arr);
		int thirdLarge=arr[arr.length-3];
		System.out.println("Third large Element is: "+thirdLarge);
	}
}