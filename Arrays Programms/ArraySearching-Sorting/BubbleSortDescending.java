// import java.util.Arrays;
// class BubbleSortDescending
// {
// 	public static void main(String[] args) 
// 	{
// 		int[] arr={10,9,6,3,2,1};
// 		int indx;
// 		for(int i=0;i<arr.length-1;i++)
// 		{
// 			for(int j=0;j<arr.length-i-1;j++)     // compare with that next element 
// 			{
// 				if(arr[j]<arr[j+1])           // checking the element which is higher , lower
// 				{
// 					indx=arr[j];
// 					arr[j]=arr[j+1];        // swaping the elements to check highest element
// 					arr[j+1]=indx;
// 				}
// 			}
// 			// System.out.println(Arrays.toString(arr));
// 		}
// 		System.out.println("Output: "+Arrays.toString(arr));
// 	}
// }

import java.util.Arrays;
class BubbleSortDescending
{
	public static void main(String[] args) 
	{
		int [] a={4,2,1,3};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void bubbleSort(int []a)
	{
		for (int i=0;i<a.length;i++ ) 
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int indx =a[i];
					a[i]=a[j];
					a[j]=indx;
				}
			}
		}
	}
}