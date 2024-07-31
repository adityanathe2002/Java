// //wajp to merge a two array in one single array

import java.util.Arrays;
import java.util.Scanner;
class MergeArrays
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size 1: ");
		int size1=sc.nextInt();
		System.out.println("Enter an Element: ");
		int[] arr1=new int [size1];

		for (int i=0;i<size1 ;i++ ) 
		{
			arr1[i]=sc.nextInt();
		}


		System.out.println("Enter Array Size 2: ");
		int size2=sc.nextInt();
		System.out.println("Enter A Element: ");
		int arr2[] =new int[size2];

		for (int i=0;i<size2 ;i++ ) 
		{
			arr2[i]=sc.nextInt();
		}

		int mergedArraySize=size1+size2;
		int[]mergedArray=new int[mergedArraySize];

		for (int i=0;i<size1 ;i++ ) 
		{
			mergedArray[i]=arr1[i];
		}
		for(int i=0;i<size2;i++)
		{
			mergedArray[size1+i]=arr2[i];
		}
		System.out.println("Array First: " +Arrays.toString(arr1));
		System.out.println("Array Second: " +Arrays.toString(arr2));
		System.out.println("Merged Array: " +Arrays.toString(mergedArray));

	}
}	