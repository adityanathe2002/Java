import java.util.*;
class FindDuplicateArray
{
	public static void main(String[] args) 
	{
		// int[] arr={6,5,4,6,5,8,6,4};
		int[]arr={1,2,3,3,4,1,5,3};
		int count=0;
		for (int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					System.out.println(arr[j]);
				}
			}
		}
		System.out.println("Count Of Duplicate: "+count);
	}
}