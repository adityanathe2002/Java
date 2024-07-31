// Write a java program to find the Second Smallest element from an array using sorting.
// Arr[]={7, 44, 21,45,35};
// Output: 44

import java.util.Arrays;
class SecondSmallUsingSort
{
	public static void main(String[] args) {
		int[]arr={7,44,21,45,35};
		Arrays.sort(arr);
		int secondSmall=arr[1];
		System.out.println("Second Smallest Element is: "+secondSmall);
	}
}