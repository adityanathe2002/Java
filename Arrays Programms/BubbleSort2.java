// import java.util.*;
// class BubbleSort2
// {

// 	public static void main(String[] args) 
// 	{
// 		int[] arr={9,3,1,2,11,2};
// 		int indx=0;
// 		for(int i=0;i<arr.length-1;i++)
// 		{
// 			for(int j=i+1;j<arr.length;j++)
// 			{
// 				if(arr[i]>arr[j])
// 				{
// 					indx=arr[i];
// 					arr[i]=arr[j];
// 					arr[j]=indx;
// 				}
// 			}
// 			System.out.println(Arrays.toString(arr));
// 		}
// 		System.out.println(Arrays.toString(arr));
// 	}
// }

import java.util.*;
class BubbleSort2
{
	public static void main(String[] args) 
	{
		int[] arr={10,9,6,3,2,1};
		int indx;
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					indx=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=indx;
				}
			}

			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr)+" : output");
	}
}
