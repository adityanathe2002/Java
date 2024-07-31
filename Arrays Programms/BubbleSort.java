import java.util.*;
class BubbleSort
{
	public static void main(String[] args) 
	{
		int []arr={7,8,3,2,1};      //  [1,2,3,7,8]
		int indx=0;
		for (int i=0;i<=arr.length-1;i++) //
		{
			for(int j=i+1;j<arr.length;j++)  // compare with that next element 
			{
				if(arr[i]>arr[j])   // checking the element which is higher , lower, 
				{
					indx=arr[i];    // 
					arr[i]=arr[j];  // swaping the elements to check highest element
					arr[j]=indx;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}