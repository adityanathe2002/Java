//Write a java program to create a subarray from an array.

// import java.util.Arrays;

// class SubArray {
//     public static void main(String[] args) 
//     {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
//         int startIndx = 2;
//         int endIndx = 5;

//         // Create the subarray with the correct length
//         int[] subArray = new int[endIndx - startIndx];

//         // Fill the subarray with elements from the original array
//         for (int i = startIndx; i < endIndx; i++) 
//         {
//             subArray[i - startIndx] = arr[i];
//         }

//         // Print the subarray
//         System.out.println(Arrays.toString(subArray));
//     }
// }


import java.util.Arrays;
class SubArray
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,4,5,6,7,8,9};
	
		int startIndx=2;
		int endIndx=5;
		
		int[]subArray=new int [5-2];
		for (int i=2;i<5;i++) 
		{
			subArray[i-2]=arr[i];
		}
		System.out.println(Arrays.toString(subArray));
	}
}
