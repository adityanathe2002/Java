// Write a java program to find the largest element from an array using sorting.
// Arr[]={32,54,76,23,2};
// Output: 76

import java.util.Arrays;
 public class LargestEleUsingSorting
{
	public static void main(String[] args) 
	{	
		int arr[]={32,54,76,23,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int largestElement = arr[arr.length - 2];
		System.out.println("The largest element is: " + largestElement);
	}	
}