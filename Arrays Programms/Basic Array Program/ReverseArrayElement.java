// Reverse elementsin an array.
import java.util.Arrays;
class ReverseArrayElement
{
	public static void main(String[] args) 
	{
		int[]arr={1,2,3,4,5,6};
		
		System.out.print("Original Array: ");
		System.out.print(Arrays.toString(arr)+" ");

		System.out.println();

		System.out.print("Reverse Array: ");
		for (int i=arr.length-1;i>=0;i--) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}